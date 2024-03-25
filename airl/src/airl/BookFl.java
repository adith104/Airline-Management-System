package airl;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookFl  extends JFrame implements ActionListener {
	private JTextField t1,t2,t3,t4,t6,t7,t8,t12,t13,t14,t15;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0,l12,l13,l14,l15;
	private JButton b1,b2;
	private JPanel p1,p2,p3,p4,p5,p0,p6,p7,p8,p9;
	private Choice c1;
	private ImageIcon i1;
	
	public BookFl()
	{
		
	    super("Book a Flight");
	    t1=new JTextField(15);
        t2=new JTextField(15);
        t3=new JTextField(15);
        t4=new JTextField(15);
        
        
        
        t6=new JTextField(15);
        t7=new JTextField(15);
        t8=new JTextField(15);
        t12=new JTextField(15);
        t13=new JTextField(15);
        t14=new JTextField(15);
        t15=new JTextField(15);
        
        
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t12.setEditable(false);
        t13.setEditable(false);
        t14.setEditable(false);
        t15.setEditable(false);
        
        
        
        
        
        
        
        c1=new Choice();
        l0=new JLabel("BOOK FLIGHT");
        l1=new JLabel("Name");
        l2=new JLabel("Age");
        l3=new JLabel("Nationality");
        l4=new JLabel("Address");
        l5=new JLabel("Choose Flight");
        
        
        
        l6=new JLabel("Flight Name");
        l7=new JLabel("Source");
        l8=new JLabel("Destination");
        l12=new JLabel("Date");
        l13=new JLabel("Departure Time");
        l14=new JLabel("Arrival Time");
        l15=new JLabel("Price");
        
        p0=new JPanel();
        p1=new JPanel();
        p2=new JPanel();
        p4=new JPanel();
        p3=new JPanel();
        
        
        p5=new JPanel();
        p6=new JPanel();
        p8=new JPanel();
        p9=new JPanel();
        
        
        
        
        p7=new JPanel();
        
        
        b1=new JButton("BOOK");
        b2=new JButton("EXIT");
        
        
        l0.setForeground(Color.BLACK);
        l1.setForeground(Color.BLACK);
         l2.setForeground(Color.BLACK);
         l3.setForeground(Color.BLACK);
         l4.setForeground(Color.BLACK);
          l5.setForeground(Color.BLACK);
          l6.setForeground(Color.BLACK);
          l7.setForeground(Color.BLACK);
           l8.setForeground(Color.BLACK);
           l12.setForeground(Color.BLACK);
           l13.setForeground(Color.BLACK);
           l14.setForeground(Color.BLACK);
           l15.setForeground(Color.BLACK);
           
           
           
           
           l0.setFont(new Font("Arial",Font.BOLD,25));
           l1.setFont(new Font("Arial",Font.BOLD,18));
           l2.setFont(new Font("Arial",Font.BOLD,18));
           l3.setFont(new Font("Arial",Font.BOLD,18));
           l4.setFont(new Font("Arial",Font.BOLD,18));
           l5.setFont(new Font("Arial",Font.BOLD,18));
           l6.setFont(new Font("Arial",Font.BOLD,18));
           l7.setFont(new Font("Arial",Font.BOLD,18));
           
           l8.setFont(new Font("Arial",Font.BOLD,18));
           l12.setFont(new Font("Arial",Font.BOLD,18));
           l13.setFont(new Font("Arial",Font.BOLD,18));
           l14.setFont(new Font("Arial",Font.BOLD,18));
           l15.setFont(new Font("Arial",Font.BOLD,18));
          
        
        
        
        
        
        
        
        
        p0.add(l0);
	    
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        p2.add(l3);
        p2.add(t3);
        p2.add(l4);
        p2.add(t4);
        
        p4.add(l5);
        p4.add(c1);
        
        p5.add(l6);
        p5.add(t6);
        p5.add(l7);
        p5.add(t7);
        
        p6.add(l8);
        p6.add(t8);
        p6.add(l12);
        p6.add(t12);
        
        
        p8.add(l13);
        p8.add(t13);
        p8.add(l14);
        p8.add(t14);
        
        
        
        p9.add(l15);
        p9.add(t15);
        
        p3.add(b1);
        p3.add(b2);
        try
        {
        	Databc b=new Databc();
        	String q="select FLIGHT_NO from flights where REMAIN_SEATS > 0";
        	ResultSet r=b.s.executeQuery(q);
        	
        	while(r.next())
        	{
        		c1.add(r.getString("FLIGHT_NO"));
        		
        	}
        	
        	
        	b.d.close();
        	
        
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        	
        }
        p7.add(p0);
        p7.add(p1);
        p7.add(p2);
        p7.add(p4);
        p7.add(p5);
        p7.add(p6);
        p7.add(p8);
        p7.add(p9);
        p7.add(p3);
        ImageIcon i1=new ImageIcon(new ImageIcon("p4.jpg").getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH));
	    l9=new JLabel(i1);
	    
        
        p7.setLayout(new GridLayout(9,1));
        
        
        l9.setLayout(new GridLayout(1,1));
        l9.add(p7);
        
        p1.setOpaque(false);
        p4.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p7.setOpaque(false);
        p5.setOpaque(false);
        p6.setOpaque(false);
        p8.setOpaque(false);
        p9.setOpaque(false);
        p0.setOpaque(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.MAGENTA);
         b1.setFont(new Font("Arial",Font.BOLD,20));
         b2.setForeground(Color.WHITE);
         b2.setBackground(Color.BLACK);
          b2.setFont(new Font("Arial",Font.BOLD,20));
 
	    
	    c1.addItemListener(new ItemListener()
	    		{
	    	
	    	         @Override
	    	         public void itemStateChanged(ItemEvent m)
	    	         {
	    	        	 if(m.getStateChange()==ItemEvent.SELECTED) {
	    	        	 try
	    	             {
	    	             	Databc b=new Databc();
	    	            
	    	             	String fn=c1.getSelectedItem();
	    	             	String q="select * from flights where FLIGHT_NO='"+fn+"'";
	    	             	ResultSet r=b.s.executeQuery(q);
	    	             	
	    	             	while(r.next())
	    	             	{
	    	             		t6.setText(r.getString("AIRLINE_NAME"));
	    	             		t7.setText(r.getString("SOURCE"));
	    	             		t8.setText(r.getString("DESTINATION"));
	    	             		t12.setText(r.getString("DATE"));
	    	             		t13.setText(r.getString("DEPARTURE_TIME"));
	    	             		t14.setText(r.getString("ARRIVAL_TIME"));
	    	             		String a1=r.getString("CAPACITY");
	    	             		String a2=r.getString("DISTANCE");
	    	             		String a3=r.getString("REMAIN_SEATS");
	    	             		int i,j,k;
	    	             		i=Integer.parseInt(a1);
	    	             		j=Integer.parseInt(a2);
	    	             		k=Integer.parseInt(a3);
	    	             		
	    	             		double p=(0.09*j)+((i-k)*0.09);
	    	             		String a4=Double.toString(p);
	    	             		t15.setText(a4);
	    	             		
	    	             	}
	    	             	
	    	             	
	    	             	b.d.close();
	    	             	
	    	             
	    	             }
	    	             catch(Exception ex)
	    	             {
	    	             	ex.printStackTrace();
	    	             	
	    	             }
	    	        	 }
	    	        	 
	    	         }
	    	
	    	
	    	
	    	
	    		});
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    
	    
	    
	    
	    l9.setSize(1000,800);
        
        
        
        
	       
        add(l9);
		
	    setSize(1000,800);
		 setLocationRelativeTo(null);
	        setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    
	}
	public static void main(String[] args)
	{
		new 	BookFl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
		
			String a=t1.getText();
			String a2=t2.getText();
			String c=t3.getText();
			String d=t4.getText();
			String e1=c1.getSelectedItem();
		
			String f=t6.getText();
			String g=t7.getText();
			String h=t8.getText();
			
			String i=t12.getText();
			String j=t13.getText();
			String k=t14.getText();
			String l=t15.getText();
			
	
			
			t1.setText("");
      	    t2.setText("");
      	    t3.setText("");
  	        t4.setText("");
  	        
	        t6.setText("");
	        t7.setText("");
	        t8.setText("");
	        t12.setText("");
	        t13.setText("");
	        t14.setText("");
	        t15.setText("");
	     
	         Databc b=null;
	        
	        try
	        {
	        	b=new Databc();
	        	b.d.setAutoCommit(false);
	        	String q="insert into bookings(NAME,AGE,NATIONALITY,ADDRESS,FLIGHT_NO,FLIGHT_NAME,SOURCE,DESTINATION,DATE,DEPARTURE_TIME,ARRIVAL_TIME,PRICE) values(?,?,?,?,?,?,?,?,?,?,?,?);";
	        	
	        	PreparedStatement gp=b.d.prepareStatement(q);
				 gp.setString(1,a);
				 gp.setString(2,a2);
				 gp.setString(3,c);
				 gp.setString(4,d);
				 gp.setString(5,e1);
				 gp.setString(6,f);
				 gp.setString(7,g);
				 gp.setString(8,h);
				 gp.setString(9,i);
				 gp.setString(10,j);
				 gp.setString(11,k);
				 gp.setString(12,l);
				
	        	gp.executeUpdate();
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	String qq="update flights set REMAIN_SEATS=REMAIN_SEATS-1 where FLIGHT_NO='"+e1+"';";
	        	b.s.executeUpdate(qq);
	        	b.d.commit();
	        	JOptionPane.showMessageDialog(null, "Flight successfully booked");
	        	b.d.close();
	        	
	    
	        }
	        catch(Exception ex)
	        {
	        	try {
	        		if(b!=null)
					b.d.rollback();
				} catch (SQLException e2) {
					
					e2.printStackTrace();
				}
	        	ex.printStackTrace();
	        	
	        }
	        
	        
	        
			
		}
		
		if(e.getSource()==b2)
		{
		
			  setVisible(false);
		}
	
		
		
		
	}    

}
