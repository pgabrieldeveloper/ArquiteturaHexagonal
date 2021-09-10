package com.testeGubee.testeGubee.adpters.outbound.persistencia.entities

import com.testeGubee.testeGubee.core.domain.Product
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class ProductEntity (
    @Id
    var productId: String,
    var productName: String,
    var description: String,
    var targetMarket:List<String>,
    var stack: List<String>
){
    constructor(): this("","","",emptyList(),emptyList())

   fun toDomain(): Product {
    return Product(this.productId, this.productName,this.description,this.targetMarket,this.stack);
   }
}



