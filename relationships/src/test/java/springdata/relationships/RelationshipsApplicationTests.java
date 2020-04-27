package springdata.relationships;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springdata.relationships.Entities.Customer;
import springdata.relationships.Entities.PhoneNumber;
import springdata.relationships.Repository.Customerrepos;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class RelationshipsApplicationTests {

	@Autowired
	Customerrepos customerrepos;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateCustomer()
	{
		Customer customer=new Customer();
		customer.setName("john");

		Customer customer1=new Customer();
		customer1.setName("johny");

//		HashSet<PhoneNumber> numbers = new HashSet<PhoneNumber>();

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("123456789");
		ph1.setType("cell");
//		numbers.add(ph1);
//		ph1.setCustomer(customer);

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("0987654321");
		ph2.setType("home");
//		numbers.add(ph2);
//		ph1.setCustomer(customer);

//		customer.setNumbers(numbers);
		customer.addPhoneNumber(ph1);
		customer.addPhoneNumber(ph2);

		customerrepos.save(customer);
		customerrepos.save(customer1);

	}

	@Test
	@Transactional
	public void testLoadCustomer()
	{
		Optional <Customer> customer=customerrepos.findById(14l);
		System.out.println(customer.get().getName());
		Set<PhoneNumber>numbers=customer.get().getNumbers();
		numbers.forEach(p-> System.out.println(p.getNumber()));
	}

	@Test
//	@Transactional
	public void testUpdateCustomer()
	{
		Optional <Customer> customer=customerrepos.findById(14l);
		customer.get().setName("kohn bush");
		Set<PhoneNumber>numbers=customer.get().getNumbers();
		numbers.forEach(p-> p.setType("cell"));

//		customerrepos.save(customer);
	}
}
