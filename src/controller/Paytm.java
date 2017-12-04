package controller;

import model.Banking;

public class Paytm  implements InternetBanking{

	@Override
	public Banking currentAccount() {
		Banking bankObject = new Banking("AVi","01/06/96");
		bankObject.getUsername().equals("Avi");
		return bankObject;
		
		
	}

	@Override
	public void savingAccount() {
		System.out.println("savingaccount");
		
		
	}

	@Override
	public void ETransfer() {
	
		
	}

	@Override
	public void OnlineTransactions() {
		
		
	}

	@Override
	public void InternationMoneyTransfer() {
		
		
	}

}
