import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetUpdateDemo {

    String url = "jdbc:mysql://localhost:3306/universalit";
    String uname = "root";

    public static void main(String[] args) throws Exception {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet rs = rsf.createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/universalit");
        rs.setUsername("root");
        rs.setPassword("itservices@123");
        rs.setCommand("select * from employee");
        rs.execute();
        while (rs.next()) {
            String address = rs.getString(3);
            if (((String) address).equalsIgnoreCase("Ahmedabad")) {
                rs.updateString(3, "Harrow");
                rs.updateRow();
            }
        }
        System.out.println("Records updated successfully");
        rs.close();
    }
}
