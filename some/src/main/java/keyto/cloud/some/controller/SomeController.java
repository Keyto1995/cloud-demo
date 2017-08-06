package keyto.cloud.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@RestController
public class SomeController {
    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/getsome")
    public String getSome() {
        return message;
    }
}
