package group.yuyue.Repository;

import group.yuyue.Entity.User;

import java.util.List;

/**
 * Create by lp on 2020/5/16
 * 服务层的接口
 */
public interface IUserDAO {
    /*按照id进行查找*/
    public User findById(int id);

    /*返回所有的对象*/
    public List<User> findAll();

    /*添加用户*/
    public boolean inserUser(User user);

    /*删除学生*/
    public boolean deleteUser(int id);

}
