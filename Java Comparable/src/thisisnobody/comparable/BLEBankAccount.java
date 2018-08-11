package thisisnobody.comparable;

/**
 * 
 * @author ZLP
 * 实现Comparable接口的compareTo方法
 * 可以通过工具类Collections.sort(ArrayList<BLEBankAccount>)静态方法给该类排序
 */
public class BLEBankAccount implements Comparable<BLEBankAccount> {

	private String customer;
	private int id;
	private String password;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

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
	
	/*
	 *
	 */
	@Override
	public int compareTo(BLEBankAccount o) {
		return (this.getBalance() >= o.getBalance()) ? 1 : -1;
	}

}
