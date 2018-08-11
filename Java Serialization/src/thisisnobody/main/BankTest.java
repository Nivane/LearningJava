package thisisnobody.main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import thisisnobody.serialization.BankAccountSer;

public class BankTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BankAccountSer bank = new BankAccountSer();
		bank.setBalance(0);
		bank.setCustomer("0");
		bank.setId(0);
		bank.setPassword("0");

		BankAccountSer bank1 = new BankAccountSer();
		bank1.setBalance(1);
		bank1.setCustomer("1");
		bank1.setId(1);
		bank1.setPassword("1");

		File file = new File("c:/users/zlp/desktop/bankaccount");
		FileOutputStream fos = new FileOutputStream(file);

		// 序列化写入，将对象转换为二进制字节
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(bank);
		oos.writeObject(bank1);
		oos.flush();
		oos.close();
		fos.close();

		// 反序列化读取，将二进制字节恢复为对象

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<BankAccountSer> bankList = new ArrayList<BankAccountSer>();
		BankAccountSer ban;
		/*
		 * 这里判断ObjectOutputStream是否已经读到文件末尾的方法，是捕获一定会发生的异常EOFException并退出循环
		 * 不要使用(ban = (BankAccountSer) != null)方法，因为并没有定义读到文件末尾会返回null
		 */
		boolean check = true;
		while (check) {

			try {
				ban = (BankAccountSer) ois.readObject();
				bankList.add(ban);
			} catch (EOFException e) {
				check = false;
			}
		}

		for (BankAccountSer b : bankList) {
			System.out.println(b.getBalance());
			System.out.println(b.getCustomer());
			System.out.println(b.getId());
			System.out.println(b.getPassword());
		}
		ois.close();
		fis.close();

	}
}
