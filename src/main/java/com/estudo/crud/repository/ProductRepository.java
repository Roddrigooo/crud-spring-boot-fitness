package com.estudo.crud.repository;

import com.estudo.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //Spring entende o nome e cria a query sozinho
    //existe algum Product com esse sku?
    boolean existsBySku(String sku);
}
