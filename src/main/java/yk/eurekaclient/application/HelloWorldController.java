package yk.eurekaclient.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-worlds/{name}")
    public String getHelloWorld(@PathVariable String name) {
        return "Hello World " + name;
    }
}