package com.example.mfusionclone.screens.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface OrderDatabaseDao{
    /**Insert new order item into table*/
    @Insert
    suspend fun insert(orders: OrderItems)

    /**Update order*/
    @Update
    suspend fun update(orders: OrderItems)

    /**Select a particular order in table*/
    @Query("SELECT * from customer_orders_table WHERE orderNumber = :key")
    suspend fun get(key: Long): OrderItems?

    /** DELETE everything from the customer_orders_table*/
    @Query("DELETE FROM customer_orders_table")
    suspend fun clear()

    /**Select all orders in table*/
    @Query("SELECT * FROM customer_orders_table ORDER BY orderNumber DESC")
    fun getAllNights(): LiveData<List<OrderItems>>
}