package com.sample.seungdols.domain

import com.sample.seungdols.domain.vo.Board
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BoardMapper {
  fun getBoardById(boardId: Int): Board
}