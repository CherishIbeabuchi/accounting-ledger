package com.pluralsight;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
        for (int i = myriadTransactions.size() - 1; i > 0; i--) {

            if (myriadTransactions.get(i).getLedgerAmount() > 0) {
                //? Print out each Transaction
                System.out.println(myriadTransactions.get(i));
            }

        }
    }

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
        ArrayList<Transaction>myriadTransactions = FileManager.getTransactions();

        ///Loop Through the transactions
        for (int i = myriadTransactions.size() -1; i >= 0; i--) {

            ///Check if the vendor search matches the user input
        if(myriadTransactions.get(i).getVendor().equalsIgnoreCase(vendorSearch)) {

            /// Display matching transaction
            System.out.println(myriadTransactions.get(i));


        }
        }
    }
    public static void

}

