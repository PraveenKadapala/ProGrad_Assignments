package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class Validiptesting {
	
	
	Validip ip = new Validip();

	
	 @Test
	   public void trueValidip() {

	     assertTrue(ip.isValid("192.168.1.1"));
	     assertTrue(ip.isValid("1.1.1.1"));
	     assertTrue(ip.isValid("10.0.0.1"));
	     assertTrue(ip.isValid("127.0.0.1"));
	   }
	 @Test
	   public void FalseValidip() {
	     assertFalse(ip.isValid("10.0.1"));
	     assertFalse(ip.isValid("0.0.0.0"));
	     assertFalse(ip.isValid("255.255.255.255"));
	     assertFalse(ip.isValid("1.1.1.0"));
	   }
}