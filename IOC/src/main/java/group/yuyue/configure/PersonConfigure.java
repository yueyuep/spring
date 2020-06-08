package group.yuyue.configure;


import group.yuyue.Cat;
import group.yuyue.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by lp on 2020/5/14
 */
@Configuration
public class PersonConfigure {
    /*这里得cat不是我们自己生成得，是容器根据依赖关系自己注入的（反射）确保我们的cat已经在bean容器中*/
    @Bean
    public Person person(Cat cat) {
        String name = "lipeng";
        int age = 25;
        return new Person(name, age, cat);
    }

    @Bean
    public Person person() {
        return new Person();
    }


}
