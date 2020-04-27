package springdata.componentmapping.Repository;

import org.springframework.data.repository.CrudRepository;
import springdata.componentmapping.Entities.Person;

public interface Personrepos extends CrudRepository<Person,Integer> {
}
