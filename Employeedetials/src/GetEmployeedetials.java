import java.sql.*;
public class GetEmployeedetials {

	public static void main(String[] args) throws Exception {
		getData();
	}

	public static void getData()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/javaproject";
		String username ="root";
		String password= "sesha2001";
		String Query = "select * from employee_details";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
	ResultSet rst= st.executeQuery(Query);
	 while(rst.next()) {
		 System.out.println("User EmployeeID:"+rst.getInt(1));
		 System.out.println("user name:"+rst.getString(2));
		 System.out.println("user Email:"+rst.getString(3));
		 System.out.println("user Phonenumber:"+rst.getString(4));
		 System.out.println("User Job Title:"+rst.getString(5));
	 }
		con.close();
	}}

