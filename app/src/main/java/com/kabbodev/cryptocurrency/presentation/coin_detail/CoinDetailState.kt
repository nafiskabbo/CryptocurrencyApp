package com.kabbodev.cryptocurrency.presentation.coin_detail

import com.kabbodev.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)