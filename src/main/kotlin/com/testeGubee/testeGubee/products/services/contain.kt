package com.testeGubee.testeGubee.products.services

 class Contains private constructor() {

    companion object{
        val contains = {listStack:List<String>, listStack2: List<String> -> listStack2.intersect(listStack).any()}
    }

}