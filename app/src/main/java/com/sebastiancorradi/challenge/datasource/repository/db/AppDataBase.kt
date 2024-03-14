package com.sebastiancorradi.challenge.datasource.repository.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sebastiancorradi.challenge.ChallengeApplication
import com.sebastiancorradi.challenge.data.Cat
import com.sebastiancorradi.challenge.datasource.repository.db.dao.CatDao

@Database(entities = [Cat::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun catDao(): CatDao

    companion object {
        private val db = Room.databaseBuilder(
            ChallengeApplication.applicationContext(), AppDatabase::class.java, "cat_database"
        ).build()

        fun getDb():AppDatabase{
            return db
        }
    }


}