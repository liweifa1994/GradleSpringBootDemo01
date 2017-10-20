package cn.liweifa.springboot.webdemo02.web;

import cn.liweifa.springboot.webdemo02.model.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by josli on 17/10/19.
 */
@Controller
public class IndexController {
//
//

    /**
     * @param model
     * @return
     * @RequestMapping(value = "/json",produces = {MediaType.APPLICATION_JSON_VALUE})
     * 使用以上配置为返回json  produces = {MediaType.APPLICATION_JSON_VALUE}
     * 如果不加  produces = {MediaType.APPLICATION_JSON_VALUE} 那么会出现一大堆错误
     * This application has no explicit mapping for /error, so you are seeing this as a fallback.
     * Thu Oct 19 14:28:54 CST 2017
     * There was an unexpected error (type=Internal Server Error, status=500).
     * Error resolving template "jsonView", template might not exist or might not be accessible by any of the configured Template Resolvers
     */
    @RequestMapping(value = "/json",produces = {MediaType.APPLICATION_JSON_VALUE})
    public String json(Model model) {
        Person person = new Person("java", 20);
        model.addAttribute(person);
        model.addAttribute(123);
        model.addAttribute(123f);
        //必须返回jsonView字符串 因为他会查找 bean 为 jsonview 来渲染
        return "jsonView";
    }

    @RequestMapping(value = "/us/myServlet")
    @ResponseBody
    public String myServlet(){
        return "myServlet";
    }
}
