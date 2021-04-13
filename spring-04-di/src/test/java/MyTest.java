import com.guighost.pojo.Student;
import com.guighost.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuiGhost
 * @date 2021/02/20
 * 说明：
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /**
         * Student{
         * name='鬼鬼',
         * address=Address{address='地球'},
         * book=[红楼梦, 西游戏, 水浒传, 三国演义],
         * hobbies=[听歌, 运动, 打豆豆],
         * card={身份证=450637200008086688, 银行卡=6888866666888668068},
         * games=[LOL, CS:GO],
         * wife='null',
         * info={password=ghost, driver=2018007, url=, username=root}}
         * */
    }

    @Test
    public void pNameSpaceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
