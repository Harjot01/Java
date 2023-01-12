import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Practise";
        String uname = "root";
        String pass = "9914";
        String query = "select * from Student where user_id = 2e;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String data = rs.getInt(1) + "  " + rs.getString(2);
            System.out.println(data);
        }

    }
}
