package trng.util;

import trng.jaxb.customer.Address;
import trng.jaxb.customer.Customer;

public class CustomerUtil {
	public static Customer createCustomer() {
		return new Customer();
	}
	
	public static Address createAddress() {
		return new Address();
	}
}
