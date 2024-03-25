package airl;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddFlight extends JFrame implements ActionListener {
	
	
	
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0,l99,l10;
	private JButton b1,b2;
	private JPanel p1,p2,p3,p4,p5,p0,p6,p7;
	private ImageIcon i1;
	
	
	
	public AddFlight()
	{
		
	    super("Add Flight");
        t1=new JTextField(15);
        t2=new JTextField(15);
        t3=new JTextField(15);
        t4=new JTextField(15);
        t5=new JTextField(15);
        t6=new JTextField(15);
        t7=new JTextField(15);
        t7=new JTextField(15);
        t8=new JTextField(15);
        t9=new JTextField(15);
        t10=new JTextField(15);
        
        
        
        
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p0=new JPanel();
        p6=new JPanel();
        b1=new JButton("ADD");
        b2=new JButton("EXIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLUE);
         b1.setFont(new Font("Arial",Font.BOLD,18));
         b2.setForeground(Color.WHITE);
         b2.setBackground(Color.BLACK);
          b2.setFont(new Font("Arial",Font.BOLD,18));
 
          b1.addActionListener(this);
          b2.addActionListener(this);
        ImageIcon i1=new ImageIcon(new ImageIcon("p1.jpeg").getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH));
        l9=new JLabel(i1);
        l1=new JLabel("Flight No");
        l2=new JLabel("Airline Name");
        l3=new JLabel("Source");
        l4=new JLabel("Destination");
        l5=new JLabel("Departure Time");
        l6=new JLabel("Arrival Time");
        l7=new JLabel("Date");
        l8=new JLabel("Type");
        l99=new JLabel("Capacity");
        l10=new JLabel("Distance");
        l0=new JLabel("Add Flight");
        
        p7=new JPanel();
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        p2.add(l3);
        p2.add(t3);
        p2.add(l4);
        p2.add(t4);
        
        
        p3.add(l5);
        p3.add(t5);
        p3.add(l6);
        p3.add(t6);
        
        
        p4.add(l7);
        p4.add(t7);
        p4.add(l8);
        p4.add(t8);
        
        p7.add(l99);
        p7.add(t9);
        p7.add(l10);
        p7.add(t10);
        
        
        
        p6.add(b1);
        p6.add(b2);
        
        p0.add(l0);
        
        p5.add(p0);
        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);
        p5.add(p7);
        p5.add(p6);
        
        
        l9.setLayout(new GridLayout(1,1));
        l9.add(p5);
        
        
        
        
        l0.setForeground(Color.BLACK);
        l1.setForeground(Color.BLACK);
         l2.setForeground(Color.BLACK);
         l3.setForeground(Color.BLACK);
         l4.setForeground(Color.BLACK);
          l5.setForeground(Color.BLACK);
          l6.setForeground(Color.BLACK);
          l7.setForeground(Color.BLACK);
           l8.setForeground(Color.BLACK);
           l99.setForeground(Color.BLACK);
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
           l99.setFont(new Font("Arial",Font.BOLD,18));
           l10.setFont(new Font("Arial",Font.BOLD,18));
           
         
         
         
         
        p5.setOpaque(false);
        p1.setOpaque(false);
         p2.setOpaque(false);
          p4.setOpaque(false);
    p3.setOpaque(false);
    p0.setOpaque(false);
    p6.setOpaque(false);
    p5.setLayout(new GridLayout(7,1));
    p7.setOpaque(false);
        
       
        
        
        
        l9.setSize(1000,800);
        
        
        
        
       
        add(l9);
		
		
		
		
		
		 setSize(1000,800);
		 setLocationRelativeTo(null);
	        setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==b1)
		{
		
			String a=t1.getText();
			String a2=t2.getText();
			String c=t3.getText();
			String d=t4.getText();
			String e1=t5.getText();
			String f=t6.getText();
			String g=t7.getText();
			String h=t8.getText();
			String i=t9.getText();
			String j=t10.getText();
			
	
			
			t1.setText("");
      	    t2.setText("");
      	    t3.setText("");
  	        t4.setText("");
  	        t5.setText("");
	        t6.setText("");
	        t7.setText("");
	        t8.setText("");
	        t9.setText("");
	        t10.setText("");
	        Databc b=null;
	        try
	        {
	        	
	            b=new Databc();
	        	b.d.setAutoCommit(false);
	        	String q="insert into flights values(?,?,?,?,?,?,?,?,?,?,?);";
	        	PreparedStatement gp=b.d.prepareStatement(q);
				 gp.setString(1,a);
				 gp.setString(2,a2);
				 gp.setString(3,c);
				 gp.setString(4,d);
				 gp.setString(5,e1);
				 gp.setString(6,f);
				 gp.setString(7,g);
				 gp.setString(8,h);
				 gp.setInt(9,Integer.parseInt(i));
				 gp.setString(10,j);
				 gp.setInt(11,Integer.parseInt(i));
				
	        	gp.executeUpdate();
	        	b.d.commit();
	        	JOptionPane.showMessageDialog(null, "Flight successfully added");
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
	
	
	public static void main(String[] args)
	{
		new 	AddFlight();
	}

}
