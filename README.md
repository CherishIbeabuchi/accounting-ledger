🌿 Myriad Wellness Ledger
A Java command-line application designed to help wellness organizations track financial activity. The application records incoming funding and outgoing expenses, stores transactions in a CSV file, and provides reporting tools to review financial data over time.

Built as a capstone project for the Year Up United Software Development program.

Features
Home Screen
F) Record Funding – Add deposits and save them to the ledger.
E) Record Expense – Add payments/debits and save them to the ledger.
L) Open Ledger – View transaction history and reports.
X) Exit – Close the application.
Ledger Screen
All transactions are displayed with the newest entries first.

A) All Transactions
F) Funding Records
E) Expense Records
R) Reports
H) Home Screen
Reports
Month-To-Date – View transactions from the current month.
Previous Month – View transactions from the previous month.
Year-To-Date – View transactions from the current year.
Previous Year – View transactions from the previous year.
Therapist/Vendor Search – Search records by vendor name.
Custom Search – Search transactions within a selected date range.
Technologies Used
Java
Object-Oriented Programming (OOP)
File I/O
CSV Data Storage
ArrayLists
LocalDate & LocalDateTime
Exception Handling
Project Structure
src/
├── MainApp.java
├── Transaction.java
├── FileManager.java
└── ReportManager.java
Class Responsibilities
Transaction

Stores transaction information such as date, description, vendor, and amount.
FileManager

Saves transactions to CSV files.
Loads transactions when the application starts.
ReportManager

Generates financial reports.
Filters data by date and vendor.
MainApp

Handles menus, navigation, and user interaction.
Data Storage
Transactions are stored in a CSV file to ensure data persists between sessions.

Example:

2026-11-05|Client Donation|Wellness Foundation|500.00
2026-11-05|Office Supplies|Office Depot|-75.25
Positive amounts represent funding/deposits.
Negative amounts represent expenses/payments.
What I Learned
This project strengthened my understanding of:

Object-Oriented Design
File Management
Data Persistence
Collection Processing
Report Generation
User Interface Design in Java
Real-world Business Applications
Future Improvements
Graphical User Interface (GUI)
Database Integration
Financial Analytics Dashboard
PDF Report Exporting
User Authentication
Author
Cherish Ibeabuchi
Software Application Development Student
Year Up United
