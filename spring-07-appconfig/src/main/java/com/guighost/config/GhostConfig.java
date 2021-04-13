package com.guighost.config;

import com.guighost.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author GuiGhost
 * @date 2021/02/21
 * 说明：
 */
@Configuration
@ComponentScan("com.guighost.pojo")
@Import(GhostConfig2.class)
/**
 * 这个也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component
 * @Configuration 代表这是一个配置类，就相当于之前的beans.xml
 * */
public class GhostConfig {
    /**
     * 注册一个bean，就相当于我们写了一个bean标签
     * 这个方法的名字，就相当于bean标签中的id属性
     * 而这个方法的返回值，就相当于bean标签中的class属性
     * */
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}
