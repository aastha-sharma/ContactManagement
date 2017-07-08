import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 class Welcome extends JFrame implements Runnable {
	
	 JLabel l1,l2,l3;
	
	 Thread t;
	 RegisterationForm r;
	 ImageIcon img;
	 Welcome(){
		 img = new ImageIcon("C:/Users/HCL/Desktop/New folder/image5");
		
		 t=new Thread(this);
		 setTitle("Welcome");
		 Container c = getContentPane();
		 setLayout(null);
		 l1= new JLabel("Contact Manager System");
		 l1.setBounds(230,300, 900,50);
		 l1.setFont(new Font("Courier new", Font.BOLD, 60));
		 l2= new JLabel("  -By Aastha Sharma");
		 l2.setBounds(330,420, 900,50);
		 l2.setFont(new Font("Courier new", Font.BOLD, 60));
		 l3=new JLabel(img); 
		 l3.setBounds(0,0, 1200,1000);
		 c.add(l1);
		 c.add(l2);
		 c.add(l3);
		 setSize(1500,1000);
		 setVisible(true);
       t.start();		 
	 }
		public void run() {
		
		int x=1;
		while(x<5){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		x++;
		}
		setVisible(false);
		new RegistrationFormDesign();
	}
		
public static void main(String s[]){
	new Welcome();
}
		
}
 
 
