package com.example.expenseManagement.Manager;

import com.example.expenseManagement.Business.TransactionService;
import com.example.expenseManagement.Data.TransactionData;
import com.example.expenseManagement.Entity.FinancialTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomTransactionManager implements TransactionService {

    private TransactionData transactionData;

    @Autowired
    public CustomTransactionManager(TransactionData transactionData) {
        this.transactionData = transactionData;
    }

    @Override
    public void add(FinancialTransaction financialTransaction) {
        this.transactionData.save(financialTransaction);
    }

    @Override
    public void update(FinancialTransaction financialTransaction) {
        this.transactionData.save(financialTransaction);
    }

    @Override
    public void delete(Long id) {
        transactionData.deleteById(id);
    }

    @Override
    public List<FinancialTransaction> getAll() {
        return this.transactionData.findAll();
    }
}
