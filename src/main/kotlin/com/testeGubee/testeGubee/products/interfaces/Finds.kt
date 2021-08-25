package com.testeGubee.testeGubee.products.interfaces

import com.testeGubee.testeGubee.products.entities.Product

interface Finds {
    fun find(): List<Product>;
}