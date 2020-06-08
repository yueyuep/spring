package group.yuyue;

import group.yuyue.IOC.base.Animal;
import org.springframework.stereotype.Component;

/**
 * Create by lp on 2020/5/13
 */
@Component
public class Cat implements Animal {
    public Cat() {
        System.out.println("初始化");
    }

    public void eat() {
        System.out.println("猫吃鱼");

    }
}
