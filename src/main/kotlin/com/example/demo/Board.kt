package com.example.demo

import jakarta.persistence.*

@Entity
@Table(name = "boards")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var title: String,

    var content: String,
)
