package com.jayyong.board.controller.dto

import com.jayyong.board.service.dto.PostUpdateRequestDto

data class PostUpdateRequest(
    val title: String,
    var content: String,
    var updatedBy: String,
)

fun PostUpdateRequest.toDto() = PostUpdateRequestDto(title = title, content = content, updatedBy = updatedBy)
