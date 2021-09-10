package com.testeGubee.testeGubee.core.usecase

import com.testeGubee.testeGubee.core.domain.Product
import com.testeGubee.testeGubee.core.portas.IFindByStack
import com.testeGubee.testeGubee.core.portas.IProductRepository
import com.testeGubee.testeGubee.adpters.inbound.controllers.dtos.ParametersFinds
import org.springframework.stereotype.Component

@Component
class FindByStack(private val servico: IProductRepository ) : IFindByStack {

    override fun find(parametersFinds: ParametersFinds): List<Product> {
        val listProducts:List<Product> = servico.findAll().map { it.toDomain() }
        return listProducts.filter { Contains.contains(parametersFinds.stack, it.stack)};
    }
}