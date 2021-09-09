package ru.d3rvich.cryptocurrency.data.repository

import ru.d3rvich.cryptocurrency.data.api.CoinPaprikaApi
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDetailDto
import ru.d3rvich.cryptocurrency.data.api.dto.CoinDto
import ru.d3rvich.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinPaprikaApi: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return coinPaprikaApi.getCoins()
    }

    override suspend fun getCoinDetailById(coinId: String): CoinDetailDto {
        return coinPaprikaApi.getCoinDetail(coinId = coinId)
    }
}