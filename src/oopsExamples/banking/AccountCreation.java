package oopsExamples.banking;


public class AccountCreation {
	
	public void SaveProfileInfo(String name, String dob,String address,String phone){
		
		//create object refence 
		Profile pObj = new Profile();
		pObj.setName(name);
		pObj.setAddress(address);
		pObj.setPhone(phone);
		pObj.setDob(dob);
		
		System.out.println(pObj);
		
		//new logic to make database call to save this info into any database like oracle/SQL server
				
	}
	
	public void saveAccountInfo(String typeOfAccount,double creditLimit,double interestRate){
		
		AccountInfo ainfo = new AccountInfo();
		ainfo.setTypeOfAccount(typeOfAccount);
		ainfo.setCreditLimit(creditLimit);
		ainfo.setInterestRate(interestRate);
		
		//add logic to make database call to save int in oracle/SQL Server
	}
	
	public static void main(String[] args) {
		
		AccountCreation acreate = new AccountCreation();
		acreate.SaveProfileInfo("Anisha","06/28/1985", "10034 foxboror","510-509");
		
	}

}
