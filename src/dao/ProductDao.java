package dao;
import backend.*;


import java.util.*;;

public class ProductDao {
	public List<Customer> findAll(){
		
		List<Customer> listcustomer = new ArrayList<Customer>();
		
		listcustomer.add(new Customer("Kazi","Rahi","Kazirahi1234@gmail.com","01931584715","12135214225"));
		listcustomer.add(new Customer("Kazi","Rahi","Kazirahi1234@gmail.com","01931584715","12135214225"));
		return listcustomer;
	}
	public Customer search(String accno) {
		for(Customer customer:findAll()) {
			if(customer.getAccno().equals(accno))
				return customer;
			
		}
		return null;
		
	}

}
