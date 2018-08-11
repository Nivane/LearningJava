package thisisnobody.serialization;

import java.io.Serializable;

public class BankAccountSer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customer;
	private int id;
	private String password;
	private double balance;
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
