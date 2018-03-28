package com.htc.jdbc.client;

import java.sql.SQLException;

import com.htc.jdbc.exception.AccountNotFoundException;
import com.htc.jdbc.exception.InsufficientBalanceException;
import com.htc.jdbc.model.Account;
import com.htc.jdbc.service.BankService;
import com.htc.jdbc.service.BankServiceImpl;

public class ClientTest {

	public static void main(String[] args) {
		
		BankService bankService = new BankServiceImpl();
		
		Double transferAmout = 2000.00;
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(112233L);
		
		Account toAccount = new Account();
		toAccount.setAccountNumber(22778L);
		
		try {
			bankService.fundTransfer(fromAccount, toAccount, transferAmout);
		} catch (SQLException | AccountNotFoundException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
