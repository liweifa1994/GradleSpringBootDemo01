package cn.liweifa.springboot.webdemo02.service.impl;

import cn.liweifa.springboot.webdemo02.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by josli on 17/10/19.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private static ThreadPoolTaskExecutor threadPoolTaskExecutor;
    protected static int                   corePoolSize = 5;
    protected static int                   maxPoolSize = 20;
    static {
        threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(corePoolSize);
        threadPoolTaskExecutor.setMaxPoolSize(maxPoolSize);
        threadPoolTaskExecutor.initialize();
    }
    @Override
    public boolean executeTask() {
        List<String> names = Arrays.asList("1","2","3","4","6","5","7");
        List<Future<Boolean>> futureList = new ArrayList<>();
        int successCount = 0;
        names.forEach(name->{
            Future<Boolean> future = threadPoolTaskExecutor.submit(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name);
                    return Boolean.TRUE;
                }
            });
            futureList.add(future);
        });
        try {
            for (Future<Boolean> future:futureList){
                if (future.get()){
                    ++successCount;
                }
            }
            System.out.println(successCount);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }

        return Boolean.TRUE;
    }
}
