package com.sebastiancorradi.challenge.datasource.repository.remote

import com.sebastiancorradi.challenge.datasource.api.ApiClient
import com.sebastiancorradi.challenge.datasource.data.ObjectResponse
import retrofit2.HttpException
import java.net.SocketTimeoutException

class RemoteRepository: IRemoteRepository {
    override suspend fun getObjects(startFrom: Int): ObjectResponse? {
        try {
            val cats = ApiClient.apiService.getCats(startFrom, 10)
            cats?.let {
                return ObjectResponse(success = true, cats = cats)
            }
            return ObjectResponse(success = false)
        } catch (e: HttpException) {
            return ObjectResponse(errorCode = e.code(),
                errorMessage = e.message,
                success = false)
        } catch (e: SocketTimeoutException) {
            return ObjectResponse(
                errorCode = 400, errorMessage = e.message, success = false
            )
        }
    }
}