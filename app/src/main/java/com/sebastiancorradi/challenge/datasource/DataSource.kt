package com.sebastiancorradi.challenge.datasource

import com.sebastiancorradi.challenge.data.Cat
import com.sebastiancorradi.challenge.datasource.repository.db.IDBRepository
import com.sebastiancorradi.challenge.datasource.repository.local.ILocalRepository
import com.sebastiancorradi.challenge.datasource.repository.remote.IRemoteRepository
import javax.inject.Inject

class DataSource @Inject constructor(
    private val catRemoteRepository: IRemoteRepository,
    private val catLocalRepository: ILocalRepository,
    private val catDBRepository: IDBRepository,
) : IDataSource {
    private val pageSize = 10
    override suspend fun getCats(startFrom: Int): List<Cat>? {
        //TODO logic to retrieve the data
        return listOf()
        /*val response = catDBRepository.getObjects(startFrom)
        if (response?.success == true && response.cats.isNotEmpty()) {
            return response.cats
        } else {
            val response = catRemoteRepository.getObjects(startFrom)
            if (response?.success == true) {
                //saveCatsUseCase(response.cats)
                return response.cats ?: listOf()
            } else {
                return catLocalRepository.getCats()?.cats

            }
        }*/
    }
}