import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee = (Employee) context.getBean("e1");
        employee.displayInfo();
    }
}
