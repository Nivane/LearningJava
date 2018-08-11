package thisisnobody.day01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class OReillyByName {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getByName("www.oreilly.com");
			InetAddress address1 = InetAddress.getByName("208.201.239.100");
			System.out.println(address);
			System.out.println(address1);
			InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
			for (InetAddress a : addresses) {
				System.out.println(a);
			}
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);

			System.out.println("===============");
			byte[] address2 = { 107, 23, (byte) 216, (byte) 196 };
			InetAddress lessWrong = InetAddress.getByAddress(address2);
			System.out.println(lessWrong.getHostAddress());
			System.out.println(lessWrong.getHostName());
			InetAddress lessWrongWithname = InetAddress.getByAddress("lesswrong.com", address2);
			System.out.println(lessWrongWithname);

			InetAddress machine = InetAddress.getLocalHost();
			String localHost = machine.getHostName();
			String localHostAddress = machine.getHostAddress();
			String canonicalHostName = machine.getCanonicalHostName();
			byte[] localHostBytes = machine.getAddress();

			System.out.println("hostname: " + localHost);
			System.out.println("hostaddress: " + localHostAddress);
			System.out.println("canonical: " + canonicalHostName);
			for (byte b : localHostBytes) {
				System.out.print((b < 0 ? b + 256 : b) + ".");
			}

		} catch (UnknownHostException e) {
			System.out.println("cound not find www.oreilly.com");
		}

	}
}
