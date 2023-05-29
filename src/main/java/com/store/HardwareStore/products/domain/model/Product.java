package com.store.HardwareStore.products.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private Integer stock;
    private Integer max;
    private Integer min;
}
