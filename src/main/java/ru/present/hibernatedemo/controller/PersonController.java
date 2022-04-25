package ru.present.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.present.hibernatedemo.dto.PersonDto;
import ru.present.hibernatedemo.entity.Person;
import ru.present.hibernatedemo.mapper.PersonMapper;
import ru.present.hibernatedemo.repository.PersonRepository;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonRepository repository;
    @Autowired
    PersonMapper personMapper;

    @PostMapping("save")
    public PersonDto save(@RequestBody Person body) {
        return personMapper.toDto(repository.save(body));
    }

    @GetMapping("simple")
    public Person get() {
        return new Person();
    }


}
