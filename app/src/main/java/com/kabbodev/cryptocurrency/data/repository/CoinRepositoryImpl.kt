package com.kabbodev.cryptocurrency.data.repository

import com.kabbodev.cryptocurrency.data.remote.CoinPaprikaApi
import com.kabbodev.cryptocurrency.data.remote.dto.CoinDetailDto
import com.kabbodev.cryptocurrency.data.remote.dto.CoinDto
import com.kabbodev.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto = api.getCoinById(coinId)

}