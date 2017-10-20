package cn.liweifa.webdemo02.test;

import cn.liweifa.springboot.webdemo02.config.RootConfig;
import cn.liweifa.springboot.webdemo02.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by josli on 17/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RootConfig.class)
public class ExcuteTest {

    @Resource(name = "userService")
    private UserService userService;
    @Test
    public void test(){
        userService.executeTask();
    }
}
