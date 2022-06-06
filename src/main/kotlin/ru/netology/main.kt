package ru.netology



fun main() {

    val comment1 = Comment(1,1,"text1")
    val comment2 = Comment(2,2,"text2")
    NoteService.add(Note(1,1,"Текст1", listOf(comment1)))
    NoteService.add(Note(2,2,"Текст2", listOf(comment2)))
    NoteService.update(Note(1,1,"Текст1", listOf(comment1)))
    NoteService.update(Note(2,2,"Текст2", listOf(comment2)))
    NoteService.delete(Note(1,1,"Текст1", listOf(comment1)))
    NoteService.delete(Note(2,2,"Текст2", listOf(comment2)))
    NoteService.clear()
    NoteService.addComment(Note(2,2,"Текст2", listOf(comment2)), comment1)


}