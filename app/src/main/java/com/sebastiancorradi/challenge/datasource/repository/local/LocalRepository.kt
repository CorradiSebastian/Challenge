package com.sebastiancorradi.challenge.datasource.repository.local

import com.sebastiancorradi.challenge.datasource.data.ObjectResponse

class LocalRepository: ILocalRepository {
    override suspend fun getObjects(startFrom: Int): ObjectResponse? {
        val response = ObjectResponse( listOf(
            "Hola"," Chau"))
        return response
    }
}