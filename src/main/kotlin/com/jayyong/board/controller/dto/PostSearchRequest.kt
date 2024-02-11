package com.jayyong.board.controller.dto

import org.springframework.web.bind.annotation.RequestParam

data class PostSearchRequest(
    @RequestParam
    val createdBy: String,
    @RequestParam
    val title: String,
)
