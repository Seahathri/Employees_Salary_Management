


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class employeesalaryget {

		public static void main(String[] args) throws Exception {
			getData();
		}

		public static void getData()throws Exception{
			String url="jdbc:mysql://127.0.0.1:3306/javaproject";
			String username ="root";
			String password= "sesha2001";
			String Query = "select * from Employee_salarydetials";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
		ResultSet rst= st.executeQuery(Query);
		 while(rst.next()) {
			 System.out.println("User Name:"+rst.getString(1));
			 System.out.println("user EmployeeID:"+rst.getInt(2));
			 System.out.println("user Jobtitle:"+rst.getString(3));
			 System.out.println("user Salary:"+rst.getInt(4));
		 }
			con.close();
		}}

