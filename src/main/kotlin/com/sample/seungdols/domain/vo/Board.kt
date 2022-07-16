package com.sample.seungdols.domain.vo

data class Board(
  val boardId: Int,
  val title: String,
  val content: String,
  val comments: List<Comment>
)