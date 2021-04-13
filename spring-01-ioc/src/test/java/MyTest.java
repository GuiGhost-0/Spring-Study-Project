import com.guighost.dao.UserDaoSqlServerImpl;
import com.guighost.service.UserService;
import com.guighost.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuiGhost
 * @date 2021/02/17
 * 说明：
 */
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，需要什么，就直接get什么
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }
}
