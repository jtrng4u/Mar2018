package trng.util;

import trng.jaxb.customer.Customer;

public class CustomerService {
	public boolean isElegible(Customer customer) {
		return customer.getSalary() > 1000;
	}
}
