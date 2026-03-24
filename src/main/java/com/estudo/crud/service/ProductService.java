package com.estudo.crud.service;


import com.estudo.crud.repository.ProductRepository;
import org.springframework.stereotype.Service;

import com.estudo.crud.dto.ProductCreateDTO;
import com.estudo.crud.dto.ProductResponseDTO;
import com.estudo.crud.entity.Product;
import com.estudo.crud.exception.BusinessException;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public boolean existsSku(String sku){
        return productRepository.existsBySku(sku);
    }

    @Transactional
    public ProductResponseDTO create(ProductCreateDTO dto){

        //sku unico
        if(productRepository.existsBySku(dto.getSku())){
            throw new BusinessException("SKU já cadastrado:" + dto.getSku());
        }

        //converter DTO -> Entity
        Product product = new Product(
                dto.getName(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getSku(),
                dto.getCategory(),
                dto.getSize(),
                dto.getColor(),
                dto.getStock()
        );

        //salvar no banco de dados
        Product saved = productRepository.save(product);

        return toResponseDTO(saved);

    }

    //busca por id
    @Transactional(readOnly = true)
    public ProductResponseDTO findById(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Produto não encontrado com id: " + id));

        return toResponseDTO(product);

    }

    private ProductResponseDTO toResponseDTO(Product product) {
        ProductResponseDTO response = new ProductResponseDTO();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setSku(product.getSku());
        response.setCategory(product.getCategory());
        response.setSize(product.getSize());
        response.setColor(product.getColor());
        response.setStock(product.getStock());
        response.setActive(product.getActive());
        response.setCreatedAt(product.getCreatedAt());
        return response;
    }


}
