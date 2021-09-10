package com.testeGubee.testeGubee.core.usecase

import com.testeGubee.testeGubee.core.domain.Product
import com.testeGubee.testeGubee.core.portas.IGetAllProducts
import com.testeGubee.testeGubee.core.portas.IProductRepository
import org.springframework.stereotype.Component

@Component
class GetAllProducts(private val servico: IProductRepository) : IGetAllProducts {
    override fun getAll(): List<Product> {
        return  servico.findAll().map { it.toDomain() }
    }
}