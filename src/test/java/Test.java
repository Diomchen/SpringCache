import my.spring.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println("UserName" + userService.getUsernameById(1));
        System.out.println("UserName" + userService.getUsernameById(1));
    }
}
