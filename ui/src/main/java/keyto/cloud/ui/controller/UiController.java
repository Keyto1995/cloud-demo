package keyto.cloud.ui.controller;

import keyto.cloud.ui.domain.Person;
import keyto.cloud.ui.service.PersonHystrixService;
import keyto.cloud.ui.service.SomeHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Keyto
 * Created on 2017/8/5
 */
@RestController
public class UiController {
    @GetMapping("")
    public Object index(){
        return "Hello World!";
    }

    @Autowired
    PersonHystrixService personHystrixService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> save(Person person) {
        return personHystrixService.save(person);
    }

    @Autowired
    SomeHystrixService someHystrixService;

    @GetMapping("/getsome")
    public String getSome(){
        return someHystrixService.getSome();
    }
}
