package com.sample.seungdols.domain.vo

data class Comment(
  val commentId: Int = -1,
  val boardId: Int = -1,
  val writer: String = "",
  val content: String = ""
)