package com.jayyong.board.controller.dto

import com.jayyong.board.service.dto.PostCreateRequestDto

data class PostCreateRequest(
    val title: String,
    val content: String,
    val createdBy: String,
)

fun PostCreateRequest.toDto() = PostCreateRequestDto(title = title, content = content, createdBy = createdBy)
