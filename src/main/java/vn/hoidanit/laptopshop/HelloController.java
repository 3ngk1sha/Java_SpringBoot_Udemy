package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.J;

@RestController

public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot!";
    }

}
