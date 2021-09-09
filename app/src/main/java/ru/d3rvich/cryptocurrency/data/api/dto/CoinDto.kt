package ru.d3rvich.cryptocurrency.data.api.dto

import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("id_active")
    val isActive: Boolean,
    val type: String
)
