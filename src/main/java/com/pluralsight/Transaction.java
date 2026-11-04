package com.pluralsight;

public class Transaction {
    private String ledgerDate;
    private String ledgerTime;
    private String ledgerDescription;
    private String vendor;
    private double ledgerAmount;

    public Transaction( String ledgerDate, String ledgerTime,
                        String ledgerDescription,
                        String vendor,
                        double ledgerAmount) {
        this.ledgerAmount = ledgerAmount;
        this.ledgerDate = ledgerDate;
        this.ledgerDescription = ledgerDescription;
        this.ledgerTime = ledgerTime;
        this.vendor = vendor;
    }

    public double getLedgerAmount() {
        return ledgerAmount;
    }

    public String getLedgerDate() {
        return ledgerDate;
    }

    public String getLedgerDescription() {
        return ledgerDescription;
    }

    public String getLedgerTime() {
        return ledgerTime;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return ledgerDate + "|" +
                ledgerTime + "|" +
                ledgerDescription + "|" +
                vendor + "|" + ledgerAmount;
    }
}