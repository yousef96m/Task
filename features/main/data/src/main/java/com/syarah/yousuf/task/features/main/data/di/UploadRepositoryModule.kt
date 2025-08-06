package com.syarah.yousuf.task.features.main.data.di

import com.syarah.yousuf.task.features.main.data.repository.UploadRepositoryImpl
import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
internal interface UploadRepositoryModule {

    @Binds
    fun bindAuthRepository(impl: UploadRepositoryImpl): UploadRepository
}
