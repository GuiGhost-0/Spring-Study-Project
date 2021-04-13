import com.guighost.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuiGhost
 * @date 2021/02/17
 * 说明：
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了，要使用，直接去取出来即可
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
