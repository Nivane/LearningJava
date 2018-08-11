package thisisnobody.day01.inetaddress;

import java.io.IOException;
import java.net.InetAddress;

public class IBiblioAliases {
	public static void main(String[] args) throws IOException {

		InetAddress address = InetAddress.getByName("www.baidu.com");
		InetAddress address1 = InetAddress.getByName("fanyi.baidu.com");
		InetAddress address2 = InetAddress.getByName("fanyi.baidu.com");

		if (address.equals(address1)) {
			System.out.println("same");
		} else {
			System.out.println("different");
			System.out.println(address);
			System.out.println(address1);

		}

		if (address2.equals(address1)) {
			System.out.println("same");
		} else {
			System.out.println("different");
			System.out.println(address2);
			System.out.println(address1);

		}

	}
}
