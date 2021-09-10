package com.testeGubee.testeGubee.adpters.outbound.persistencia

import com.testeGubee.testeGubee.adpters.outbound.persistencia.entities.ProductEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface IMongoProductRepository : MongoRepository<ProductEntity, String> {
    
}