package controller;

public abstract class IndianBankingSystem {
	
	public void currentAccount(){
		System.out.println("You cannot change my protocols");
	}
	
	public void savingAccount(){
		System.out.println("You cannot chnage my protocols");
	}

	public abstract void simpleInterest();
	public abstract void compundInterest();
}
