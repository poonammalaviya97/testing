import javax.sql.rowset.*;

public class RowSetCreationDemo {
    public static void main(String[] args) throws Exception {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet jrs = rsf.createJdbcRowSet();
        CachedRowSet crs  = rsf.createCachedRowSet();
        WebRowSet wrs = rsf.createWebRowSet();
        JoinRowSet jrrs = rsf.createJoinRowSet();
        FilteredRowSet frs = rsf.createFilteredRowSet();

        System.out.println(jrs.getClass().getName());
        System.out.println(crs.getClass().getName());
        System.out.println(wrs.getClass().getName());
        System.out.println(jrrs.getClass().getName());
        System.out.println(frs.getClass().getName());
    }
}
