package group.yuyue;

import group.yuyue.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by lp on 2020/5/13
 */
/*基于XML注解得方式bean得装配*/
public class TestBean1 {
    public static void main(String[] args) {
        /*注意我们*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ac.getBean("person");
        person.getPet().eat();
        System.out.println(ac.getBean("cat"));
        System.out.println(ac.getBean("person"));

    }
}
