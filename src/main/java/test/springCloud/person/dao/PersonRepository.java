package test.springCloud.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.springCloud.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
