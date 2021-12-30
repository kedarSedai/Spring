package AutoWiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Output {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationconfig.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
