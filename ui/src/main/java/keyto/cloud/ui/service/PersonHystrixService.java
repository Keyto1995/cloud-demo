package keyto.cloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import keyto.cloud.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@Service
public class PersonHystrixService {
    @Autowired
    PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<Person> save(Person person) {
        return personService.save(person);
    }

    public List<Person> fallbackSave(Person person) {
        List<Person> list = new ArrayList<>();
        Person p = new Person("Person Service 故障");
        list.add(p);
        list.add(person);
        return list;
    }
}
