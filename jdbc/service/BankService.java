package com.htc.jdbc.service;

import java.sql.SQLException;

import com.htc.jdbc.exception.AccountNotFoundException;
import com.htc.jdbc.exception.InsufficientBalanceException;
import com.htc.jdbc.model.Account;

public interface BankService {

	public void fundTransfer(Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
}
