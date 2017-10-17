package cn.liweifa.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by josli on 17/10/17.
 */
@SpringBootApplication
@RestController
public class SpringBooAppMain {

    private Logger logger = LoggerFactory.getLogger(SpringBooAppMain.class);
    @RequestMapping("/")
    public String home(){
        logger.info("request begin ");
        logger.info("request begin 123123");
        return SpringBooAppMain.class.getName();
    }
    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(SpringBooAppMain.class, args);
    }
}
