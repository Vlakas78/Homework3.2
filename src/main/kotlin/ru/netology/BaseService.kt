package ru.netology

abstract class BaseService<T> {

    protected val items = mutableListOf<T>()
    private var lastId = 0

    fun getNextId() = lastId++

    abstract fun add(note: T): Int

    abstract fun update(note: T): Boolean

    fun delete(note: T): Boolean {
        return items.remove(note)

    }

    fun clear() {
        items.clear()
    }
}