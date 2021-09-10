package com.testeGubee.testeGubee.adpters.inbound.controllers


import com.testeGubee.testeGubee.adpters.inbound.controllers.dtos.ParametersFinds
import com.testeGubee.testeGubee.core.domain.Product
import com.testeGubee.testeGubee.core.portas.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/hexagonal/product")
class ProductController(
    private val serviceFindByStack: IFindByStack,
    private val serviceFindByTargetMarket: IFindByTargetMarket,
    private val serviceFindByTargetMarketAndStack: IFindByTargetMarketAndStack,
    private val serviceAllProduct: IGetAllProducts,
    private val servicePopulate: IPopulateDataBase
) {
        @PostMapping("findByStack")
        fun findByStack(@RequestBody parametersFinds: ParametersFinds):ResponseEntity<List<Product>>{
            return ResponseEntity.ok(serviceFindByStack.find(parametersFinds))
        }

        @PostMapping("findByTargetMarket")
        fun findBytargetMarket(@RequestBody parametersFinds: ParametersFinds):ResponseEntity<List<Product>>{
            return ResponseEntity.ok(serviceFindByTargetMarket.find(parametersFinds))
        }

        @PostMapping("findByTargetMarketAndStack")
        fun findByTargetMarketAndStack(@RequestBody parametersFinds: ParametersFinds): ResponseEntity<List<Product>>{
            return ResponseEntity.ok(serviceFindByTargetMarketAndStack.find(parametersFinds))
        }

        @GetMapping
        fun getAllProducts(): ResponseEntity<List<Product>>{
            return ResponseEntity.ok(serviceAllProduct.getAll())
        }
    @GetMapping("populate")
    fun pupulate() {
       servicePopulate.populateDataBase();
    }



}