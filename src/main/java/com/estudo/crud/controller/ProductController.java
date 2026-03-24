package com.estudo.crud.controller;

import com.estudo.crud.dto.ProductCreateDTO;
import com.estudo.crud.dto.ProductResponseDTO;
import com.estudo.crud.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDTO create(@Valid @RequestBody ProductCreateDTO dto){
        return productService.create(dto);
    }

}
