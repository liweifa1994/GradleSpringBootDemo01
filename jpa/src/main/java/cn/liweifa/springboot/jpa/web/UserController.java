package cn.liweifa.springboot.jpa.web;

import cn.liweifa.springboot.jpa.dao.PersonRepository;
import cn.liweifa.springboot.jpa.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public Person inserUser(Person person){
       return personRepository.save(person);
    }

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<Person> inserUser(){
        return personRepository.findAll();
    }


}
