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
  fun `1번 게시물 정보를 가져온다`() {
    val boardId = 1
    val board = boardMapper.getBoardById(boardId)

    assertThat(board).isNotNull
    assertThat(board.boardId).isEqualTo(boardId)
    assertThat(board.comments).isEmpty()
  }
}