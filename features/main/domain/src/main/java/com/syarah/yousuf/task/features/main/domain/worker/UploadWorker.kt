package com.syarah.yousuf.task.features.main.domain.worker

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.ServiceInfo
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.net.toUri
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.WorkerParameters
import com.syarah.yousuf.features.main.domain.R
import com.syarah.yousuf.task.features.main.domain.usecase.UploadImageUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@HiltWorker
class UploadWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val uploadImageUseCase: UploadImageUseCase
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        setForeground(createForegroundNotificationInfo())

        return withContext(Dispatchers.IO) {
            val id = inputData.getString("id") ?: return@withContext Result.failure()
            val uriString = inputData.getString("uri") ?: return@withContext Result.failure()
            val uri = uriString.toUri()

            return@withContext try {
                val success = uploadImageUseCase(uri, id)
                if (success) Result.success() else Result.retry()
            } catch (e: Exception) {
                Result.retry()
            }
        }
    }

    private fun createForegroundNotificationInfo(): ForegroundInfo {
        val notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel = NotificationChannel(
            CHANNEL_ID,
            "Upload Service",
            NotificationManager.IMPORTANCE_LOW
        )
        notificationManager.createNotificationChannel(channel)

        val notification = NotificationCompat.Builder(applicationContext, CHANNEL_ID)
            .setContentTitle("Uploading image...")
            .setSmallIcon(R.drawable.ic_launcher_round)
            .setOngoing(true)
            .build()

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ForegroundInfo(
                NOTIFICATION_ID,
                notification,
                ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC
            )
        } else {
            ForegroundInfo(NOTIFICATION_ID, notification)
        }
    }

    companion object {
        private const val CHANNEL_ID = "upload_channel"
        private const val NOTIFICATION_ID = 101
    }
}
