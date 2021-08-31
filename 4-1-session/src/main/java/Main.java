import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("ApplicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Student student = (Student) beanFactory.getBean("StudentBean");
        student.printInfo();
    }
}
