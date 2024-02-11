package com.jayyong.board.controller.dto

data class PostUpdateRequest(
    val title: String,
    var content: String,
    var updatedBy: String,
)
