package cn.liweifa.springboot.webdemo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by josli on 17/10/19.
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "cn.liweifa.springboot.webdemo02.web")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }

}
