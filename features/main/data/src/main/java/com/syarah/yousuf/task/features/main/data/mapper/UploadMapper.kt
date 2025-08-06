package com.syarah.yousuf.task.features.main.data.mapper

import com.syarah.yousuf.task.features.main.data.local.UploadEntity
import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import javax.inject.Inject

class UploadMapper @Inject constructor() {

    fun entityToDomain(entity: UploadEntity): UploadItem = UploadItem(
        id = entity.id,
        uri = entity.uri,
        status = UploadStatus.valueOf(entity.status),
        progress = entity.progress,
        fileName = entity.fileName
    )

    fun domainToEntity(model: UploadItem): UploadEntity = UploadEntity(
        id = model.id,
        uri = model.uri,
        status = model.status.name,
        progress = model.progress,
        fileName = model.fileName,
        workId = model.workId
    )
}
