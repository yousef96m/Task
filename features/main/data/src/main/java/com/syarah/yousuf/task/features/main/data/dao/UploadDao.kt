package com.syarah.yousuf.task.features.main.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.syarah.yousuf.task.features.main.data.local.UploadEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UploadDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: UploadEntity)

    @Query("SELECT * FROM upload_queue ORDER BY rowid ASC")
    fun getAll(): Flow<List<UploadEntity>>

    @Query("UPDATE upload_queue SET status = :status WHERE id = :id")
    suspend fun updateStatus(id: String?, status: String)

    @Query("DELETE FROM upload_queue WHERE id = :id")
    suspend fun delete(id: String)

    @Query("UPDATE upload_queue SET work_id = :workId WHERE id = :id")
    suspend fun updateWorkId(id: String, workId: String)

    @Query("UPDATE upload_queue SET is_paused = :paused")
    suspend fun setAllPaused(paused: Boolean)

    @Query("SELECT * FROM upload_queue WHERE status = 'QUEUED' AND is_paused = 0")
    fun getActiveUploads(): Flow<List<UploadEntity>>

    @Query("UPDATE upload_queue SET is_paused = 1 WHERE status = 'QUEUED'")
    suspend fun pauseAllUploads()

    @Query("UPDATE upload_queue SET status = :newStatus WHERE status IN (:oldStatuses)")
    suspend fun updateStatuses(oldStatuses: List<String>, newStatus: String)

    @Query("SELECT * FROM upload_queue WHERE status IN (:statuses)")
    suspend fun getByStatuses(statuses: List<String>): List<UploadEntity>
}
