package com.testeGubee.testeGubee.products.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.testeGubee.testeGubee.products.entities.Product
import com.testeGubee.testeGubee.products.repository.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.util.ResourceUtils
import java.io.File

@Service
class PopulateDataBase(private val repository: ProductRepository) {
    fun populateDataBase(){
        val file:File = ResourceUtils.getFile("classpath:files/gubee-teste.json").absoluteFile
        val mapper = jacksonObjectMapper()
        val productList:List<Product> = mapper.readValue(file)
        productList.forEach{repository.save(it)}
    }

}