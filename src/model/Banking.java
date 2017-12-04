package model;

/**
 * @author kaushikmazumder
 * This is Model , that we will pass between our desire classes , in order to achieve consistency 
 * 
 * Later think how can we use method overloading in models
 *
 */
public class Banking {

	String username;
	String id;
	int accountNumber;
	String DOB;
	
	
	public Banking(String username, String id, int accountNumber, String dOB) {
		super();
		this.username = username;
		this.id = id;
		this.accountNumber = accountNumber;
		DOB = dOB;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	
	
}
