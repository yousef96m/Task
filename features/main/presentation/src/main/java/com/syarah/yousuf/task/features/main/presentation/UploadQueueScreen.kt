package com.syarah.yousuf.task.features.main.presentation

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus

@Composable
fun UploadQueueScreen(viewModel: UploadQueueViewModel = hiltViewModel()) {
    val uploads by viewModel.uploads.collectAsState()
    val context = LocalContext.current
    val selectedImages = remember { mutableStateListOf<Uri>() }

    val galleryLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            if (!selectedImages.contains(it) && uploads.none { u -> u.uri == it.toString() }) {
                selectedImages.add(it)
            }
        }
    }

    LaunchedEffect(uploads) {
        val completedUris = uploads
            .filter { it.status == UploadStatus.COMPLETED }
            .map { it.uri }

        selectedImages.removeAll { uri ->
            completedUris.contains(uri.toString())
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { galleryLauncher.launch("image/*") }
            ) { Text("Select Image") }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("uploadButton"),
                onClick = {
                    selectedImages.forEach { viewModel.addImage(it) }
                    viewModel.startQueuedUploads(context)
                }
            ) { Text("Start Uploads") }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { viewModel.pauseAllUploads() }
            ) { Text("Pause All") }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { viewModel.resumeAllUploads(context) }
            ) { Text("Resume All") }
        }

        if (selectedImages.isNotEmpty()) {
            Column {
                Text(
                    text = "Selected Images",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    selectedImages.forEach { uri ->
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                        ) {
                            AsyncImage(
                                model = uri,
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            IconButton(
                                onClick = { selectedImages.remove(uri) },
                                modifier = Modifier
                                    .size(20.dp)
                                    .align(Alignment.TopEnd)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Remove",
                                    tint = Color.Red
                                )
                            }
                        }
                    }
                }
            }
        }

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(uploads.sortedByDescending { it.id }) { upload ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                    ) {
                        AsyncImage(
                            model = upload.uri,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        if (upload.status == UploadStatus.UPLOADING) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.Black.copy(alpha = 0.4f)),
                                contentAlignment = Alignment.Center
                            ) {
                                CircularProgressIndicator(
                                    color = Color.White,
                                    modifier = Modifier.size(24.dp),
                                    strokeWidth = 2.dp
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = upload.fileName,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = upload.status.name,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    when (upload.status) {
                        UploadStatus.QUEUED, UploadStatus.UPLOADING -> {
                            IconButton(onClick = {
                                viewModel.cancelUpload(upload.id, context)
                            }) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Cancel",
                                    tint = Color.Red
                                )
                            }
                        }

                        UploadStatus.FAILED -> {
                            Button(onClick = {
                                viewModel.startQueuedUploads(context)
                            }) {
                                Text("Retry")
                            }
                        }

                        else -> {}
                    }
                }
            }
        }
    }
}
