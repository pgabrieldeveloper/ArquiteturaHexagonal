package com.testeGubee.testeGubee.core.usecase

class Contains private constructor() {

    companion object{
        val contains = {listStack:List<String>, listStack2: List<String> -> listStack2.intersect(listStack).any()}
    }

}