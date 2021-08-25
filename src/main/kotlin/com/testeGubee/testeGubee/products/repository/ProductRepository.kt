package com.testeGubee.testeGubee.products.repository

import com.testeGubee.testeGubee.products.entities.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : MongoRepository<Product, String> {

}

