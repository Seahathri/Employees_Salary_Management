	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

public class Employeesalarydetails {

		public static void main (String[]args) throws Exception {
			insertdata();
		}	
			public static void insertdata() throws Exception{
				
				String url="jdbc:mysql://127.0.0.1:3306/javaproject";
				String username="root";
				String password="sesha2001";
				String query ="insert into Employee_salarydetials values(?,?,?,?)";
				Connection Con= DriverManager.getConnection(url, username, password);
				PreparedStatement Pts=Con.prepareStatement(query);
				Pts.setString(1, "Kanna");
				Pts.setInt(2, 118);
				Pts.setString(3, "Staff");
				Pts.setInt(4, 50000);
				Pts.executeUpdate();
			    Pts.close();

				
			}
		

	}


