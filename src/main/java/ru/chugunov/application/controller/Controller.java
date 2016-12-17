package ru.chugunov.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.chugunov.application.services.Counter;

/**
 * @author Andrei Chugunov
 */
@RestController
public class Controller {

    private Counter counter;

    @Autowired
    Controller(Counter counter) {
        this.counter = counter;
    }

    @RequestMapping("/countDigits")
    public int countDigits(@RequestParam(value="str") String string) {
        return counter.count(string);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello! It is a Simple rest service.";
    }
}
