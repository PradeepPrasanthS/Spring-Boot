package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repository;
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
		repository.save(new Customer("Pradeep","Prasanth","pradeep@gmail.com","8903716126"));
		repository.save(new Customer("Harideep","Prasanth","pradeep@gmail.com","8903716126"));
		repository.save(new Customer("Mukesh", "Sivakumar", "mukesh@gmail.com", "9456783210"));
		
		System.out.println("All Customer Details");
		for(Customer customer: repository.findAll()) {
			System.out.println(customer);
		}
		
		System.out.println("Customer with firstname Pradeep");
		System.out.println(repository.findByFirstname("Pradeep"));
		System.out.println("Customer with lastname Sivakumar");
		System.out.println(repository.findByLastname("Sivakumar"));
		
		System.out.println("Customer with lastname Prasanth");
		for(Customer customer: repository.findByLastname("Prasanth")) {
			System.out.println(customer);
		}
		
		repository.deleteByFirstname("Pradeep");
		System.out.println("Customers after deletion");
		for(Customer customer: repository.findAll()) {
			System.out.println(customer);
		}
		
		repository.insert(new Customer("Dharshan", "Kannan", "dharshan@gmail.com", "9638527410"));
		System.out.println("Customers after insertion");
		for(Customer customer: repository.findAll()) {
			System.out.println(customer);
		}
		
		
		
	}
	
}
