package com.pluralsight;

import java.util.Scanner;

public class MyriadLedgerApp {
    static Scanner cScans = new Scanner(System.in);
    public static void main(String[] args) {
        homeScreen();

        //Fancy header;


        boolean running = true;

        while (running) {
            String userChoice = cScans.nextLine.toUpperCase();

            switch (userChoice) {
                case "D":
                    addDeposit();
                    break;
                case "P":
                    makePayment();
                    break;
                case "L":
                    ledgerMenu();
                    break;
                case "X":
                    running = false;
                    System.out.println("Thank you for...");
                    break;

                default:
                    System.out.println("Invalid select");
            }

        }
    }  // Adding deposit
    public static void addDeposit() {


    }
    public static void makePayment() {

    }

    public static void ledgerMenu() {

        boolean ledgerRunning = true;

        while (ledgerRunning) {
            System.out.println("A)");
            String choice = cScans.nextLine().toUppercase();

            switch (choice) {

                case "A":
                    displayAll();
                    break;
                case "D":
                    displayDeposits();
                    break;
                case "P":
                    displayPayments();
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
    public static void displayAll() {
    }

    public static void displayDeposits() {
    }
    public static void displayPayments() {
    }
    public static void reportsMenu() {
        boolean reportsRunning = true;

        while (reportsRunning) {
            System.out.println("Reports");

    }











    }
}