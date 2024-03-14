package com.sebastiancorradi.challenge.datasource.data

data class ObjectResponse (
val cats: List<String> = listOf(),
val success: Boolean = false,
val errorCode: Int = 0,
val errorMessage: String? = null
) {

}