package com.testeGubee.testeGubee.products.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Product (
    @Id
    var productId: String,
    var productName: String,
    var description: String,
    var targetMarket:List<String>,
    var stack: List<String>
){
    constructor(): this("","","",emptyList(),emptyList())
}





