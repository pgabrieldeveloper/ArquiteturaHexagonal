package com.testeGubee.testeGubee.products.interfaces

import com.testeGubee.testeGubee.products.Dtos.ParametersFinds
import com.testeGubee.testeGubee.products.entities.Product

abstract interface Finds {
    fun find(parametersFinds: ParametersFinds): List<Product>
}