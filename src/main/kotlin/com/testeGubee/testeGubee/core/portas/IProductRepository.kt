package com.testeGubee.testeGubee.core.portas

import com.testeGubee.testeGubee.adpters.outbound.persistencia.entities.ProductEntity

interface IProductRepository {
    fun findAll(): List<ProductEntity>
    fun save(product: ProductEntity): ProductEntity;
}