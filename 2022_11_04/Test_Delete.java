import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test_Delete
{
	public static void main(String args[])
	{ 
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.211.5:4567/madang", "yuhyunji","guswl190!"); 
			Statement stmt=con.createStatement(); 
			
			stmt.executeUpdate("Delete from Customer where custid='6'");
			ResultSet rs=stmt.executeQuery("SELECT * FROM Customer");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+ rs.getString(4)); 
			con.close(); 
		}catch(Exception e){ System.out.println(e);} 
	} 
}

