package thisisnobody.bank;

import java.util.ArrayList;
import java.util.Collections;

import thisisnobody.comparable.BLEBankAccount;
import thisisnobody.comparator.TORBankAccount;

public class Bank {

	public static void main(String[] args) {
		/*
		 * Comparable接口实例
		 */
		BLEBankAccount b1 = new BLEBankAccount();
		b1.setBalance(200);
		BLEBankAccount b2 = new BLEBankAccount();
		b2.setBalance(100);
		BLEBankAccount b3 = new BLEBankAccount();
		b3.setBalance(1000);
		BLEBankAccount b4 = new BLEBankAccount();
		b4.setBalance(10000);
		BLEBankAccount b5 = new BLEBankAccount();
		b5.setBalance(100000);

		ArrayList<BLEBankAccount> list = new ArrayList<BLEBankAccount>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		printBLE(list);
		Collections.sort(list);
		System.out.println("===============");
		printBLE(list);

		System.out.println("===============");
		System.out.println("===============");
		
		
		/*
		 * Comparator接口实例
		 */
		TORBankAccount t1 = new TORBankAccount();
		t1.setBalance(200);
		TORBankAccount t2 = new TORBankAccount();
		t2.setBalance(100);
		TORBankAccount t3 = new TORBankAccount();
		t3.setBalance(1100);
		TORBankAccount t4 = new TORBankAccount();
		t4.setBalance(11100);
		TORBankAccount t5 = new TORBankAccount();
		t5.setBalance(3300);

		ArrayList<TORBankAccount> list1 = new ArrayList<TORBankAccount>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		list1.add(t4);
		list1.add(t5);
		printTOR(list1);
		System.out.println("===============");
		Collections.sort(list1, new TORBankAccount());
		printTOR(list1);

	}

	private static void printBLE(ArrayList<BLEBankAccount> list) {

		for (BLEBankAccount i : list) {
			System.out.println(i.getBalance());
		}
	}

	private static void printTOR(ArrayList<TORBankAccount> list) {

		for (TORBankAccount i : list) {
			System.out.println(i.getBalance());
		}
	}
}
