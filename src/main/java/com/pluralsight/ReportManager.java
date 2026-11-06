package com.pluralsight;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.MyriadLedgerApp.RESET;
import static com.pluralsight.MyriadLedgerApp.YELLOW;

public class ReportManager {
    static Scanner cScans = new Scanner(System.in);

    //* Display all Transactions
    public static void displayAll() {

        //TODO Get all transaction from the File

        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            //? Print transactions
            System.out.println(myriadTransactions.get(i));

        }

    }

    //* ---- Display Deposits ----*
    public static void displayDeposits() {
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        /// Loop through the transaction
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            if (myriadTransactions.get(i).getLedgerAmount() >= 0) {
                //? Print out each Transaction
                System.out.println(myriadTransactions.get(i));
            }

        }
    }

    //TODO ----Display Payments-----
    public static void displayPayments() {

        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {
            if (myriadTransactions.get(i).getLedgerAmount() < 0) {

                //* Display Amount
                System.out.println(myriadTransactions.get(i));
            }
        }

    }

    public static void searchVendor() {
        /// Ask the user for a vendor name

        System.out.println("Enter Vendor Name: ");
        String vendorSearch = cScans.nextLine();

        ///Get the transaction from the csv file
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        ///Loop Through the transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            ///Check if the vendor search matches the user input
            if (myriadTransactions.get(i).getVendor().equalsIgnoreCase(vendorSearch)) {

                /// Display matching transaction
                System.out.println(myriadTransactions.get(i));


            }
        }
    }

    public static void monthToDate() {
        /// Load all transactions
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        System.out.println("Transactions Loaded: " + myriadTransactions.size());

        ///Get current year and month
        String currentMonth = LocalDate.now().toString().substring(0, 7);

        System.out.println("Current Month: " + currentMonth);

        ///Loop through transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {
            System.out.println(myriadTransactions.get(i).getLedgerDate());

            ///Check if the transaction belongs to the current month
            if (myriadTransactions.get(i).getLedgerDate().startsWith(currentMonth)) {

                System.out.println(myriadTransactions.get(i));

            }
        }
    }

    //TODO ---Display transactions from previous month---
    public static void previousMonth() {

        ///Load all Transactions
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        ///Get Previous Month
        String previousMonth = LocalDate.now().minusMonths(1).toString().substring(0, 7);

        ///Loop through Transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            ///Check if transaction belongs to the previous month
            if (myriadTransactions.get(i).getLedgerDate().startsWith(previousMonth)) {
                System.out.println(myriadTransactions.get(i));

            }


        }

    }

    //?---Display Transaction from current year
    public static void yearToDate() {

        /// Load all transactions
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();
        ///Get current year
        String currentYear = String.valueOf(LocalDate.now().getYear());

        ///Loop through Transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {


            ///Check if transaction belongs to current year
            if (myriadTransactions.get(i).getLedgerDate().startsWith(currentYear)) {
                System.out.println(myriadTransactions.get(i));

            }


        }
    }

    //?---Display Transaction from previous year
    public static void previousYear() {

        /// Load all transactions
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();
        ///Get previous year
        String previousYear = String.valueOf(LocalDate.now().minusYears(1).getYear());

        ///Loop through Transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            ///Check if transaction belongs to current year
            if (myriadTransactions.get(i).getLedgerDate().startsWith(previousYear)) {
                System.out.println(myriadTransactions.get(i));

            }
        }
    }

    public static void customSearch() {

        System.out.println( YELLOW + """
     ━━━━━━━━━━━━━━━━━━━━━━━━━━
           CUSTOM SEARCH
     ━━━━━━━━━━━━━━━━━━━━━━━━━━
     """ +RESET);

        ///Ask use for vendor name
        System.out.println("Start Date (yyyy-mm-dd): ");
        String startDate = cScans.nextLine();

        System.out.println("End Date (yyyy-mm-dd): ");
        String endDate = cScans.nextLine();

        System.out.println("Description: ");
        String description = cScans.nextLine();

        System.out.println("Vendor: ");
        String vendor = cScans.nextLine();

        System.out.println("Amount: ");
        String amount = cScans.nextLine();

        ArrayList<Transaction>myriadTransactions =
                FileManager.getTransactions();

        for (int i = myriadTransactions.size() -1; i >= 0; i--) {

            Transaction transaction = myriadTransactions.get(i);
            boolean isMatch = true;

            if(!startDate.isBlank()) {

                if(transaction.getLedgerDate().compareTo(startDate) < 0) {

                    isMatch = false;
                }
            }
            if (!endDate.isBlank()) {
                if(transaction.getLedgerDate().compareTo(endDate)> 0) {

                    isMatch = false;
            }
        }
            if (!vendor.isBlank()) {
                if(!transaction.getVendor().equalsIgnoreCase(vendor)) {

                    isMatch =false;

                }
            }
            if (!amount.isBlank()) {

                double totalAmount = Double.parseDouble(amount);

                if (transaction.getLedgerAmount() != totalAmount) {

                    isMatch = false;

                }
            }
            if(isMatch) {
                System.out.println(transaction);
            }
        }


    }

}