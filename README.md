# expenseManagement
# Expense Management System

## Overview
The Expense Management System is a Spring Boot-based application designed to manage and analyze financial transactions. This project enables users to add, update, delete, and retrieve financial transactions and includes functionalities for categorizing and describing transactions.

## Features
- **Add Financial Transactions:** Add new income or expense records with relevant details.
- **Update Transactions:** Modify existing financial transaction details.
- **Delete Transactions:** Remove transactions using their unique ID.
- **View All Transactions:** Retrieve a list of all financial transactions.

## Technologies Used
- **Backend:**
  - Spring Boot
  - Spring Data JPA
  - Java
- **Database:**
  - PostgreSQL
- **Dependencies:**
  - Spring Web
  - Spring Data JPA
  - Lombok

## Project Structure
```plaintext
src
├── main
│   ├── java
│   │   ├── com.example.expenseManagement
│   │   │   ├── Business
│   │   │   │   └── TransactionService.java
│   │   │   ├── Data
│   │   │   │   └── TransactionData.java
│   │   │   ├── Entity
│   │   │   │   └── FinancialTransaction.java
│   │   │   ├── Manager
│   │   │   │   └── CustomTransactionManager.java
│   │   │   ├── RestApi
│   │   │   │   └── TransactionApi.java
├── resources
│   ├── application.properties
