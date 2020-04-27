package springdata.inheritancemapping.Repository;

import org.springframework.data.repository.CrudRepository;
import springdata.inheritancemapping.Entities.Payment;

public interface Paymentrepos extends CrudRepository<Payment,Integer> {
}
