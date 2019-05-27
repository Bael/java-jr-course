package io.github.bael.unit8;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/issues")
public class Unit8Application
{
    @PostMapping("/")
    public String test() {
        return "Hello world";
    }
}
