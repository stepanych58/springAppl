import com.test.stbe.Employee;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args)
    {
        Employee employee = new Employee(1, "Sany", "Russia");
        System.out.println(employee);

        Resource resource = new ClassPathResource("emloy.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee employee1 = factory.getBean("emp1",Employee.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("emloy.xml");

        System.out.println(employee1);
    }
}
