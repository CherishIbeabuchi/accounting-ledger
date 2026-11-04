package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MyriadLedgerApp {
    static Scanner cScans = new Scanner(System.in);

    public static void main(String[] args) {

        homeScreen();
    }
    //? My main Menu
    public static void homeScreen() {

        //? Allows the app to keep running until the user exists
        boolean running = true;


        //TODO Displaying my home menu
        System.out.println("""
        |========= MYRIAD ================
        D) Add Deposit
        P) Make Payment
        L) Ledger
        X) Exit
        ===================================
        """);

        while (running) {

            //* Reading the users input and convert it to UpperCase :)
            String userChoice = cScans.nextLine().toUpperCase();

            switch (userChoice) {
                case "D":
                    addDeposit(); //? Add deposit
                    break;
                case "P":
                    makePayment(); //* Add payment
                    break;
                case "L":
                    ledgerMenu(); //? Open the ledger Menu
                    break;
                case "X":
                    running = false; //* Exit the Application
                    System.out.println("Thank you for...");
                    break;

                default:
                    System.out.println("Invalid select");
            }

        }
    }
    // Add Deposit
    public static void addDeposit() {
        System.out.println("Description: ");
        String description = cScans.nextLine();

        System.out.println("vendor: ");
        String vendor = cScans.nextLine();

        System.out.println("Amount: ");
        double amount = Double.parseDouble(cScans.nextLine());
        Transaction theTransaction = new Transaction(LocalDate.now().toString(), LocalTime.now().toString(), description, vendor, amount);

        /// Save Transaction to the File
        FileManager.saveTransaction(theTransaction);

        System.out.println("Deposit Added!");

    }
    //* ---- Make Payment ---*
    public static void makePayment() {

        //? Ask user for Description
        System.out.println("Description: ");
        String description = cScans.nextLine();

        System.out.println("vendor: ");
        String vendor = cScans.nextLine();

        System.out.println("Amount: ");
        double amount = Double.parseDouble(cScans.nextLine());
        amount = -Math.abs (amount);

        Transaction transaction = new Transaction(LocalDate.now().toString(), LocalTime.now().toString(), description , vendor, amount);
        System.out.println("Payment Added!");

        /// Save Transaction
        FileManager.saveTransaction(transaction);
        System.out.println("Payment Added!");
    }
    //* ----- LEDGER MENU -----
    public static void ledgerMenu() {

        boolean ledgerRunning = true;

        while (ledgerRunning) {

            System.out.println("""
                    menu..""");
            System.out.println("A)");
            String choice = cScans.nextLine().toUpperCase();

            switch (choice) {

                case "A":
                    ReportManager.displayAll();
                    break;
                case "D":
                    ReportManager.displayDeposits();
                    break;
                case "P":
                    ReportManager.displayPayments();
                    break;
                case "R":
                    reportsMenu();
                    break;
                case "H":
                    ledgerRunning = false;
                    break;

                default:
                    System.out.println("...");
            }
        }
    }
    public static void reportsMenu() {
        boolean theReportsRun = true;

        while (theReportsRun) {
            System.out.println("Reports...");

            String userChoice = cScans.nextLine();

            switch (userChoice) {
                case "1":
                    ReportManager.monthToDate();
                    break;
                case "2":
                    break;
                case "3":
                    ReportManager.yearToDate();
                    break;
                case "4":
                    ReportManager.previousYear();
                    break;
                case "5":
                    ReportManager.searchVendor();
                    break;
                case "6":
                    ReportManager.customSearch();
                case "0":
                    theReportsRun = false;
                    break;
                default:
                    System.out.println("---");


            }
        }
    }
}