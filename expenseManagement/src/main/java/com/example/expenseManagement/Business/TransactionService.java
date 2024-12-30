package com.example.expenseManagement.Business;

import com.example.expenseManagement.Entity.FinancialTransaction;

import java.util.List;

public interface TransactionService {
    void add(FinancialTransaction financialTransaction);
    void update(FinancialTransaction financialTransaction);
    void delete(Long id); //ID'ye göre işlem sil
    List<FinancialTransaction> getAll();

}