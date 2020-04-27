package springdata.inheritancemapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springdata.inheritancemapping.Entities.Check;
import springdata.inheritancemapping.Entities.CreditCard;
import springdata.inheritancemapping.Repository.Paymentrepos;

@SpringBootTest
class InheritancemappingApplicationTests {

	@Autowired
	Paymentrepos paymentrepos;

	@Test
	void contextLoads() {
	}

	@Test
	public void createpayment()
	{
		CreditCard cc=new CreditCard();
		cc.setId(12);
		cc.setAmount(12345);
		cc.setCardnumber("123456");
		paymentrepos.save(cc);
	}

	@Test
	public void createcheckpayment()
	{
		Check ch =new Check();
		ch.setId(123);
		ch.setAmount(123456);
		ch.setCheckNumber("1234567");
		paymentrepos.save(ch);
	}
}
