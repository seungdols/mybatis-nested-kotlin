package com.sample.seungdols.domain.vo

import com.sample.seungdols.annotation.NoArg

@NoArg
data class Comment(
  val commentId: Int,
  val writer: String,
  val content: String
)