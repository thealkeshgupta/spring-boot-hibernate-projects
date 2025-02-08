package com.alkeshgupta.aopdemo.dao;

import com.alkeshgupta.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    // add a new method: findAccounts()
    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);

    void addAccount(Account theAccount, Boolean isActive);

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

}
