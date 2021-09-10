package com.testeGubee.testeGubee.core.domain

import com.testeGubee.testeGubee.adpters.outbound.persistencia.entities.ProductEntity

class Product (
    var productId: String,
    var productName: String,
    var description: String,
    var targetMarket:List<String>,
    var stack: List<String>
){
    constructor(): this("","","",emptyList(),emptyList())

    fun toAdapter(): ProductEntity {
        return ProductEntity (this.productId,this.productName,this.description,this.targetMarket,this.stack)
    }
}
