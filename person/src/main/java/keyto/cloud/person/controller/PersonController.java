package keyto.cloud.person.controller;

import keyto.cloud.person.domain.Person;
import keyto.cloud.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody Person person) {
        personRepository.save(person);
        List<Person> people = personRepository.findAll(new PageRequest(0, 10)).getContent();
        return people;
    }
}
