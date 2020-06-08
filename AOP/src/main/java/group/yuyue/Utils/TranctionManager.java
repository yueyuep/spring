package group.yuyue.Utils;

/**
 * Create by lp on 2020/5/17
 * 自定义事务管理相关的事件
 * 1、开启事务
 * 2、提交事务
 * 3、回滚事务
 * 3、关闭事务
 */
public class TranctionManager {

    private ConnectionUtil connectionUtil;

    /*开始事务*/
    public void beginTranction() {
        try {
            connectionUtil.getConnectionThreadLocal().setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*提交事务*/
    public void commitTranction() {
        try {
            connectionUtil.getConnectionThreadLocal().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*回滚事务*/
    public void rollbackTranction() {
        try {
            connectionUtil.getConnectionThreadLocal().rollback();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*结束事务*/
    public void releaseTrantion() {
        try {
            connectionUtil.getConnectionThreadLocal().close();
            connectionUtil.removeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }
}
