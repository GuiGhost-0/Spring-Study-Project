import com.guighost.config.GhostConfig;
import com.guighost.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author GuiGhost
 * @date 2021/02/21
 * 说明：
 */
public class MyTest {
    @Test
    public void test(){
        /**
         * 如果完全使用了配置类方式去做，我们就只能通过ApplicationConfig上下文来获取容器，通过配置类的class对象加载
         * */
        ApplicationContext context = new AnnotationConfigApplicationContext(GhostConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
