import java.sql.*;
public class Employeesalarydelete {

		public static void main(String[] args)throws Exception {
			DeleteData();	}


		
	public static void DeleteData()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/javaproject";
		String username="root";
		String password="sesha2001";
		String Query= "delete from Employee_salarydetials where EmployeeID ='118' ";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst= con.prepareStatement(Query);
		int rows =pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}}
		

