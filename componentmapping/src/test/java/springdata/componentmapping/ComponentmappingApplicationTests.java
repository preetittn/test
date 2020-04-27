package springdata.componentmapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springdata.componentmapping.Entities.Address;
import springdata.componentmapping.Entities.Person;
import springdata.componentmapping.Repository.Personrepos;

@SpringBootTest
class ComponentmappingApplicationTests {

	@Autowired
	Personrepos personrepos;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Person person=new Person();
		person.setId(1);
		person.setName("preeti");
		Address address=new Address();
		person.setAddress(address);
		address.setCity("delhi");
		address.setState("new delhi");
		address.setStreetaddress("mehrauli");
		address.setCountry("India");
		address.setZipcode("110030");

		personrepos.save(person);
	}
}
