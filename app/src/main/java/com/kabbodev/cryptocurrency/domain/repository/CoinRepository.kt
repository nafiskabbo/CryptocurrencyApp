package com.kabbodev.cryptocurrency.domain.repository

import com.kabbodev.cryptocurrency.data.remote.dto.CoinDetailDto
import com.kabbodev.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}