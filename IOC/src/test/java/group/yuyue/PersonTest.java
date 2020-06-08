package group.yuyue;

import group.yuyue.configure.ComponentConfigure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Create by lp on 2020/6/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentConfigure.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void prin() {
        System.out.println(person);
    }
}