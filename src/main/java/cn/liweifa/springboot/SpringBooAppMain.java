package cn.liweifa.springboot;

import cn.liweifa.springboot.config.AuthorSettings;
import cn.liweifa.springboot.helloworld.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by josli on 17/10/17.
 */
@SpringBootApplication //启用 springboot 注解功能
@RestController
public class SpringBooAppMain {


    @Autowired
    private AuthorSettings authorSettings;
    private Logger logger = LoggerFactory.getLogger(SpringBooAppMain.class);
    @RequestMapping("/")
    public String home(){
        logger.info(authorSettings.getNameboot());
        logger.info(authorSettings.getAge()+"");
        return SpringBooAppMain.class.getName()+"  "+" "+ authorSettings.getNameboot()+authorSettings.getAge();
    }
    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(SpringBooAppMain.class, args);
    }

    @Autowired
    private HelloWorldService helloWorldService;
    @RequestMapping("/hello")
    public String sayHello(){
        return helloWorldService.sayHello();
    }
}
