package keyto.cloud.person.repository;

import keyto.cloud.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Keyto
 * @create 2017/8/5
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
