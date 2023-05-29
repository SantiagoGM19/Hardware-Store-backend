package com.store.HardwareStore.bills.application.dtos;

import com.store.HardwareStore.products.application.dtos.ProductDTO;
import com.store.HardwareStore.products.domain.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class BillDTO {
    private String id;
    private String uid;
    private LocalDateTime date;
    private String client_name;
    private String seller_name;
    private ArrayList<ProductDTO> products_bought;
    private Double total_paid;
}
