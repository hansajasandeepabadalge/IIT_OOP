package iit.tutorial.product_api_my_version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/number")
    public Integer number() {
        return 1;
    }

    @GetMapping("/bool")
    public Boolean bool() {
        return true;
    }

}
