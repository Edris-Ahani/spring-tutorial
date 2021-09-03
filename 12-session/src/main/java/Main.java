import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Employee e1 = (Employee) context.getBean("e1");
        e1.show();

        Employee e2 = (Employee) context.getBean("e2");
        e2.show();
    }
}
