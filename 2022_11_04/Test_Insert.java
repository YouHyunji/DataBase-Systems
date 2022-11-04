import java.sql.*;
public class Test_Insert
{
	public static void main(String args[])
	{ 
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.211.5:4567/madang", "yuhyunji","------"); 
			Statement stmt=con.createStatement(); 
			
			stmt.executeUpdate("INSERT INTO Customer(custid, name, address, phone) VALUES ('6','유현지','대한민국 청주', '010-9000-0001')");
			ResultSet rs=stmt.executeQuery("SELECT * FROM Customer");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+ rs.getString(4)); 
			con.close(); 
		}catch(Exception e){ System.out.println(e);} 
	} 
}

