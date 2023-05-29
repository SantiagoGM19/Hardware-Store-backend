package com.store.HardwareStore.bills.domain.repositories;

import com.store.HardwareStore.bills.domain.model.Bill;

import java.util.ArrayList;

public interface IBillRepository {
    void saveBill(Bill bill);
    ArrayList<Bill> getAllBills();
    Bill getBillById(String id);
}
