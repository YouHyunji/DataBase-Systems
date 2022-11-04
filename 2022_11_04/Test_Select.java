import java.sql.*; 
public class Test_Select 
{
	public static void main(String args[])
	{ 
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.211.5:4567/madang", "yuhyunji","guswl190!"); 
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("SELECT * FROM Book WHERE price BETWEEN 10000 AND 20000");
			
			while(rs.next()) 
				System.out.println("책 이름 : "+rs.getString(2)+ " / 출판사 : "+rs.getString(3)+ " / 가격 : "+ rs.getString(4));
			con.close(); 
		}catch(Exception e){ System.out.println(e);} 
	} 
}

