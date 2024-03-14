package com.sebastiancorradi.challenge.datasource.repository

import com.sebastiancorradi.challenge.datasource.data.ObjectResponse

interface IRepository {
    suspend fun getObjects(startFrom: Int = 0): ObjectResponse?
}