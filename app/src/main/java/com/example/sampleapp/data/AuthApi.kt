package com.example.sampleapp.data

import retrofit2.http.Body
import retrofit2.http.POST

data class LoginRequest(val email: String, val password: String)

data class UserDto(val id: String, val name: String, val email: String)

data class LoginResponse(
    val success: Boolean,
    val token: String?,
    val user: UserDto?,
    val message: String?
)

interface AuthApi {
    @POST("api/auth/login")
    suspend fun login(@Body body: LoginRequest): LoginResponse
}