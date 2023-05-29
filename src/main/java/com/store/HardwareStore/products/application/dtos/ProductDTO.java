package com.store.HardwareStore.products.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private Integer stock;
    private Integer max;
    private Integer min;
}
