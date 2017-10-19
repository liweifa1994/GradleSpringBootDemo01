package cn.liweifa.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:book.properties") //用来加载类路径下的app.properties 这个注解必须要有
@Configuration //表明这是一个配置类 这个注解必须要有
@ConfigurationProperties(prefix = "book")//表明这是一个配置类 这个注解必须要有
public class AuthorSettings {

    private String nameboot;
    private int age;

    public String getNameboot() {
        return nameboot;
    }

    public void setNameboot(String nameboot) {
        this.nameboot = nameboot;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
