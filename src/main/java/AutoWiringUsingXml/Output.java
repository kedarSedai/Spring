package AutoWiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Output {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoxml.xml");
        Employee addCons = (Employee) context.getBean("employee");
        System.out.println(addCons);
    }
}
