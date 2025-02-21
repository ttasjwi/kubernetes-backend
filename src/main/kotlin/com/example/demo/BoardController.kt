package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(
    private val boardService: BoardService
) {

    @GetMapping("/boards")
    fun getBoards(): List<Board> {
        return boardService.getBoards()
    }

    @PostMapping("/boards")
    fun writeBoard(@RequestBody board: Board) {
        return boardService.writeBoard(board)
    }
}
