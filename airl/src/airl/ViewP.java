package airl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewP extends JFrame implements ActionListener{

	private String tab[][]=new String[22][13];
	private JTable t;
	private JScrollPane ss;
	
	
	public ViewP()
	{
		
		
		 super("All Bookings");
		 int i=0,j=0;
		 
		 try
	        {
	        	Databc b=new Databc();
	        	String q="select * from bookings";
	        	ResultSet r=b.s.executeQuery(q);
	        	
	        	while(r.next())
	        	{
	        		tab[i][j++]=r.getString("BOOKING_ID");
	        		tab[i][j++]=r.getString("NAME");
	        		tab[i][j++]=r.getString("AGE");
	        		tab[i][j++]=r.getString("NATIONALITY");
	        		tab[i][j++]=r.getString("ADDRESS");
	        		tab[i][j++]=r.getString("FLIGHT_NO");
	        		tab[i][j++]=r.getString("FLIGHT_NAME");
	        		tab[i][j++]=r.getString("SOURCE");
	        		tab[i][j++]=r.getString("DESTINATION");
	        		tab[i][j++]=r.getString("DATE");
	        		tab[i][j++]=r.getString("DEPARTURE_TIME");
	        		tab[i][j++]=r.getString("ARRIVAL_TIME");
	        		tab[i][j++]=r.getString("PRICE");
	        		i++;
	        		j=0;
	        		
	        		
	        	}
	       
	        	b.d.close();
	        	
	    
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        	
	        }
		 String c[]= {"BOOKING_ID","NAME","AGE","NATIONALITY","ADDRESS","FLIGHT_NO","FLIGHT_NAME","SOURCE","DESTINATION","DATE","DEPARTURE_TIME","ARRIVAL_TIME","PRICE"};
		 t=new JTable(tab,c);
		 
		 ss=new JScrollPane(t);
		 add(ss);
		 setSize(1000,400);
		 setLocationRelativeTo(null);
	        setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args)
	{
		new 	ViewP();
	}

}
