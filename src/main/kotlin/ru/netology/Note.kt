package ru.netology

data class Note(
    val id: Int,
    val ownerId: Int,
    val text: String,
    val comments: List<Comment> = emptyList()
)

data class Comment(
    val id: Int,
    val ownerId: Int,
    val text: String)
