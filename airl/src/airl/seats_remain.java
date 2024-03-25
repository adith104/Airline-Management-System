package airl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class seats_remain extends JFrame implements ActionListener{

	private String tab[][]=new String[22][11];
	private JTable t;
	private JScrollPane ss;
	
	
	public seats_remain()
	{
		
		
		 super("Seat Remaining");
		 int i=0,j=0;
		 
		 try
	        {
	        	Databc b=new Databc();
	        	String q="select * from flights where REMAIN_SEATS>0";
	        	ResultSet r=b.s.executeQuery(q);
	        	
	        	while(r.next())
	        	{
	        		tab[i][j++]=r.getString("FLIGHT_NO");
	        		tab[i][j++]=r.getString("AIRLINE_NAME");
	        		tab[i][j++]=r.getString("SOURCE");
	        		tab[i][j++]=r.getString("DESTINATION");
	        		tab[i][j++]=r.getString("DEPARTURE_TIME");
	        		tab[i][j++]=r.getString("ARRIVAL_TIME");
	        		tab[i][j++]=r.getString("REMAIN_SEATS");
	        	
	        		i++;
	        		j=0;
	        		
	        		
	        	}
	       
	        	b.d.close();
	        	
	    
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        	
	        }
		 String c[]= {"FLIGHT_NO","AIRLINE_NAME","SOURCE","DESTINATION","DEPARTURE_TIME","ARRIVAL_TIME","SEATS REMAINING"};
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
		new 	seats_remain();
	}

}
