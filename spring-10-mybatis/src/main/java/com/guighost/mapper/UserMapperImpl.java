package com.guighost.mapper;

import com.guighost.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author GuiGhost
 * @date 2021/02/24
 * 说明：在该类中注入SqlSessionTemplate，并实现我们写的业务接口
 */
public class UserMapperImpl implements UserMapper{

    //原来，我们的所有操作，都是用sqlSession来执行；现在都使用SqlSessionTemplate
    public SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUser();
    }
}
