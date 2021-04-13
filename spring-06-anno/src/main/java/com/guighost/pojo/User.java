package com.guighost.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author GuiGhost
 * @date 2021/02/21
 * 说明：
 */
//等价于<bean id="user" class="com.guighost.pojo.User"/>
//@Component组件
@Component
@Scope("singleton")//单例模式
public class User {

    private String name;

    public String getName() {
        return name;
    }

    //相当于<property name="name" value="guighost"/>
    @Value("guighost")
    public void setName(String name) {
        this.name = name;
    }
}
