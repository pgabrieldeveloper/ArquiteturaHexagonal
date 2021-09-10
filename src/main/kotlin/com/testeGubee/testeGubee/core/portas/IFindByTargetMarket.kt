package com.testeGubee.testeGubee.core.portas

import com.testeGubee.testeGubee.adpters.inbound.controllers.dtos.ParametersFinds
import com.testeGubee.testeGubee.core.domain.Product

interface IFindByTargetMarket {
    fun find(parametersFinds: ParametersFinds): List<Product>
}