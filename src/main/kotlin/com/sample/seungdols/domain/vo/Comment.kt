package com.sample.seungdols.domain.vo

data class Comment(
  val commentId: Int,
  val boardId: Int,
  val wrtier: String,
  val content: String
)