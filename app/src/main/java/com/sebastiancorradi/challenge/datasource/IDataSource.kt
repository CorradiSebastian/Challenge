package com.sebastiancorradi.challenge.datasource

import com.sebastiancorradi.challenge.data.Cat

interface IDataSource {
    suspend fun getCats(startFrom: Int): List<Cat>?
}