package com.example.kadesubmission2

import com.example.kadesubmission2.model.RequestLastModel
import com.example.kadesubmission2.model.ResponseLastModel
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface MatchService {

//    @GET("/api/v1/json/1/lookupleague.php?id={idLeague}")
//    suspend fun getLastMatch(@Path("idLeague") idLeague: String): ResponseLastModel

    @GET("https://www.thesportsdb.com/api/v1/json/1/lookupleague.php")
    fun getNext(@Query("id") idLeague: Int): ResponseLastModel

//    @GET("eventspastleague.php?")
//    suspend fun getLastMatch(@Query("id") idLeague:String) : LastModel



    companion object {
        const val BASE_URL = "https://www.thesportsdb.com"

        fun create() : MatchService{
            val httpClient = OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(MatchService::class.java)
        }

    }
}