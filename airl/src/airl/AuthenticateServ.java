package airl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AuthenticateServ extends JFrame implements ActionListener,Runnable{
	
	private JTextArea t1;
	private JScrollPane p1;
	private int c=0;
	
	  public AuthenticateServ()
	    {
	        super("Authentication  Server");
	        
	        t1=new JTextArea();
	        t1.setEditable(false);

			p1=new JScrollPane(t1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        
			Thread g=new Thread(this);
			add(p1);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        setSize(500,400);
	        
	         setLocationRelativeTo(null);
	         setVisible(true);
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	g.start();
	    }   
	  
	  
	    public static void main(String[] args)
	    {
	        AuthenticateServ a =new AuthenticateServ();
	    }


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		class Client implements Runnable{
			private int c;
			private Socket so;
			
			Client(int c,Socket so)
			{
				this.so=so;
				this.c=c;
			}
			
			public void run()
			{
				try {
					
					DataInputStream in=new DataInputStream(so.getInputStream());
					DataOutputStream out=new DataOutputStream(so.getOutputStream());
					
					String h;
					
					while(true)
					{
						h=in.readUTF();
						String[]hh=h.split(" ");
						
						 Databc b=new Databc();
						 String g="select * from agents where agentid=? and password=?;";
						 PreparedStatement gp=b.d.prepareStatement(g);
						 gp.setString(1,hh[0]);
						 gp.setString(2,hh[1]);
						 
						  try {
					            ResultSet r=gp.executeQuery();
					            
					          if(r.next())
					          {
					        	  String kkl="success";
					        	  out.writeUTF(kkl);
					        	  
					              
					              new Home();
					              b.d.close();
					          }
					          else
					          {
					        	  JOptionPane.showMessageDialog(null, "Wrong Userid/Password entered");
					        	  String kkl="fail";
					        	  out.writeUTF(kkl);
					        	  
					        	  b.d.close();
					              setVisible(true);
					          }
					        } catch (Exception ex) {
					            ex.printStackTrace();
					            
					        }
					}
					
					
					
					
					
					
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
			}
			
			
		}
		
		
		@Override
		public void run() {
			try {
			ServerSocket s=new ServerSocket(9898);
			t1.append("Authentication Server Started ");
			
			while(true)
			{
				Socket so=s.accept();
				InetAddress i=so.getInetAddress();
				c++;
				t1.append("Starting thread for authentication client "+c+" at "+"\n");
				t1.append("Client "+c+"s host name is:"+i.getHostName()+"\n");
				t1.append("Client "+c+"s IP Address is:"+i.getHostAddress()+"\n");
				
				Thread f=new Thread(new Client(c,so));
				f.start();
				
			}
			
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		


}
