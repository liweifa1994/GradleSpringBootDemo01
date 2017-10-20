package cn.liweifa.springboot.webdemo02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Created by josli on 17/10/19.
 */
@Configuration
public class WebConfig {

    @Bean
    public MappingJackson2JsonView jsonView(){
        MappingJackson2JsonView jackson2JsonView = new MappingJackson2JsonView();
        return jackson2JsonView;
    }


}
