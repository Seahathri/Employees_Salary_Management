import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employees {

	public static void main (String[]args) throws Exception {
		insertdata();
	}	
		public static void insertdata() throws Exception{
			
			String url="jdbc:mysql://127.0.0.1:3306/javaproject";
			String username="root";
			String password="sesha2001";
			String query ="insert into employee_details values(?,?,?,?,?)";
			Connection Con= DriverManager.getConnection(url, username, password);
			PreparedStatement Pts=Con.prepareStatement(query);
			Pts.setInt(1, 15);
			Pts.setString(2, "Kanna");
			Pts.setString(3, "Kana@gmail.com");
			Pts.setString(4, "9002009063");
			Pts.setString(5, "Staff");
			Pts.executeUpdate();
		    Pts.close();

			
		}
		
		
		
		
	

}
