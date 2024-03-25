package airl;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Authenticate extends JFrame implements ActionListener{
    private JTextField t1;
    private JPasswordField t2;
    private JPanel p1,p2,p3,p4,p5;
    private JButton b1;
     private JLabel l1,l2,l3,l4;
     private ImageIcon i1;
    private Socket so;
    private DataOutputStream out;
    private DataInputStream in;
    public Authenticate()
    {
        super("User Authentication");
        t1=new JTextField(15);
        t2=new JPasswordField(15);
        p1=new JPanel();
        p2=new JPanel();
          p3=new JPanel();
           p4=new JPanel();
           p5=new JPanel();
            l1=new JLabel("AGENTID");
            l3=new JLabel("LOGINPAGE");
     l2=new JLabel("PASSWORD");
     l2.setForeground(Color.BLACK);
      l1.setForeground(Color.BLACK);
       l3.setForeground(Color.BLACK);
       l1.setFont(new Font("Times New Roman",Font.PLAIN,12));
       l2.setFont(new Font("Times New Roman",Font.PLAIN,12));
       l3.setFont(new Font("Times New Roman",Font.BOLD,25));
      b1=new JButton("Login");
      p1.add(l1);
       p1.add(t1);
       p2.add(l2);
      p2.add(t2);
      p4.add(b1);
      b1.setForeground(Color.WHITE);
        b1.setBackground(Color.RED);
         b1.setFont(new Font("Times New Roman",Font.BOLD,15));
         ImageIcon i1=new ImageIcon(new ImageIcon("p2.jpg").getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH));
    l4=new JLabel(i1);
     b1.addActionListener(this);
      l4.setSize(500,200);
      p5.add(l3);
      p3.add(p5);
       p3.add(p1);
       p3.add(p2);
       p3.add(p4);
       p3.setLayout(new GridLayout(4,1));
      add(l4);
      l4.setLayout(new FlowLayout());
       l4.add(p3);
        p5.setOpaque(false);
         p1.setOpaque(false);
          p2.setOpaque(false);
           p4.setOpaque(false);
     p3.setOpaque(false);
     
     try {
			so=new Socket("localhost",9898);
		
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
     
     
        setSize(500,400);
       // setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setVisible(true);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    
    
    
    public static void main(String[] args)
    {
        Authenticate a =new Authenticate();
    }

    
    public void actionPerformed(ActionEvent e) {
     
         Databc b=new Databc();
         String aid=t1.getText();
       String pass=t2.getText();
       String g;
       try {
		out=new DataOutputStream(so.getOutputStream());
		out.writeUTF(aid+" "+pass);
		DataInputStream in=new DataInputStream(so.getInputStream());
		g=in.readUTF();
		String a1="success";
		String a2="fail";
		if(g.equals(a1))
		{
			setVisible(false);
		}
		else
		if(g.equals(a2))
		{
			t1.setText("");
			t2.setText("");
			 setVisible(true);
		}
		
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
        
    }

    
    
}


