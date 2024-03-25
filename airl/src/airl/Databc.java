package airl;
import java.sql.*;

public class Databc {
	
	Connection d;
	Statement s;
	
	Databc()
	{
		try
		{
			
			Class.forName("org.sqlite.JDBC");
		d=DriverManager.getConnection("jdbc:sqlite:airline.db");
			s=d.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)
	{
		new Databc();
	}
	
	
}
