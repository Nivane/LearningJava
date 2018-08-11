package thisisnobody.day01.networkinterface;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * 
 * @author ZLP
 * NetworkInterface test
 */
public class NetworkInterfaceTest {
	public static void main(String[] args) throws IOException {
		//getByName()
		NetworkInterface ni = NetworkInterface.getByName("eth0");
		if (ni == null) {
			System.err.println("No such interface: eth0");
		} else {
			System.out.println(ni.getDisplayName());
		}

		//getByInetAddress()
		InetAddress local = InetAddress.getByName("127.0.0.1");
		NetworkInterface ni1 = NetworkInterface.getByInetAddress(local);
		if (ni1 == null) {
			System.err.println("No local loopback address.");
		} else {
			System.out.println(ni1.getDisplayName());
		}
		
		//getNetworkInterfaces()
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		while (interfaces.hasMoreElements()) {
			NetworkInterface n = interfaces.nextElement();
			System.out.println(n);
		}
		
		System.out.println("================");
		
		//getInetAddress
		NetworkInterface eth0 = NetworkInterface.getByName("eth0");
		Enumeration<InetAddress> addresses =  eth0.getInetAddresses();
		while(addresses.hasMoreElements()) {
			System.out.println(addresses.nextElement());
		}
		
		
		
	}
}
