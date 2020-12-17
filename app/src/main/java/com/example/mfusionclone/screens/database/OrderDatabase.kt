package com.example.mfusionclone.screens.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

class OrderDatabase {

    @Database(entities = [OrderItems::class], version = 1, exportSchema = false)
    abstract class OrderDatabase : RoomDatabase() {
        abstract val orderDatabaseDao: OrderDatabaseDao

        companion object {
            @Volatile
            private var INSTANCE: OrderDatabase? = null

            fun getInstance(context: Context): OrderDatabase {
                synchronized(this) {
                    var instance = INSTANCE
                    if (instance == null) {
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            OrderDatabase::class.java,
                            "order_history_database")
                            .fallbackToDestructiveMigration()
                            .build()
                        INSTANCE = instance
                    }
                    return instance
                }
            }
        }



    }
}