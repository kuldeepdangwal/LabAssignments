package com.cg.banking.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int transactionId;
	private float amount;
	private String transactionType;
	@ManyToOne
	private Account account;
	
	public Transaction()
	{
		
	}
	/*public Transaction(int transactionId , float amount , String transactionType)
	{
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		
	}*/
	
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", transactionType="
				+ transactionType + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + transactionId;
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}


	public Transaction(float amount2, String transactionType2, Account accnt) {
		this.amount = amount2;
		this.transactionType = transactionType2;
		this.account=accnt;
	}
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	
	public int getTransactionId()
	{
		return 0;
	}
}
