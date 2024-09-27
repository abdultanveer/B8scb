package com.example.b8scb.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface ItemDao {

    @Insert
    suspend fun insert(groceryItem: Item)

    @Update
    suspend   fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * from item WHERE id = :itemId")
    fun getItem(itemId: Int): Flow<Item>   //coroutine which emits a stream of data as it becomes available


    @Query("SELECT * from item ORDER BY name ASC")
    fun getItems(): Flow<List<Item>>
}