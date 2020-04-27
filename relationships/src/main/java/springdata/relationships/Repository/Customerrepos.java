package springdata.relationships.Repository;

import org.springframework.data.repository.CrudRepository;
import springdata.relationships.Entities.Customer;

public interface Customerrepos extends CrudRepository <Customer,Long>
{

}
