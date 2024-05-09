package com.rubenSL.proxiTrade.model.dtos

data class ProductDTO(
    var id: Long?,
    var name: String?,
    var description: String?,
    var category: String?,
    var salePrice: Double?,
    var rentedPrice: Double?,
    var address: String?,
    var availability: Boolean?,
    var productOwnerId: Long?
)