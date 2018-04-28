package trng.util;

import trng.jaxb.customer.Customer;

public class CustomerService {
	public boolean doMore(Customer customer) {
		return customer.getSalary() > 1000;
	}
	
	public boolean isElegible(Customer customer) {
		return customer.getSalary() > 1000;
	}
	
	public boolean doOther(Customer customer) {
		return customer.getSalary() > 1000;
	}
}
