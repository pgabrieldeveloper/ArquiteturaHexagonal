package com.testeGubee.testeGubee.products.controllers

import com.testeGubee.testeGubee.products.Dtos.ParametersFinds
import com.testeGubee.testeGubee.products.entities.Product
import com.testeGubee.testeGubee.products.services.FindByStack
import com.testeGubee.testeGubee.products.services.FindByTargetMarket
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/product")
class ProductController(private val serviceFindByStack:FindByStack, private val serviceFindByTargetMarket: FindByTargetMarket) {

    @PostMapping("findByStack")
    fun findByStack(@RequestBody parametersFinds: ParametersFinds):ResponseEntity<List<Product>>{
        return ResponseEntity.ok(serviceFindByStack.find(parametersFinds))
    }
    @PostMapping("findByTargetMarket")
    fun findBytargetMarket(@RequestBody parametersFinds: ParametersFinds):ResponseEntity<List<Product>>{
        return ResponseEntity.ok(serviceFindByTargetMarket.find(parametersFinds))
    }

}