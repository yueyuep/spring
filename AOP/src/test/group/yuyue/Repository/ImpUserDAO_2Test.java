package group.yuyue.Repository;

import group.yuyue.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Create by lp on 2020/6/6
 * 测试基于前置通知的AOP(基于XMl文件配置)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/beans.xml")
public class ImpUserDAO_2Test {
    @Autowired
    private ImpUserDAO_2 impUserDAO_2;

    @Test
    public void findById() {
        User user = impUserDAO_2.findById(1);
    }

    @Test
    public void findAll() {
        impUserDAO_2.findAll();
    }

    @Test
    public void inserUser() {
        User user = null;
        impUserDAO_2.inserUser(user);
    }

    @Test
    public void deleteUser() {
        impUserDAO_2.deleteUser(1);

    }
}