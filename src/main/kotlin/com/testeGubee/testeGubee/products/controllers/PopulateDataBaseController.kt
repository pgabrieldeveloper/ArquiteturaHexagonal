package com.testeGubee.testeGubee.products.controllers

import com.testeGubee.testeGubee.products.services.PopulateDataBase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/product")
class PopulateDataBaseController (private val service: PopulateDataBase) {

    @GetMapping("populate")
    fun populateDateBase(): String {
        service.populateDataBase();
        return "<h1> Base De Dados Populada Com Sucesso </h1>";
    }
}