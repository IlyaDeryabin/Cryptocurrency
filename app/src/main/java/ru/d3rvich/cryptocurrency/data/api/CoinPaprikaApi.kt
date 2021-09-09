package ru.d3rvich.cryptocurrency.data.api

import retrofit2.http.GET
import retrofit2.http.Path
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDetailDto
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDto

interface CoinPaprikaApi {

    @GET("/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/coins/{coinId}")
    suspend fun getCoinDetail(@Path("coinId") coinId: String): CoinDetailDto
}