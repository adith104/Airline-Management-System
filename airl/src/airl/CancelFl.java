package airl;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class CancelFl extends JFrame implements ActionListener  {
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0,l10,l11;
	private JButton b1,b2;
	private JPanel p1,p2,p3,p4,p5,p0,p6,p7,p8,p9;
	private ImageIcon i1;
	
	
	public CancelFl()
	{
		
	    super("Cancel Your Booking");
	    
	    p0=new JPanel();
	    
	    l0=new JLabel("Cancel Your Flight Booking");
	    p0.add(l0);
	    
	    
	    p1=new JPanel();
	    l1=new JLabel("Booking ID:");
	    t1=new JTextField(15);
	    b1=new JButton("Search and Delete");
	    
	    p1.add(l1);
	    p1.add(t1);
	    p1.add(b1);
	    
	    p6=new JPanel();
	    l10=new JLabel("Details of Deleted Booking");
	    p6.add(l10);
	    
	    p2=new JPanel();
	    l2=new JLabel("Name");
	    t2=new JTextField(15);
	    
	    l3=new JLabel("Nationality");
	    t3=new JTextField(15);
	    
	    p2.add(l2);
	    p2.add(t2);
	    p2.add(l3);
	    p2.add(t3);
	    
	    
	    p3=new JPanel();
	    
	    l4=new JLabel("Age");
	    t4=new JTextField(15);
	    
	    
	    l5=new JLabel("Address");
	    t5=new JTextField(15);
	    
	    p3.add(l4);
	    p3.add(t4);
	    p3.add(l5);
	    p3.add(t5);
	    
	    
	    p4=new JPanel();
	    
	    l6=new JLabel("Flight No");
	    t6=new JTextField(15);
	    
	    
	    l7=new JLabel("Flight Name");
	    t7=new JTextField(15);
	    
	    p4.add(l6);
	    p4.add(t6);
	    p4.add(l7);
	    p4.add(t7);
	    
	    
	    p5=new JPanel();
	    
	    l8=new JLabel("Source");
	    t8=new JTextField(15);
	    
	    
	    l11=new JLabel("Destination");
	    t11=new JTextField(15);
	    
	    p5.add(l8);
	    p5.add(t8);
	    p5.add(l11);
	    p5.add(t11);
	    
	    ImageIcon i1=new ImageIcon(new ImageIcon("p6.jpg").getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH));
	    l9=new JLabel(i1);
	    
	    b2=new JButton("Exit");
	    p8=new JPanel();
	    p8.add(b2);
	    t2.setEditable(false);
	    t3.setEditable(false);
	    t4.setEditable(false);
	    t5.setEditable(false);
	    t6.setEditable(false);
	    t7.setEditable(false);
	    t8.setEditable(false);
	    t11.setEditable(false);
	    
	    p7=new JPanel();
	    p7.add(p0);
	    p7.add(p1);
	    p7.add(p6);
	    p7.add(p2);
	    p7.add(p3);
	    p7.add(p4);
	    p7.add(p5);
	    p7.add(p8);
	    p7.setLayout(new GridLayout(8,1));
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    p1.setOpaque(false);
        p4.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p7.setOpaque(false);
        p5.setOpaque(false);
        p6.setOpaque(false);
        p0.setOpaque(false);
        p8.setOpaque(false);
        
        l0.setForeground(Color.BLACK);
        l1.setForeground(Color.BLACK);
         l2.setForeground(Color.BLACK);
         l3.setForeground(Color.BLACK);
         l4.setForeground(Color.BLACK);
          l5.setForeground(Color.BLACK);
          l6.setForeground(Color.BLACK);
          l7.setForeground(Color.BLACK);
           l8.setForeground(Color.BLACK);
           l11.setForeground(Color.BLACK);
           l10.setForeground(Color.BLACK);
           
   
           
           l0.setFont(new Font("Arial",Font.BOLD,25));
           l1.setFont(new Font("Arial",Font.BOLD,18));
           l2.setFont(new Font("Arial",Font.BOLD,18));
           l3.setFont(new Font("Arial",Font.BOLD,18));
           l4.setFont(new Font("Arial",Font.BOLD,18));
           l5.setFont(new Font("Arial",Font.BOLD,18));
           l6.setFont(new Font("Arial",Font.BOLD,18));
           l7.setFont(new Font("Arial",Font.BOLD,18));
           
           l8.setFont(new Font("Arial",Font.BOLD,18));
           l11.setFont(new Font("Arial",Font.BOLD,18));
           l10.setFont(new Font("Arial",Font.BOLD,25));
           
	    
           
           
           b1.setForeground(Color.WHITE);
           b1.setBackground(Color.RED);
            b1.setFont(new Font("Arial",Font.BOLD,18));
            b2.setForeground(Color.WHITE);
            b2.setBackground(Color.BLACK);
             b2.setFont(new Font("Arial",Font.BOLD,18));
    
	    l9.setLayout(new GridLayout(1,1));
        l9.add(p7);
	    
	    l9.setSize(1000,800);
        
        
        
        
	       
        add(l9);
	    setSize(1000,800);
		 setLocationRelativeTo(null);
	        setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 
	    
	}
	
	
	public static void main(String[] args)
	{
		new 	CancelFl();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String g=t1.getText();
			
			Databc b=null;
			 String q="select * from bookings where BOOKING_ID=? ;";
			 
			 
			  try {
				  b=new Databc();
				  PreparedStatement gp=b.d.prepareStatement(q);
					 gp.setInt(1,Integer.parseInt(g));
					
		            ResultSet r=gp.executeQuery();
		            
		          if(r.next())
		          {
		        	  t2.setText(r.getString("NAME"));
		        	  t3.setText(r.getString("NATIONALITY"));
		        	  t4.setText(r.getString("AGE"));
		        	  t5.setText(r.getString("ADDRESS"));
		        	  String m=r.getString("FLIGHT_NO");
		        	  t6.setText(r.getString("FLIGHT_NO"));
		        	  t7.setText(r.getString("FLIGHT_NAME"));
		        	  t8.setText(r.getString("SOURCE"));
		        	  t11.setText(r.getString("DESTINATION"));
		        	  
		        	  b.d.setAutoCommit(false);
		        	  String q2="delete from bookings where BOOKING_ID= ? ;";
		        	  PreparedStatement gp2=b.d.prepareStatement(q2);
						 gp2.setInt(1,Integer.parseInt(g));
						
		        	  String q3="update flights set REMAIN_SEATS=REMAIN_SEATS+1 where FLIGHT_NO='"+m+"';";
		        	  gp2.executeUpdate();
		        	  b.s.executeUpdate(q3);
		        	  b.d.commit();
		        	  
		        	  JOptionPane.showMessageDialog(null, "Booking has been successfully deleted");
		        	  
		        	  t1.setText("");
		        	  t2.setText("");
		        	  t3.setText("");
		        	  t4.setText("");
		        	  t5.setText("");
		        	  t6.setText("");
		        	  t7.setText("");
		        	  t8.setText("");
		        	  t11.setText("");
	
		              b.d.close();
		          }
		          else
		          {
		        	  JOptionPane.showMessageDialog(null, "Booking does not exist or has been deleted");
		        	 
		        	  
		        	  b.d.close();
		              setVisible(true);
		          }
		        } catch (Exception ex) {
		        	
		        	

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
