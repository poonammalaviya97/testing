import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetDemoWithForwardBackwardAndAbsoluteScroll {

    public static void main(String[] args) throws Exception {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet rs = rsf.createJdbcRowSet();

        rs.setUrl("jdbc:mysql://localhost:3306/universalit");
        rs.setUsername("root");
        rs.setPassword("itservices@123");
        rs.setCommand("select * from employee");
        rs.execute();
        System.out.println("Records in forward direction");
        System.out.println("Id\tNAME\t\t\tAddress");
        System.out.println("---------------------");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(2));
        }
        System.out.println("Records in backward direction");
        System.out.println("Id\tName\t\t\tAddress");
        while (rs.previous()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }
        rs.absolute(2);
        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

        rs.close();

    }
}
