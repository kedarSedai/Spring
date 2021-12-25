package ConstructorInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsOutput {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consInject.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
