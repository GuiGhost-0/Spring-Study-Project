package com.guighost.mapper;

import com.guighost.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author GuiGhost
 * @date 2021/02/24
 * 说明：在该类中注入SqlSessionTemplate，并实现我们写的业务接口
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUser() {
        User user = new User(5, "小王", "3345");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.delUser(4);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUser(id);
    }
}
