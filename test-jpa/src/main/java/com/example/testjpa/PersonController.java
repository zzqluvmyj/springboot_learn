package com.example.testjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PersonController {


    private final PersonDao personDao;

    @Autowired
    public PersonController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping("/person/get")
    public Person getPerson(@RequestParam String id) {
        Integer i = Integer.parseInt(id);
        return personDao.getOne(i);
    }

    @GetMapping("/person/add")
    public Boolean addPerson(@RequestParam String name, @RequestParam Integer age) {
        personDao.save(new Person(name, age));
        return true;
    }
}
