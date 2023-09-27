import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;

public class TransactionDemoForIsolationLevel {
    public static void main(String[] args) throws Exception{
      /*  Class<?> aClass = Class.forName("java.lang.String");
        Object o = aClass.newInstance();
        System.out.println(aClass.getMethods());


        for (Method m: aClass.getMethods()){
            System.out.println(m.getName());
        }
        System.out.println(aClass.getName());*/

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mydb";
        String uname = "root";
        String password = "password";
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println(con.getTransactionIsolation());
        con.setTransactionIsolation(1);
        System.out.println(con.getTransactionIsolation());

    }
}



