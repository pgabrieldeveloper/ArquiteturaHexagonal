package com.testeGubee.testeGubee.products.controllers

import com.testeGubee.testeGubee.products.services.PopulateDataBase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/populate")
class PopulateDataBaseController (private val service: PopulateDataBase) {

    @GetMapping
    fun populateDateBase(): String {
        service.populateDataBase();
        return "<h1> Base De Dados Populada Com Sucesso </h1>";
    }
}