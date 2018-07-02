package thisisnobody.comparator;

import java.util.Comparator;
/**
 * 
 * @author ZLP
 * 实现Comparator接口
 * 使用Collections.sort(ArrayList<TORBankAccount>, TORBankAccount)实现排序
 * 因为TORBankAccount实现了Comparator的compare方法
 */
public class TORBankAccount implements Comparator<TORBankAccount> {

	private String customer;
	private int id;
	private String password;

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

	private double balance;
	
	/*
	 * 
	 */
	@Override
	public int compare(TORBankAccount arg0, TORBankAccount arg1) {

		return (arg0.getBalance() >= arg1.getBalance()) ? 1 : -1;
	}

}
