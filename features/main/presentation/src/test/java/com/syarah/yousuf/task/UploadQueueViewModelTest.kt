package com.syarah.yousuf.task

import android.net.Uri
import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import com.syarah.yousuf.task.features.main.domain.usecase.AddImageToQueueUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.GetActiveUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.GetUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.PauseAllUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.UpdateWorkIdUseCase
import com.syarah.yousuf.task.features.main.presentation.UploadQueueViewModel
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UploadQueueViewModelTest {

    private val dispatcher = StandardTestDispatcher()
    private lateinit var viewModel: UploadQueueViewModel

    private lateinit var addImageToQueue: AddImageToQueueUseCase
    private lateinit var pauseAllUploadsUseCase: PauseAllUploadsUseCase
    private lateinit var updateWorkIdUseCase: UpdateWorkIdUseCase
    private lateinit var getActiveUploadsUseCase: GetActiveUploadsUseCase
    private lateinit var getUploadsUseCase: GetUploadsUseCase

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)

        addImageToQueue = mockk(relaxed = true)
        pauseAllUploadsUseCase = mockk(relaxed = true)
        updateWorkIdUseCase = mockk(relaxed = true)
        getActiveUploadsUseCase = mockk()
        getUploadsUseCase = mockk()

        coEvery { getActiveUploadsUseCase() } returns emptyList()
        every { getUploadsUseCase() } returns flowOf(emptyList())

        viewModel = UploadQueueViewModel(
            addImageToQueue,
            getUploadsUseCase,
            mockk(relaxed = true), // updateStatusUseCase
            updateWorkIdUseCase,
            getActiveUploadsUseCase,
            pauseAllUploadsUseCase
        )
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        unmockkAll()
    }

    @Test
    fun `addImage should call usecase`() = runTest {
        val uri = mockk<Uri>()

        viewModel.addImage(uri)
        advanceUntilIdle()

        coVerify { addImageToQueue(uri) }
    }

    @Test
    fun `pauseAllUploads should trigger usecase`() = runTest {
        viewModel.pauseAllUploads()
        advanceUntilIdle()

        coVerify { pauseAllUploadsUseCase() }
    }

    @Test
    fun `resumeAllUploads should call updateWorkId`() = runTest {
        val dummyUpload = UploadItem(
            id = "1",
            uri = "file://test.jpg",
            fileName = "test.jpg",
            status = UploadStatus.QUEUED,
            progress = 0,
            workId = null
        )

        coEvery { getActiveUploadsUseCase() } returns listOf(dummyUpload)

        viewModel.resumeAllUploads(mockk())
        advanceUntilIdle()

        coVerify { updateWorkIdUseCase("1", any()) }
    }
}