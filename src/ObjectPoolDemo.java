import java.sql.Connection;

public class ObjectPoolDemo {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa", "secret");
        Connection connection = (Connection) pool.checkOut();
        pool.checkIn(connection);
    }
}
