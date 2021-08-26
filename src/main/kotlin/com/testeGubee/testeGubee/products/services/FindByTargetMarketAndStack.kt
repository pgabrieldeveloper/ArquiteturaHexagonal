package com.testeGubee.testeGubee.products.services

import com.testeGubee.testeGubee.products.Dtos.ParametersFinds
import com.testeGubee.testeGubee.products.entities.Product
import com.testeGubee.testeGubee.products.interfaces.Finds
import com.testeGubee.testeGubee.products.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class FindByTargetMarketAndStack(private val repository: ProductRepository):Finds {
    override fun find(parametersFinds: ParametersFinds): List<Product> {
        val listProducts:List<Product> = this.repository.findAll();
        return listProducts.filter {Contains.contains(parametersFinds.targetMarket, it.targetMarket) && Contains.contains(parametersFinds.stack, it.stack) };
    }
}