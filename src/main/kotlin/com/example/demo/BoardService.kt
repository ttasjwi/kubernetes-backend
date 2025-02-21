package com.example.demo

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BoardService(
    private val boardRepository: BoardRepository
) {

    @Transactional(readOnly = true)
    fun getBoards(): List<Board> {
        return boardRepository.findAll()
    }

    @Transactional
    fun writeBoard(board: Board) {
        boardRepository.save(board)
    }

}
