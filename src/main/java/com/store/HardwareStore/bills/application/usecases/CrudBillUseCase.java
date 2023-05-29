package com.store.HardwareStore.bills.application.usecases;

import com.store.HardwareStore.bills.application.dtos.BillDTO;
import com.store.HardwareStore.bills.application.factory.BillFactory;
import com.store.HardwareStore.bills.domain.services.CrudBillService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CrudBillUseCase {

    private final CrudBillService crudBillService;

    public CrudBillUseCase(CrudBillService crudBillService){
        this.crudBillService = crudBillService;
    }

    public Mono<BillDTO> createBill(BillDTO billDTO){
        return Mono.just(
                BillFactory.converToDto(crudBillService.createBill(BillFactory.convertToEntity(billDTO)))
        );
    }

    public Flux<BillDTO> getAllBills(){
        return Flux.fromIterable(crudBillService.getAllBills()
                .stream()
                .map(bill -> BillFactory.converToDto(bill))
                .collect(Collectors.toCollection(ArrayList::new)));
    }

    public Mono<BillDTO> getBillById(String id){
        return Mono.just(
                BillFactory.converToDto(crudBillService.getBillById(id))
        );
    }
}
