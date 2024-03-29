package com.jayyong.board.exception

open class PostException(message: String) : RuntimeException(message)

class PostNotFoundException() : PostException(message = "게시글을 찾을 수 없습니다.")

class PostNotUpdatableException() : PostException(message = "수정할 수 없는 게시물입니다.")

class PostNotDeletableException() : PostException(message = "게시글을 삭제할 수 없습니다.")
