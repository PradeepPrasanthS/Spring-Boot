package hello;

import org.springframework.data.annotation.Id;

public class Customer{
	@Id
	String id;
	
	String firstname;
	String lastname;
	String email;
	String mobile;
	
	public Customer(String firstname, String lastname, String email, String mobile){
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
	}
	
	public String toString() {
		return String.format("Customer[id=%s, firstname=%s, lastname=%s, "
				+ "email=%s, mobile=%s", id, firstname, lastname, email, mobile);
	}	
}