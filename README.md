🌿 Myriad Wellness Ledger
A Java command-line accounting ledger application developed for Capstone 1 in the Year Up United Software Development Program.

The application follows the core accounting ledger requirements while incorporating a wellness-focused theme inspired by a fictional nationwide therapy organization called Myriad Wellness. Users can record deposits and payments, view transaction history, and generate financial reports, with all data stored in a CSV file for persistence between sessions.

📖 Overview
Myriad Wellness Ledger helps organizations manage financial records by allowing users to:

Record deposits and payments
View transaction history
Generate financial reports
Search transactions by vendor
Store transaction data permanently using CSV files
✨ Features
🏠 Home Screen
The home screen follows the original capstone requirements while incorporating the Myriad Wellness Ledger branding.

Option	Description
D	Add Deposit and save incoming funds
P	Make Payment and record outgoing expenses
L	Open the Ledger screen
X	Exit the application
📒 Ledger Screen
All transaction lists are displayed with the newest entries first.

Option	Description
A	View all transactions
D	View deposit transactions only
P	View payment transactions only
R	Open the Reports screen
H	Return to the Home screen
📊 Reports Screen
The reports screen allows users to filter and analyze transaction history.

Option	Description
1	Month-To-Date transactions
2	Previous Month transactions
3	Year-To-Date transactions
4	Previous Year transactions
5	Search transactions by vendor
6	Custom Search by date range
0	Return to the Ledger screen
🛠 Technologies Used
Java
Object-Oriented Programming (OOP)
File I/O
CSV File Storage
ArrayList Collections
LocalDate & LocalDateTime
Exception Handling
📂 Project Structure
src/
│
├── MainApp.java
├── Transaction.java
├── FileManager.java
└── ReportManager.java
Class Responsibilities
Transaction
Stores transaction information such as:

Date
Time
Description
Vendor
Amount
FileManager
Responsible for:

Saving transactions
Loading transactions
Managing CSV file operations
ReportManager
Responsible for:

Month-To-Date reports
Previous Month reports
Year-To-Date reports
Previous Year reports
Vendor searches
Custom date filtering
MainApp
Responsible for:

Main menu navigation
User interaction
Ledger display
Report access
💾 Data Storage
Transactions are stored in a CSV file to ensure data persists between sessions.

Example
2026-11-05|12:45:22|Client Donation|Hope Counseling Center|500.00
2026-11-05|14:30:10|Office Supplies|Office Depot|-75.25
Positive amounts represent deposits
Negative amounts represent payments
New transactions are appended to the file
Existing transaction history is preserved
🎯 Skills Demonstrated
This project demonstrates:

Object-Oriented Design
File Management
Data Persistence
Collection Processing
Report Generation
Data Filtering
Exception Handling
Real-World Business Applications
🚀 Future Improvements
Graphical User Interface (GUI)
Database Integration
Financial Analytics Dashboard
PDF Report Exporting
User Authentication
Advanced Search Filters
▶️ How to Run the Project
Clone the repository:
git clone https://github.com/CherishIbeabuchi/accounting-ledger.git

Open the project in IntelliJ IDEA.

Ensure Java 17 or later is installed.

Run the application from:

MyriadLedgerApp.java

The application will automatically create and update the transactions.csv file used to store transaction records.

Use the menu options to:

Add Deposits
Record Payments
View the Ledger
Run Reports
Search Transactions
Exit the application by selecting:

X) Exit Session
📸 Application Screens
Home Screen
Myriad Wellness Ledger home menu.

Ledger Screen
Displays transaction records and reporting options.

Reports Screen
Includes:

Month To Date
Previous Month
Year To Date
Previous Year
Vendor Search
Custom Search
👨‍💻 Author
Cherish Ibeabuchi

Software Application Development Student
Year Up United

✅ Project Status
Version 1.0

Completed Features:

Deposit Tracking
Payment Tracking
CSV Data Persistence
Ledger Management
Financial Reporting
Vendor Search
Custom Date Search
Wellness-Themed User Interface
