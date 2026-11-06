package com.pluralsight;
import javax.swing.*;
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
            System.out.println("""
        
          ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
          📅 Date: %s
          🕒 Time: %s
          📝 Description: %s
          🏢 Vendor: %s
          💵 Amount: $%.2f
          ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        """.formatted(
                    myriadTransactions.get(i).getLedgerDate(),
                    myriadTransactions.get(i).getLedgerTime(),
                    myriadTransactions.get(i).getLedgerDescription(),
                    myriadTransactions.get(i).getVendor(),
                    myriadTransactions.get(i).getLedgerAmount()
            ));


        }
        System.out.println("🌿 Together these stories reflect our impact.");
        System.out.println("\n");

    }

    //* ---- Display Deposits ----*
    public static void displayDeposits() {
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        /// Loop through the transaction
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            if (myriadTransactions.get(i).getLedgerAmount() >= 0) {
                //? Print out each Transaction
                System.out.println("""
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
             📅 Date: %s
             🕒 Time: %s
             📝 Description: %s
             🏢 Vendor: %s
             💵 Amount: $%.2f
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));
            }
        }System.out.println("💚 Every contribution helps someone heal.");
        System.out.println("\n");
    }

    //TODO ----Display Payments-----
    public static void displayPayments() {

        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {
            if (myriadTransactions.get(i).getLedgerAmount() < 0) {
                System.out.println("""
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
             📅 Date: %s
             🕒 Time: %s
             📝 Description: %s
             🏢 Vendor: %s
             💵 Amount: $%.2f
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
""".formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));



            }
        }System.out.println("\n🤝 Every partnership creates change.");
         System.out.println("\n");

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

                /// Display matching transactions
                System.out.println("""
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            📅 Date: %s
            🕒 Time: %s
            📝 Description: %s
            🏢 Vendor: %s
            💵 Amount: $%.2f
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));


            }
        }System.out.println("\n🤝 Every partnership creates change.");
        System.out.println("\n");
    }

    public static void monthToDate() {
        /// Load all transactions
        ArrayList<Transaction> myriadTransactions = FileManager.getTransactions();

        ///Get current year and month
        String currentMonth = LocalDate.now().toString().substring(0, 7);

        ///Loop through transactions
        for (int i = myriadTransactions.size() - 1; i >= 0; i--) {

            ///Check if the transaction belongs to the current month
            if (myriadTransactions.get(i).getLedgerDate().startsWith(currentMonth)) {
                System.out.println("""
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
             📅 Date: %s
             🕒 Time: %s
             📝 Description: %s
             🏢 Vendor: %s
             💵 Amount: $%.2f
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));


            }
        } System.out.println("\n🌱 Every Story Matters.");
        System.out.println("\n");

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
                System.out.println("""
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                📅 Date: %s
                🕒 Time: %s
                📝 Description: %s
                🏢 Vendor: %s
                💵 Amount: $%.2f
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
               """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));

            }
        }  System.out.println("\n 🍃 Reflecting on progress and growth.");
           System.out.println("\n");

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
                System.out.println("""
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
              📅 Date: %s
              🕒 Time: %s
              📝 Description: %s
              🏢 Vendor: %s
              💵 Amount: $%.2f
             ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
             """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));

            }


        }System.out.println("\n🌳 Building healthier communities together.");
        System.out.println("\n");


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
                System.out.println("""
               ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
               📅 Date: %s
               🕒 Time: %s
               📝 Description: %s
               🏢 Vendor: %s
               💵 Amount: $%.2f
              ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
              """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));


            }
        } System.out.println("\n📖 Celebrating a year of support and impact.");
        System.out.println("\n");

    }

    public static void customSearch() {

        System.out.println( YELLOW + """
     ━━━━━━━━━━━━━━━━━━━━━━━━━━
       🌿  CUSTOM SEARCH 🌿
     ━━━━━━━━━━━━━━━━━━━━━━━━━━
     -> Start Date
     
     -> End Date
     
     -> Description
     
     -> Vendor
     
     -> Amount
 
     ━━━━━━━━━━━━━━━━━━━━━━━━━━
     """ +RESET);

        ///Ask use for vendor name
        System.out.println("Start Date (yyyy-mm-dd): ");
        String startDate = cScans.nextLine();

        System.out.println("End Date  (yyyy-mm-dd): ");
        String endDate = cScans.nextLine();

        System.out.println("Description: ");
        String description = cScans.nextLine();

        System.out.println("Vendor: ");
        String vendor = cScans.nextLine();

        System.out.println("Amount: ");
        String amount = cScans.nextLine();

        // Get all transaction from the Csv file and store them in an Arraylist
        ArrayList<Transaction>myriadTransactions =
                FileManager.getTransactions();

        // Loop through the transactions
        for (int i = myriadTransactions.size() -1; i >= 0; i--) {

            // Get the current transaction being checked
            Transaction transaction = myriadTransactions.get(i);
            boolean isMatch = true;

            // Check if the user entered a start date
            if(!startDate.isBlank()) {

                if(transaction.getLedgerDate().compareTo(startDate) < 0) {

                    isMatch = false;
                }
            }
            // Check if the user entered an end date
            if (!endDate.isBlank()) {
                if(transaction.getLedgerDate().compareTo(endDate)> 0) {

                    isMatch = false;
            }
        }   // check if the user entered a vendor name
            if (!vendor.isBlank()) {
                if(!transaction.getVendor().equalsIgnoreCase(vendor)) {

                    isMatch =false;

                }
            }
            if (!amount.isBlank()) {
                // Convert the user's amount into a decimal number
                double totalAmount = Double.parseDouble(amount);

                // Compare the entered amount with the transaction
                if (transaction.getLedgerAmount() != totalAmount) {

                    isMatch = false;

                }
            }
            if (!description.isBlank()) {

                if (!transaction.getLedgerDescription()
                        .equalsIgnoreCase(description)) {

                    isMatch = false;
                }
            }
            // if the transaction passed all checks
            // Show it to the user
            if(isMatch) {
                System.out.println("""
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                📅 Date: %s
                🕒 Time: %s
                📝 Description: %s
                🏢 Vendor: %s
                💵 Amount: $%.2f
               ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
               """.formatted(
                        myriadTransactions.get(i).getLedgerDate(),
                        myriadTransactions.get(i).getLedgerTime(),
                        myriadTransactions.get(i).getLedgerDescription(),
                        myriadTransactions.get(i).getVendor(),
                        myriadTransactions.get(i).getLedgerAmount()
                ));
            }
        }System.out.println("\n🔍 Behind every record is a story worth remembering.");
        System.out.println("\n");


    }

}