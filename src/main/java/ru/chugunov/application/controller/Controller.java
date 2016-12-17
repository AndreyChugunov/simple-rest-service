package ru.chugunov.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.chugunov.application.repository.CounterRepository;
import ru.chugunov.application.services.Counter;

import java.util.List;

/**
 * @author Andrei Chugunov
 */
@RestController
public class Controller {

    private Counter counter;
    private CounterRepository counterRepository;

    @Autowired
    Controller(Counter counter, CounterRepository counterRepository) {
        this.counter = counter;
        this.counterRepository = counterRepository;
    }

    @RequestMapping("/countDigits")
    public int countDigits(@RequestParam(value="str") String string) {
        return counter.count(string);
    }

    @RequestMapping("/listProcessedStrings")
    public List getListProcessedStrings() {
        return counterRepository.getListProcessingStrings();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello! It is a Simple rest service.";
    }
}
