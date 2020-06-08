package group.yuyue;

import group.yuyue.IOC.base.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Create by lp on 2020/5/13
 */
@Component
public class Person {
    String name;
    int age;
    Animal pet;

    public Person() {
        System.out.println("初始化Person");

    }

    /*带参的构造函数*/
    @Autowired
    public Person(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }
}
