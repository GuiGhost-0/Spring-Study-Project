import com.guighost.mapper.UserMapper;
import com.guighost.pojo.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.util.List;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：测试类
 */
public class MyTest {
    @Test
    public void test01() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> userList = userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
