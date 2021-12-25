package collectionInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionInject.xml");
        Student student = (Student) context.getBean("student2");
        System.out.println(student);
    }
}
