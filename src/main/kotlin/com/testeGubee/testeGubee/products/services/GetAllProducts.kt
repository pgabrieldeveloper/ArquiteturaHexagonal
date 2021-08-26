package com.testeGubee.testeGubee.products.services

import com.testeGubee.testeGubee.products.entities.Product
import com.testeGubee.testeGubee.products.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class GetAllProducts(private val repository: ProductRepository) {

    fun getAll():List<Product> {
        return this.repository.findAll();
    }
}
