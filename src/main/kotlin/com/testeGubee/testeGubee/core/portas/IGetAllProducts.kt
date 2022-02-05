package com.testeGubee.testeGubee.core.portas

import com.testeGubee.testeGubee.core.domain.Product

interface IGetAllProducts {
    fun getAll(): List<Product>

}