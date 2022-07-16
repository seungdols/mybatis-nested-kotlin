package com.sample.seungdols.domain.vo

class Comment(
  val commentId: Int,
  val boardId: Int,
  val writer: String,
  val content: String
)