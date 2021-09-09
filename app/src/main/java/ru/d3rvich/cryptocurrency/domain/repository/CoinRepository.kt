package ru.d3rvich.cryptocurrency.domain.repository

import ru.d3rvich.cryptocurrency.data.api.dto.CoinDetailDto
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinDetailById(coinId: String): CoinDetailDto
}