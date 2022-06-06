package ru.netology

object NoteService : BaseService<Note>() {


    override fun add(note: Note): Int {
        val updatedNote = note.copy(id = getNextId())
        items.add(updatedNote)
        return updatedNote.id

    }

    override fun update(note: Note): Boolean {
        for ((index, item) in items.withIndex()) {
            if (item.id == note.id) {
                items[index] = note
                return true
            }
        }
        return false
    }

    fun addComment(note: Note, comment: Comment) {
        for ((index, item) in items.withIndex()) {
            if (item.id == note.id) {
                items[index] = item.copy(comments = item.comments + comment)
            }

        }
    }
}