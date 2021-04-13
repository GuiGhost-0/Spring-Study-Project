package com.guighost.demo02;

/**
 * @author GuiGhost
 * @date 2021/02/22
 * 说明：代理角色
 */
public class UserServiceProxy implements UserService{
    UserServiceImpl userService = new UserServiceImpl();

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //新增日志方法
    public void log(String msg){
        System.out.println("[DeBug]使用了" + msg + "方法！");
    }
}
