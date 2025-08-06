package com.syarah.yousuf.task.features.main.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "upload_queue")
data class UploadEntity(
    @PrimaryKey val id: String,
    val uri: String,
    val status: String,
    val fileName: String,
    val progress: Int,

    @ColumnInfo(name = "work_id")
    val workId: String?,

    @ColumnInfo(name = "is_paused")
    val isPaused: Boolean = false,

)
