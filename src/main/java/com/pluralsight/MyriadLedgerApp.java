package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MyriadLedgerApp {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    static Scanner cScans = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        startupAnimation();
        homeScreen();
    }

    //? My main Menu
    public static void homeScreen() {

        //? Allows the app to keep running until the user exists
        boolean running = true;

        //TODO Displaying my home menu + Added some Colors
        System.out.println(CYAN + """
                
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                         > D) - Add Deposit
                
                         > P) - Make Payment(Debit)
                
                         > L) - Ledger
                
                         > X) - Exit Session
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                
                
                
                """ + RESET);

        System.out.println(WHITE + "Choose your option ?" + RESET);


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
        amount = -Math.abs(amount);

        Transaction transaction = new Transaction(LocalDate.now().toString(), LocalTime.now().toString(), description, vendor, amount);
        System.out.println("Payment Added!");

        /// Save Transaction
        FileManager.saveTransaction(transaction);
    }

    //* ----- LEDGER MENU -----
    public static void ledgerMenu() {

        boolean ledgerRunning = true;

        while (ledgerRunning) {
            System.out.println(YELLOW + """
                         ╔══════════════════════════════════════╗
                         ║            WELLNESS LEDGER           ║
                         ╠══════════════════════════════════════╣
                         ║                                      ║
                         ║  A) All Entries                      ║
                         ║  D) Deposits                         ║
                         ║  P) Payments                         ║
                         ║  R) Reports                          ║
                         ║  H) Home                             ║
                         ║                                      ║
                         ╚══════════════════════════════════════╝
                    """ + RESET);

            System.out.println(WHITE + "Choose your option->" + RESET);
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
            System.out.println(BLUE + """
╭──────────────────────────────────────────────╮
│                                              │
│              WELLNESS REPORTS                │
│                                              │
╰──────────────────────────────────────────────╯

  1 • Month To Date

  2 • Previous Month

  3 • Year To Date

  4 • Previous Year

  5 • Search By Vendor

  6 • Custom Search

  0 • Back

  H • Home

────────────────────────────────────────────────
""" + RESET);

            System.out.println("Choose your option -> ");

            String userChoice = cScans.nextLine();

            switch (userChoice) {
                case "1":
                    ReportManager.monthToDate();
                    break;
                case "2":
                    ReportManager.previousMonth();
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
                    break;
                case "0":
                    theReportsRun = false;
                    break;
                default:
                    System.out.println(BLUE + """
                            \n***********************************************
                            
                                             M Y R I A D
                            
                                             ANALYTICS HUB
                            
                                    Tracking Progress * Measuring Impact
                            
                            *************************************************
                            """ + CYAN);


            }
        }
    }

    public static void startupAnimation() throws InterruptedException {

        System.out.print("Connecting");
        Thread.sleep(400);

        System.out.print(".");
        Thread.sleep(400);

        System.out.print(".");
        Thread.sleep(400);

        System.out.print(".");
        Thread.sleep(800);

        System.out.println();
        System.out.println();

        System.out.println(YELLOW + """
                                    ✦ ✦ ✦
                
                ███╗   ███╗██╗   ██╗██████╗  ██╗ █████╗   ██████╗
                ████╗ ████║╚██╗ ██╔╝██╔══██╗ ██║ ██╔══██╗ ██╔══██╗
                ██╔████╔██║ ╚████╔╝ ██████╔╝ ██║ ███████║ ██║  ██║
                ██║╚██╔╝██║  ╚██╔╝  ██╔══██ ╗██ ║██╔══██║ ██║  ██║
                ██║ ╚═╝ ██║   ██║   ██║  ██║ ██ ║██║  ██║ ██████╔╝
                ╚═╝     ╚═╝   ╚═╝   ╚═╝  ╚═╝ ╚═ ╚═╝  ╚═╝ ╚═════╝
                
                                    ✦ ✦ ✦
                
                            Every Story Matters
                
                         Accessible Support Nationwide
                
                """ + RESET);

        Thread.sleep(3000);


    }
}