package airl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home  extends JFrame implements ActionListener{
	
	private JLabel l1;
	private JMenuBar m1;
	private JMenu me1,me2,me3,me4,me5,me6,me7;
	private JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	
	
	
	  public Home()
	    {
	        super("Airline Portal");
	        m1=new JMenuBar();
	        me1=new JMenu("Add Flights");
	        mi1=new JMenuItem("Add a Flight");
	        me1.add(mi1);
	        
	        me2=new JMenu("View Flights");
	        mi2=new JMenuItem("View Flight Details");
	        me2.add(mi2);
	        
	        
	        me3=new JMenu("Book");
	        mi3=new JMenuItem("Book a Flight");
	        me3.add(mi3);
	        me4=new JMenu("View Passengers");
	        mi4=new JMenuItem("View all Bookings");
	        me4.add(mi4);
	        
	        me6=new JMenu("Available Seats");
	        mi6=new JMenuItem("Flights Available");
	        me6.add(mi6);
	        
	        me7=new JMenu("Cancel");
	        mi7=new JMenuItem("Cancel Your Booking");
	        me7.add(mi7);
	        
	        
	        
	        
	        me5=new JMenu("Exit");
	        mi5=new JMenuItem("Logout");
	        me5.add(mi5);
	        mi1.addActionListener(this);
	        mi2.addActionListener(this);
	        mi3.addActionListener(this);
	        mi4.addActionListener(this);
	        mi5.addActionListener(this);
	        mi6.addActionListener(this);
	        mi7.addActionListener(this);
	        ImageIcon i1=new ImageIcon(new ImageIcon("p3.jpg").getImage().getScaledInstance(1200, 650, Image.SCALE_SMOOTH));
	        l1=new JLabel(i1);
	        
	        me1.setForeground(Color.WHITE);
	        me2.setForeground(Color.WHITE);
	        me3.setForeground(Color.WHITE);
	        me4.setForeground(Color.WHITE);
	        me5.setForeground(Color.RED);
	        me6.setForeground(Color.WHITE);
	        me7.setForeground(Color.WHITE);
	        
	     
	        m1.setBackground(Color.BLACK);
	        
	        me1.setFont(new Font("Verdana",Font.BOLD,21));
	        me2.setFont(new Font("Verdana",Font.BOLD,21));
	        me3.setFont(new Font("Verdana",Font.BOLD,21));
	        me4.setFont(new Font("Verdana",Font.BOLD,21));
	        me5.setFont(new Font("Verdana",Font.BOLD,21));
	        me6.setFont(new Font("Verdana",Font.BOLD,21));
	        me7.setFont(new Font("Verdana",Font.BOLD,21));
	        
	        
	        
	        mi1.setFont(new Font("Verdana",Font.BOLD,19));
	        mi2.setFont(new Font("Verdana",Font.BOLD,19));
	        mi3.setFont(new Font("Verdana",Font.BOLD,19));
	        mi4.setFont(new Font("Verdana",Font.BOLD,19));
	        mi5.setFont(new Font("Verdana",Font.BOLD,19));
	        mi6.setFont(new Font("Verdana",Font.BOLD,19));
	        mi7.setFont(new Font("Verdana",Font.BOLD,19));
	        
	        mi1.setForeground(Color.WHITE);
	        mi2.setForeground(Color.WHITE);
	        mi3.setForeground(Color.WHITE);
	        mi4.setForeground(Color.WHITE);
	        mi5.setForeground(Color.RED);
	        mi6.setForeground(Color.WHITE);
	        mi7.setForeground(Color.WHITE);
	        
	        mi1.setBackground(Color.BLACK);
	        mi2.setBackground(Color.BLACK);
	        mi3.setBackground(Color.BLACK);
	        mi4.setBackground(Color.BLACK);
	        mi5.setBackground(Color.BLACK);
	        mi6.setBackground(Color.BLACK);
	        mi7.setBackground(Color.BLACK);
	        
	        
	        
	        m1.add(me1);
	        m1.add(new JLabel("        "));
	        m1.add(me2);
	        m1.add(new JLabel("        "));
	        m1.add(me3);
	        m1.add(new JLabel("        "));
	        m1.add(me4);
	        m1.add(new JLabel("        "));
	        m1.add(me6);
	        m1.add(new JLabel("        "));
	        m1.add(me7);
	        m1.add(new JLabel("        "));
	        m1.add(me5);
	        
	        
	        setJMenuBar(m1);
	        add(l1);
			
	        
	        setSize(1200,650);
	        setLocationRelativeTo(null);
	        setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }   
	  
	  
	  
	  
	  
	  public static void main(String[] args)
	    {
	       new Home();
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mi1)
		{
			new AddFlight();
		}
		else
		if(e.getSource()==mi2)
		{
			new ViewFl();
		}
		else
		if(e.getSource()==mi3)
		{
				new BookFl();
		}
		else
		if(e.getSource()==mi4)
		{
					new ViewP();
		}
		else
		if(e.getSource()==mi5)
		{
		    System.exit(0);
						
		}
		else
			if(e.getSource()==mi6)
			{
			    new seats_remain();
							
			}
			else
				if(e.getSource()==mi7)
				{
				    new CancelFl();
								
				}
			
		
		
	}

}
