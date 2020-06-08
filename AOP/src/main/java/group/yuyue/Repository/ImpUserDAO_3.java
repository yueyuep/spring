package group.yuyue.Repository;

/**
 * Create by lp on 2020/6/8
 */

import group.yuyue.Entity.User;

import java.util.List;

/**
 * Create by lp on 2020/6/6
 * 业务层的实现类
 * 学习使用基于XML配置的环绕通知类型
 * 1、前置通知
 * 2、后置通知
 * 3、异常通知
 * 4、最终通知
 * 与4种基本通知类型的区别：能控制切入点函数是否执行，不能实现定制需求。
 */
public class ImpUserDAO_3 implements IUserDAO {


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
