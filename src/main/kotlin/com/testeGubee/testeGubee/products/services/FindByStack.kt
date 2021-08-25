package com.testeGubee.testeGubee.products.services

import com.testeGubee.testeGubee.products.entities.Product
import com.testeGubee.testeGubee.products.interfaces.Finds
import com.testeGubee.testeGubee.products.repository.ProductRepository

class FindByStack(private val repository: ProductRepository): Finds {
    override fun find(val stacks:List<String> ): List<Product> {
        val listProducs:List<Product> =  this.repository.findAll();

      
    }

}


