package com.example.expenseManagement.Data;

import com.example.expenseManagement.Entity.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionData extends JpaRepository<FinancialTransaction,Long> {
}
