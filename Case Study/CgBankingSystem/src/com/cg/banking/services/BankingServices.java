package com.cg.banking.services;
import java.util.List;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotfoundException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;

public interface BankingServices {
long openAccount(String accountType,float initBalance)
		throws InvalidAmountException,InvalidAccountTypeException,BankingServicesDownException;
float  depositAccount(long accountNo,float amount)
		throws AccountNotfoundException,BankingServicesDownException,AccountBlockedException;
float withdrawAmount(long accountNo,float amount,int pinNumber)
		throws InsufficientAmountException, InvalidAccountTypeException, BankingServicesDownException;
boolean fundTransfer(long accountNoTo,long accountNoFrom,float transferAmount,int pinNumber)
		throws  InsufficientAmountException,AccountNotfoundException, InvalidPinNumberException,BankingServicesDownException,AccountBlockedException;
Account getAccountDetails(long accountNo)
		throws AccountNotfoundException,BankingServicesDownException;
List<Account> getAllAccountDetails()
		throws BankingServicesDownException;
List<Transaction> getAccountAllTransaction(long accountNo)
		throws BankingServicesDownException,AccountNotfoundException;
public String accountStatus(long accountNo)
		throws BankingServicesDownException,AccountNotfoundException,AccountBlockedException;
}
