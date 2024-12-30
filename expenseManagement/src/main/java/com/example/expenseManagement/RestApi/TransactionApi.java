package com.example.expenseManagement.RestApi;

import com.example.expenseManagement.Business.TransactionService;
import com.example.expenseManagement.Entity.FinancialTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/FinancialTransaction")
public class TransactionApi {

    private final TransactionService transactionService;

    @Autowired
    public TransactionApi(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/list")
    public List<FinancialTransaction> getAllTransactions() {
        return transactionService.getAll();
    }

    // Yeni bir işlem ekleme
    @PostMapping("/add")
    public void createTransaction(@RequestBody FinancialTransaction financialTransaction) {
        transactionService.add(financialTransaction);
    }

    // Bir işlemi güncelleme
    @PostMapping("/update")
    public void updateTransaction(@RequestBody FinancialTransaction financialTransaction) {
        this.transactionService.update(financialTransaction);
    }

    // Bir işlemi silme
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.delete(id);
    }
}