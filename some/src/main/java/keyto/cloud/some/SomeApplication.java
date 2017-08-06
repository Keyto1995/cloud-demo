package keyto.cloud.some;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class,args);
    }
}
