package keyto.cloud.ui.service;

import keyto.cloud.ui.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@FeignClient("person")
public interface PersonService {
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    @ResponseBody
    List<Person> save(Person person);
}
