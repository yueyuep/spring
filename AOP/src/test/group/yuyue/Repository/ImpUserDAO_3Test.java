package group.yuyue.Repository;

import group.yuyue.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Create by lp on 2020/6/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/beans.xml")
public class ImpUserDAO_3Test {
    @Autowired
    private ImpUserDAO_3 impUserDAO_3;

    @Test
    public void findById() {
        User user = impUserDAO_3.findById(1);
    }

    @Test
    public void findAll() {
        impUserDAO_3.findAll();
    }

    @Test
    public void inserUser() {
        User user = null;
        impUserDAO_3.inserUser(user);
    }

    @Test
    public void deleteUser() {
        impUserDAO_3.deleteUser(1);

    }
}