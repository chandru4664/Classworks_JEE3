package com.htc.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.htc.jdbc.exception.AccountNotFoundException;
import com.htc.jdbc.exception.InsufficientBalanceException;
import com.htc.jdbc.model.Account;

public interface BankDAO {

	public void withdraw(Connection connection,Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
	public void deposit(Connection connection,Account fromAccount,Account toAccount,Double amount)throws SQLException, AccountNotFoundException;
}
