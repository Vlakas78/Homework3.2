package ru.netology

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class NoteServiceTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
        NoteService.clear()
    }

    @Test
    fun add() {
        val expected = 0
        val note = Note(1,1,"Текст1",)
        val actualId = NoteService.add(note)

        assertEquals(expected, actualId)
    }


}