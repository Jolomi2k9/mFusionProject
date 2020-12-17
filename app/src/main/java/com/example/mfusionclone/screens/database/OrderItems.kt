package com.example.mfusionclone.screens.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**Database entity*/
@Entity(tableName = "customer_orders_table")
data class OrderItems(

        @PrimaryKey(autoGenerate = true)
        var orderNumber: Long = 0L,

        @ColumnInfo(name = "menuItems")
        var menuItems: String,

        @ColumnInfo(name = "itemDesc")
        var itemDesc: String,

        @ColumnInfo(name = "menuPrice")
        var menuPrice: Double
)