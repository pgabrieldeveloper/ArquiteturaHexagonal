package com.testeGubee.testeGubee.core.usecase

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.testeGubee.testeGubee.core.domain.Product
import com.testeGubee.testeGubee.core.portas.IPopulateDataBase
import com.testeGubee.testeGubee.core.portas.IProductRepository
import org.springframework.stereotype.Component
import org.springframework.util.ResourceUtils
import java.io.File

@Component
class PopulateDateBase(private val servico: IProductRepository) : IPopulateDataBase {
    override fun populateDataBase() {
        val file: File = ResourceUtils.getFile("classpath:files/gubee-teste.json").absoluteFile
        val mapper = jacksonObjectMapper()
        val productList:List<Product> = mapper.readValue(file)
        productList.forEach{servico.save(it.toAdapter())}
    }
}
