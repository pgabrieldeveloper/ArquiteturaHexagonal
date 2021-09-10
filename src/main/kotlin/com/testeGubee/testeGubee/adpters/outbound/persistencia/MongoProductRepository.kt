package com.testeGubee.testeGubee.adpters.outbound.persistencia

import com.testeGubee.testeGubee.adpters.outbound.persistencia.entities.ProductEntity
import com.testeGubee.testeGubee.core.domain.Product
import com.testeGubee.testeGubee.core.portas.IProductRepository
import org.springframework.stereotype.Repository
import java.util.stream.Collectors

@Repository
class MongoProductRepository(private val productRepository: IMongoProductRepository) : IProductRepository {

    override
    fun findAll(): List<ProductEntity> {
        return productRepository.findAll();
    }

    override
    fun save(product: ProductEntity): ProductEntity {
        return productRepository.save(product);
    }
}