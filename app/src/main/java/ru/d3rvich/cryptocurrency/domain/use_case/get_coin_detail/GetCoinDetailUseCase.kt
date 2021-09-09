package ru.d3rvich.cryptocurrency.domain.use_case.get_coin_detail

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import ru.d3rvich.cryptocurrency.common.Resource
import ru.d3rvich.cryptocurrency.data.mappers.toCoinDetailEntity
import ru.d3rvich.cryptocurrency.domain.entity.CoinDetailEntity
import ru.d3rvich.cryptocurrency.domain.repository.CoinRepository
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailUseCase @Inject constructor(private val repository: CoinRepository) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetailEntity>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinDetailById(coinId = coinId).toCoinDetailEntity()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetailEntity>(e.localizedMessage ?: "An unexpected error occurred."))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetailEntity>("Couldn't reach server. Check your internet connection."))
        }
    }
}