package com.store.HardwareStore.bills.domain.services;

import com.store.HardwareStore.bills.domain.model.Bill;
import com.store.HardwareStore.bills.domain.repositories.IBillRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CrudBillService {

    private final IBillRepository billRepository;

    public CrudBillService(IBillRepository billRepository){
        this.billRepository = billRepository;
    }

    public void createBill(Bill bill){
        billRepository.saveBill(bill);
    }

    public ArrayList<Bill> getAllBills(){
        return billRepository.getAllBills();
    }

    public Bill getBillById(String id){
        return billRepository.getBillById(id);
    }
}
