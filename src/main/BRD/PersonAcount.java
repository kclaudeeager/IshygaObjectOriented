package main.BRD;

import java.util.Date;

import main.Citizen;

public class PersonAcount extends Citizen{
    private String accountNumber;
    private long amountOnBank;
    public PersonAcount(){

    }
    public PersonAcount(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public PersonAcount(String nId, Date dateOfBirth, char sex, String names, String accountNumber, long amountOnBank) {
        super(nId, dateOfBirth, sex, names);
        this.accountNumber = accountNumber;
        this.amountOnBank = amountOnBank;
    }
    public PersonAcount(String accountNumber, long amountOnBank) {
        this.accountNumber = accountNumber;
        this.amountOnBank = amountOnBank;
    }
    public PersonAcount(String names, String accountNumber, long amountOnBank) {
        super(names);
        this.accountNumber = accountNumber;
        this.amountOnBank = amountOnBank;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAmountOnBank() {
        return amountOnBank;
    }
    public void setAmountOnBank(long amountOnBank) {
        this.amountOnBank = amountOnBank;
    }
    @Override
    public String toString() {
        return "PersonAcount [accountNumber=" + accountNumber + ", amountOnBank=" + amountOnBank + "]";
    }

}