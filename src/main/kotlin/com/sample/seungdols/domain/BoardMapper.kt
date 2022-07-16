package com.sample.seungdols.domain

import com.sample.seungdols.domain.vo.Board
import com.sample.seungdols.domain.vo.Comment
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BoardMapper {
  fun getBoardById(boardId: Int): Board
  fun getCommentListById(boardId: Int): List<Comment>
  fun selectBoardWithComment(boardId: Int): Board
}