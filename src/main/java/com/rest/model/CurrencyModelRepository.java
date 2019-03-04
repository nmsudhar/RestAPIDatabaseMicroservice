package com.rest.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurrencyModelRepository extends MongoRepository<CurrencyModel, String> {

    CurrencyModel findByCurrencyName(@Param("currencyName") String name);

}
