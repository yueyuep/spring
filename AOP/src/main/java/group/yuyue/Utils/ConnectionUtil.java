package group.yuyue.Utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Create by lp on 2020/5/17
 */
public class ConnectionUtil {
    private ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public Connection getConnectionThreadLocal() {
        Connection cn = connectionThreadLocal.get();
        if (cn == null) {
            try {
                this.connectionThreadLocal.set(dataSource.getConnection());
                return connectionThreadLocal.get();
            } catch (Exception e) {
                /*连接池中连接满了*/
                e.printStackTrace();
            }

        }
        return connectionThreadLocal.get();

    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setConnectionThreadLocal(ThreadLocal<Connection> connectionThreadLocal) {
        this.connectionThreadLocal = connectionThreadLocal;
    }

    /*将我们的连接还给连接池*/
    public void removeConnection() {
        connectionThreadLocal.remove();
    }
}
