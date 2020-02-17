package com.example.kadesubmission2

import com.example.kadesubmission2.model.LeagueResponse
import com.example.kadesubmission2.model.Match
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface MatchService {

//    @GET("/api/v1/json/1/lookupleague.php?id={idLeague}")
//    suspend fun getLastMatch(@Path("idLeague") idLeague: String): ResponseLastModel

    @GET("/api/v1/json/1/lookupleague.php")
    suspend fun getNext(@Query("id") idLeague: Int): LeagueResponse<List<Match>>

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