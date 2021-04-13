import com.guighost.pojo.User;
import com.guighost.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuiGhost
 * @date 2021/02/19
 * 说明：
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT userT = (UserT) context.getBean("u2");
        userT.show();
    }
}
