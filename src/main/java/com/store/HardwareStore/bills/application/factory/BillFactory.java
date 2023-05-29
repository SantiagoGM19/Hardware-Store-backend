package com.store.HardwareStore.bills.application.factory;

import com.store.HardwareStore.bills.application.dtos.BillDTO;
import com.store.HardwareStore.bills.domain.model.Bill;
import com.store.HardwareStore.products.application.factory.ProductFactory;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BillFactory {

    public static Bill convertToEntity(BillDTO billDTO){
        return new Bill(
                billDTO.getId(),
                billDTO.getUid(),
                billDTO.getDate(),
                billDTO.getClient_name(),
                billDTO.getSeller_name(),
                billDTO.getProducts_bought()
                        .stream()
                        .map(ProductFactory::convertToEntity)
                        .collect(Collectors.toCollection(ArrayList::new)),
                billDTO.getTotal_paid()
        );
    }

    public static BillDTO converToDto(Bill bill){
        return new BillDTO(
                bill.getId(),
                bill.getUid(),
                bill.getDate(),
                bill.getClient_name(),
                bill.getSeller_name(),
                bill.getProducts_bought()
                        .stream()
                        .map(ProductFactory::convertToDto)
                        .collect(Collectors.toCollection(ArrayList::new)),
                bill.getTotal_paid()
        );
    }
}
