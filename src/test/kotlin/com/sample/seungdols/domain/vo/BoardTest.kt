package com.sample.seungdols.domain.vo

import com.sample.seungdols.domain.BoardMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest
import org.springframework.test.context.TestConstructor

@MybatisTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class BoardTest(
  val boardMapper: BoardMapper
) {

  @Test
  fun `boardMapper is not null`() {
    assertThat(boardMapper).isNotNull
  }

  @Test
  fun `nested select 형태로 가져온다`() {
    val boardId = 1
    val board = boardMapper.getBoardById(boardId)

    assertThat(board).isNotNull
    assertThat(board.boardId).isEqualTo(boardId)
    assertThat(board.comments).isNotEmpty
  }

  @Test
  fun `nested result 형태로 가져 온다`() {
    val boardId = 1

    val board = boardMapper.selectBoardWithComment(boardId)

    assertThat(board.comments.size).isGreaterThan(0)
  }
}