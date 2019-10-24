//Account Class Created
class Account{
	protected int balance;//Integer type variable
	public int  withdraw(int amount)//withdraw method with int return type 
	{
		this.balance = this.balance - amount;	
		return amount;
	}
}
class SavingAccount extends Account{		//savingAccount class extending Account class 
	private double defaultIntrestRate = 2.5;		
	private double interestRate;				
	public setDefaultInterestRate(doule interestRate)
	{	

	}
	public applyMonthlyInterest(){

	}
}
