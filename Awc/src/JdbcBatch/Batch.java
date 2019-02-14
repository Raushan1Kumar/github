package JdbcBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Batch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch","root","root");
			Statement st=con.createStatement();
			st.addBatch("insert into imp values('5','Raushan','noida')");
			st.addBatch("insert into imp values('6','Aarti','Munger')");
			st.executeBatch();
			//con.commit();
			con.close();
			System.out.println("done...");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
