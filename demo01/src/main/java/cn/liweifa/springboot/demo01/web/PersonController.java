package cn.liweifa.springboot.demo01.web;

import cn.liweifa.springboot.demo01.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josli on 17/10/18.
 */

@Controller
public class PersonController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("java",12));
        personList.add(new Person("c",13));
        personList.add(new Person("C++",14));
        personList.add(new Person("china",18));
        model.addAttribute(personList);
        model.addAttribute(new Person("VB",18));
        return "index";
    }


}
