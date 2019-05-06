package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstname (String firstname);
    public List<Customer> findByLastname (String lastname);
    public List<Customer> deleteByFirstname (String firstname);
}