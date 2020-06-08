package group.yuyue.Repository;

import group.yuyue.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by lp on 2020/6/8
 * spring种基于注解的aop
 * 注意测试类种不要再扫描我们额xml来获取spring的应用上下文。要采用组件扫描
 */
@Repository
public class ImpUserDAO_4 {
    public User findById(int id) {
        System.out.println("实现按照id进行查找");
        return null;
    }


    public List<User> findAll() {
        System.out.println("实现查找所有用户");
        return null;

    }


    public boolean inserUser(User user) {
        System.out.println("实现插入用户");
        return false;
    }


    public boolean deleteUser(int id) {
        System.out.println("实现删除用户");
        return false;
    }
}
