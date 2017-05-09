package main.java.com.banking;

public class AccountInfo {
	
	String typeOfAccount;
	double interestRate;
	double creditLimit;
	double dailyWithdrawLimit;
	double minBalance;
	double serviceCharges;
	
	
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getServiceCharges() {
		return serviceCharges;
	}
	public void setServiceCharges(double serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	
}
