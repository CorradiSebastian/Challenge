package com.sebastiancorradi.challenge.datasource.repository.db

import com.sebastiancorradi.challenge.datasource.data.ObjectResponse

class DBRepository: IDBRepository {
    override suspend fun getObjects(startFrom: Int): ObjectResponse? {
        try {
            val db = AppDatabase.getDb()
            //val cats = db.catDao().getAll(startFrom)
            val response = ObjectResponse(listOf(), success = true)
            return response
        } catch (e: Exception){
            return ObjectResponse(success = false, errorMessage = e.message)
        }
    }
}