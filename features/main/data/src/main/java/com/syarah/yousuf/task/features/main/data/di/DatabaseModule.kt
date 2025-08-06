package com.syarah.yousuf.task.features.main.data.di

import android.content.Context
import androidx.room.Room
import com.syarah.yousuf.task.features.main.data.dao.UploadDao
import com.syarah.yousuf.task.features.main.data.local.UploadDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): UploadDatabase =
        Room.databaseBuilder(
            context,
            UploadDatabase::class.java, "upload_db"
        )
            .fallbackToDestructiveMigration(false)
            .build()

    @Provides
    fun provideUploadDao(db: UploadDatabase): UploadDao = db.uploadDao()
}
