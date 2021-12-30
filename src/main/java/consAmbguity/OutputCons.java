package consAmbguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputCons {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consAmgConfig.xml");
        AddCons addCons = (AddCons) context.getBean("consAmg");
        addCons.sum();
    }
}
