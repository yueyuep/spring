package group.yuyue;
import group.yuyue.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by lp on 2020/5/14
 */
public class TestBean2 {
    /*基于java配置实现bean得装配*/
    public static void main(String[] args) {
        /*加载配置类所在得包路径，初始化bean上下文信息*/
        ApplicationContext ac = new AnnotationConfigApplicationContext("group.yuyue.configure");
        Person person = (Person) ac.getBean("person");
        person.getPet().eat();
    }
}
