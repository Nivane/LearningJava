package thisisnobody.day01.spamcheck;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ByName {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress addr1 = InetAddress.getByName("www.163.com");
		InetAddress addr2 = InetAddress.getByName(addr1.getHostAddress());

		System.out.println(addr1);
		System.out.println(addr1.getHostName());
		System.out.println(addr1.getHostAddress());
		System.out.println(addr1.getCanonicalHostName());
		byte[] adds = addr1.getAddress();
		for (byte add : adds) {
			System.out.print((add < 0 ? add + 256 : add) + ".");
		}
		System.out.println();
		System.out.println(addr1.getHostName());
		System.out.println(addr1 == addr2);

		System.out.println("=============");
		System.out.println(addr2);
		System.out.println(addr2.getHostName());
		System.out.println(addr2.getHostAddress());
		System.out.println(addr2.getCanonicalHostName());
		byte[] adds2 = addr2.getAddress();
		for (byte add : adds2) {
			System.out.print((add < 0 ? add + 256 : add) + ".");
		}
		System.out.println();
		System.out.println(addr2.getHostName());
	}
}
