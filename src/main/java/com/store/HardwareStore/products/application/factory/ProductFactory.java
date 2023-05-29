package com.store.HardwareStore.products.application.factory;

import com.store.HardwareStore.products.application.dtos.ProductDTO;
import com.store.HardwareStore.products.domain.model.Product;

public class ProductFactory {

    public static Product convertToEntity(ProductDTO productDTO){
        return new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getStock(),
                productDTO.getMax(),
                productDTO.getMin()
        );
    }

    public static ProductDTO convertToDto(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getStock(),
                product.getMax(),
                product.getMin()
        );
    }
}
