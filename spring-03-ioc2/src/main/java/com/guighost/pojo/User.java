package com.guighost.pojo;

/**
 * @author GuiGhost
 * @date 2021/02/19
 * 说明：用户实体类
 */
public class User {
    private String name;

//    public User(){
//        System.out.println("User的无参构造");
//    }

    public User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("name=" + name);
    }
}
