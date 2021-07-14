package com.tfalc.microservices.microservicestraining.repository;

import com.tfalc.microservices.microservicestraining.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
