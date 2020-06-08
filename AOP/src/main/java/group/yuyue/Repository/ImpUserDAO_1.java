package group.yuyue.Repository;

import group.yuyue.Entity.User;
import group.yuyue.Utils.ConnectionUtil;
import group.yuyue.Utils.TranctionManager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.util.List;

/**
 * Create by lp on 2020/5/16
 */
public class ImpUserDAO_1 implements IUserDAO {
    private QueryRunner queryRunner;
    private ConnectionUtil connectionUtil;
    private TranctionManager tm;

    public User findById(int id) {

        try {
            tm.beginTranction();
            String sql = "select * from user where id=?";
            User user = queryRunner.query(connectionUtil.getConnectionThreadLocal(), sql, new BeanHandler<User>(User.class), id);
            tm.commitTranction();
            return user;
        } catch (Exception e) {
            tm.rollbackTranction();
            e.printStackTrace();
            throw new RuntimeException("事务回滚");
        } finally {
            tm.releaseTrantion();

        }


    }

    public List<User> findAll() {
        String sql = "select * from user";
        /*反射创建*/

        try {
            tm.beginTranction();
            int a = 1 / 0;
            List<User> result = queryRunner.query(connectionUtil.getConnectionThreadLocal(), sql, new BeanListHandler<User>(User.class));
            tm.commitTranction();
            return result;
        } catch (Exception e) {
            tm.rollbackTranction();
            throw new RuntimeException("事务回滚");

        } finally {

            tm.releaseTrantion();


        }


    }

    public boolean inserUser(User user) {

        try {
            tm.beginTranction();
            String sql = "insert into user(id,name,age,password) values(?,?,?,?)";
            boolean flag = queryRunner.update(connectionUtil.getConnectionThreadLocal(), sql, user.getId(), user.getName(), user.getAge(), user.getPassword()) > 0;
            tm.commitTranction();
            return flag;
        } catch (Exception e) {
            tm.rollbackTranction();
            throw new RuntimeException("事务回滚");

        } finally {
            tm.releaseTrantion();

        }


    }

    public boolean deleteUser(int id) {

        try {
            /*在这个连接上下文中，只要有一处运行异常，便进行回滚操作*/
            tm.beginTranction();
            String sql = "delete from user where id=?";
            int row = queryRunner.update(connectionUtil.getConnectionThreadLocal(), sql, id);
            /*创建异常*/
            int test = 1 / 0;
            tm.commitTranction();
            return row > 0;

        } catch (Exception e) {
            tm.rollbackTranction();
            throw new RuntimeException("回滚事务");

        } finally {
            tm.releaseTrantion();

        }
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }


    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public void setTm(TranctionManager tm) {
        this.tm = tm;
    }
}
