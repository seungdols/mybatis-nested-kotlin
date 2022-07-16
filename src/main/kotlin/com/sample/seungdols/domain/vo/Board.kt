package com.sample.seungdols.domain.vo

import com.sample.seungdols.annotation.NoArg

@NoArg
data class Board(
  val boardId: Int,
  val title: String,
  val content: String,
  val comments: List<Comment>
)