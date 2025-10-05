package com.marina.paginationcompose

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}
