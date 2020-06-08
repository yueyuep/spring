package group.yuyue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Create by lp on 2020/6/8
 * 基于注解的配置类（配置扫描的包）,默认配置类所在的包为基础包，进行扫描
 */
@Configuration
@ComponentScan()
@EnableAspectJAutoProxy
public class Configure {
}
