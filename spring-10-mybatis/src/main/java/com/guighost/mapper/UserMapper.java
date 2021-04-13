package com.guighost.mapper;

import com.guighost.pojo.User;

import java.util.List;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：
 */
public interface UserMapper {
    public List<User> selectUser();
}
