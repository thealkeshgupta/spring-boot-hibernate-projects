package com.alkeshgupta.aopdemo.dao;

import com.alkeshgupta.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;
    private String serviceCode;

    @Override
    public List<Account> findAccounts() {
        return findAccounts(false);
    }

    @Override
    public List<Account> findAccounts(boolean tripWire) {

        // for academic purpose ... simulate an exception

        if(tripWire) {
            throw new RuntimeException("No soup for you!!!!");
        } else {
            List<Account> myAccounts = new ArrayList<>();

            // create sample accounts
            Account temp1 = new Account("John", "Silver");
            Account temp2 = new Account("Madhu", "Platinum");
            Account temp3 = new Account("Luca", "Gold");

            // add them to our accounts list
            myAccounts.add(temp1);
            myAccounts.add(temp2);
            myAccounts.add(temp3);

            return myAccounts;
        }
    }

    @Override
    public void addAccount(Account theAccount, Boolean isActive) {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public String getName() {
        System.out.println(getClass() + " getName() called");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " setName() called");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + " getService() called");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + " setService() called");
        this.serviceCode = serviceCode;
    }
}
