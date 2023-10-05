


	import java.sql.*;
	public class Employeesalaryupdate {

	
		public static void main(String[] args)throws Exception {
			UpdateData();	}


		
	public static void UpdateData()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/javaproject";
		String username="root";
		String password="sesha2001";
		String Query= "update Employee_salarydetials set Name ='Shiva' where employeeID='118'";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst= con.prepareStatement(Query);
		int rows =pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}
}

