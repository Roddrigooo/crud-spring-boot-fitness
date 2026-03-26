package com.estudo.crud.controller;

import com.estudo.crud.dto.ProductCreateDTO;
import com.estudo.crud.dto.ProductResponseDTO;
import com.estudo.crud.dto.ProductUpdateDTO;
import com.estudo.crud.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public ProductResponseDTO findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @GetMapping
    public List<ProductResponseDTO> findAll(){
        return productService.findAll();
    }

    @PutMapping("/{id}")
    public ProductResponseDTO update(@PathVariable Long id, @Valid @RequestBody ProductUpdateDTO dto){
        return productService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }

}
