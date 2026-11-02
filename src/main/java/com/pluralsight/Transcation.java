package com.pluralsight;

import java.time.LocalDateTime;

public class Transcation {
    private LocalDateTime ledgerDateTime;
    private String ledgerDescription;
    private String vendor;
    private double ledgerAmount;

    public double getLedgerAmount() {
        return ledgerAmount;
    }

    public void setLedgerAmount(double ledgerAmount) {
        this.ledgerAmount = ledgerAmount;
    }

    public LocalDateTime getLedgerDateTime() {
        return ledgerDateTime;
    }

    public void setLedgerDateTime(LocalDateTime ledgerDateTime) {
        this.ledgerDateTime = ledgerDateTime;
    }

    public String getLedgerDescription() {
        return ledgerDescription;
    }

    public void setLedgerDescription(String ledgerDescription) {
        this.ledgerDescription = ledgerDescription;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Transcation (LocalDateTime ledgerDateTime, String ledgerDescription, String vendor , double ledgerAmount ) {
        this.ledgerAmount = ledgerAmount;
        this.ledgerDateTime = ledgerDateTime;
        this.ledgerDescription = ledgerDescription;
        this.vendor = vendor;


    }
}
