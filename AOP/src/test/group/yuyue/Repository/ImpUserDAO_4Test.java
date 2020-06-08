package group.yuyue.Repository;

import group.yuyue.Configure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Create by lp on 2020/6/8
 * 注意：在使用基于注解的AOP的时候，这里的后置通知和异常通知的执行顺序是有问题的。可以使用环绕通知来解决
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configure.class)
public class ImpUserDAO_4Test {
    @Autowired
    ImpUserDAO_4 impUserDAO_4;

    @Test
    public void findById() {
        impUserDAO_4.findById(1);

    }
}