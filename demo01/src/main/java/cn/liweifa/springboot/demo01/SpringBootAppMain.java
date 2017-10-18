package cn.liweifa.springboot.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by josli on 17/10/18.
 */
@SpringBootApplication
public class SpringBootAppMain {

    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(SpringBootAppMain.class, args);
    }
}
