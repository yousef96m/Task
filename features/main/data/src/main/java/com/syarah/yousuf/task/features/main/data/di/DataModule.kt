package com.syarah.yousuf.task.features.main.data.di

import com.syarah.yousuf.task.features.main.data.remote.RemoteUploadDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DataModule {

    @Provides
    @Singleton
    fun provideUploadRepository(retrofit: Retrofit): RemoteUploadDataSource {
        return retrofit.create(RemoteUploadDataSource::class.java)
    }
}
