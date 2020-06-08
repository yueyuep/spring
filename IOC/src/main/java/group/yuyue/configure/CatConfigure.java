package group.yuyue.configure;


import group.yuyue.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by lp on 2020/5/14
 */
@Configuration
public class CatConfigure {
    @Bean
    public Cat cat() {
        return new Cat();
    }
}
