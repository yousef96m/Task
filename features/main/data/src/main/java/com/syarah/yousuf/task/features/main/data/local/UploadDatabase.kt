package com.syarah.yousuf.task.features.main.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.syarah.yousuf.task.features.main.data.dao.UploadDao

@Database(
    entities = [UploadEntity::class],
    version = 3,
    exportSchema = false
)

abstract class UploadDatabase : RoomDatabase() {
    abstract fun uploadDao(): UploadDao
}
