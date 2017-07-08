import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.event.*;
import java.sql.*;

class user{
JFrame f;
JPanel p1,p2,p3,p4,p5;
JTabbedPane tp;

JLabel l0,l1, l2, l3, l4,l5,l6,l7,l8,l9,l10,l11,ln1,ln2,ln3,ln4,ln6,ln5,ln7,a1,a2,a3,a4,new1;
JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,t1,t2,t3,t4,t5,t6,t7,t8,t9,b1,b2,b3,b4;
JScrollPane sp1;
JButton savebtn,resetbtn,editbtn1,editbtn2,deletebtn,resetbtn2,resetbtn3,b5,b6,b7,b8,b9,showbtn,editbtn ;
String val1,val2,val3,val4;

user(){
f=new JFrame("contact");
p1=new JPanel(new GridLayout(7,2));
p2=new JPanel(new GridLayout(7,2));
p3=new JPanel();
p3.setLayout(null);
p4 = new JPanel();
p4.setLayout(null);
p5 = new JPanel();
p5.setLayout(null);

tp=new JTabbedPane();
a4=new JLabel("Enter User Id:");
a1=new JLabel("User Id:");
a2=new JLabel("User Id:");
a3=new JLabel("User Id:");
l1=new JLabel("Id:");
l2=new JLabel(" Name:");
l3=new JLabel("Contact:");
l4=new JLabel("Email:");
l0=new JLabel("Address:");


l5=new JLabel("  Enter Contact ID to delete:");

l7=new JLabel(" ID:");
l8=new JLabel(" Name:");
l9=new JLabel(" Contact");
l10=new JLabel("Email");
l11=new JLabel("Address");

ln1=new JLabel("Name");
ln2=new JLabel("Password");
ln3=new JLabel("Contact");
ln4=new JLabel("Email");
ln5=new JLabel("Area");
ln6=new JLabel("State");
ln7=new JLabel("Nationality");
b4=new JTextField(12);
b1=new JTextField(12);
b2=new JTextField(12);
b3=new JTextField(12);
tf1=new JTextField(12);
tf2=new JTextField(12);
tf3=new JTextField(12);
tf4=new JTextField(12);
tf5=new JTextField(12);
tf6=new JTextField(12);
tf7=new JTextField(12);
tf8=new JTextField(12);
tf9=new JTextField(12);
tf10=new JTextField(12);
tf11=new JTextField(12);
tf12=new JTextField(12);

t1=new JTextField(12);
t2=new JTextField(12);
t3=new JTextField(12);
t4=new JTextField(12);
t5=new JTextField(12);
t6=new JTextField(12);
t7=new JTextField(12);
t8=new JTextField(12);
t9=new JTextField(12);

savebtn=new JButton(" Add ");
resetbtn=new JButton(" Reset");
resetbtn2=new JButton(" Reset");
editbtn2=new JButton(" Update");
deletebtn=new JButton("Delete");
resetbtn3=new JButton(" Reset");
showbtn=new JButton(" Show");
b7 = new JButton("Save");
b8 = new JButton("Reset");
editbtn = new JButton("Edit");

ImageIcon i1;
i1 = new ImageIcon("C:/Users/HCL/Desktop/New folder/profile-pic.jpg");
b5 = new JButton(i1);
b6 = new JButton("Set Profile");
b5.setBounds(1, 3, 250, 250);
t1.setBounds(1,280 ,230 , 30);
b6.setBounds(1,320,100,30);
ln1.setBounds(260,53,50,50);
ln2.setBounds(260,105,100,50);
ln3.setBounds(260,155,50,50);
ln4.setBounds(260,205,50,50);
ln5.setBounds(260,255,50,50);
ln6.setBounds(260,305,50,50);
ln7.setBounds(260,355,100,50);
t2.setBounds(370, 65, 200, 25);
t3.setBounds(370, 110, 200, 25);
t4.setBounds(370, 160, 200, 25);
t5.setBounds(370, 210, 200, 25);
t6.setBounds(370, 260, 200, 25);
t7.setBounds(370, 310, 200, 25);
t8.setBounds(370, 360, 200, 25);
b7.setBounds(260, 400, 80, 30);
b8.setBounds(370, 400, 80, 30);
a3.setBounds(260,3, 50, 50);
b3.setBounds(370,13, 200, 25);
showbtn.setBounds(370, 50, 80, 30);
a4.setBounds(150,8, 150, 50);
b4.setBounds(300,18, 200, 25);
editbtn.setBounds(470,400,90,30);
l5.setBounds(60,50,200,50);
tf12.setBounds(260,50,150,50);
deletebtn.setBounds(100,200,100,30);
resetbtn3.setBounds(300,200,100,30);

f.getContentPane().add(tp);
tp.addTab("Add",p1);
tp.addTab("Update",p2);
tp.addTab("Delete",p3);
tp.addTab("Profile",p4);
tp.addTab("Show Contacts",p5);
f.setSize(600,500);
f.setVisible(true);
f.setResizable(false);

p1.add(a1);
p1.add(b1);
p1.add(l1);
p1.add(tf1);
p1.add(l2);
p1.add(tf2);
p1.add(l3);
p1.add(tf3);
p1.add(l4);
p1.add(tf4);
p1.add(l0);
p1.add(tf6);
p1.add(savebtn);
p1.add(resetbtn);

p2.add(a2);
p2.add(b2);
p2.add(l7);
p2.add(tf7);
p2.add(l8);
p2.add(tf8);
p2.add(l9);
p2.add(tf9);
p2.add(l10);
p2.add(tf10);
p2.add(l11);
p2.add(tf11);
p2.add(editbtn2);
p2.add(resetbtn2);

p3.add(l5);
p3.add(tf12);
p3.add(deletebtn);
p3.add(resetbtn3);

p4.add(b5);
p4.add(t1);
p4.add(b6);
p4.add(ln1);
p4.add(ln2);
p4.add(ln3);
p4.add(ln4);
p4.add(ln5);
p4.add(ln6);
p4.add(ln7);
p4.add(t2);
p4.add(t3);
p4.add(t4);
p4.add(t5);
p4.add(t6);
p4.add(t7);
p4.add(t8);
p4.add(t9);
p4.add(b7);
p4.add(b8);
p4.add(a3);
p4.add(b3);
p4.add(editbtn);
p5.add(showbtn);
p5.add(a4);
p5.add(b4);



b7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){

		 String value11=t2.getText();
		 String value12=t3.getText();
		 String value13=t4.getText();
		 String value14=t5.getText();
		 String value15=t6.getText();
		 String value16=t7.getText();
		 String value17=t8.getText();
		 String value18=b3.getText();
		
try
{
int x=JOptionPane.showConfirmDialog(p4,"Confirm edit? All data will be replaced");
if(x==0){


try{

	Class.forName("com.mysql.jdbc.Driver");
	Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	
	String n ="";
	PreparedStatement ps = con2.prepareStatement( "select u_id from user_details where u_id = ?");
     ps.setString(1, value18);
 
   ResultSet rs = ps.executeQuery();
    if (rs.next()) {
    	n=rs.getString(1);
    }
    rs.close();
System.out.println(n);
	String sql = "UPDATE user_details SET name=?,password=?,mobilenumber=?  ,email=? ,area=?,state=? ,nationality=?,u_id=? WHERE u_id=?";
	 
	PreparedStatement statement = con2.prepareStatement(sql);
	statement.setString(1, value11);
	statement.setString(2, value12);
	statement.setString(3, value13);
	statement.setString(4, value14);
	statement.setString(5, value15);
	statement.setString(6, value16);
	statement.setString(7, value17);
	statement.setString(8, value18);
	statement.setString(9, n);
	int rowsUpdated = statement.executeUpdate();
	if (rowsUpdated > 0) {
	    System.out.println("An existing user was updated successfully!");
	}

	
	

JOptionPane.showMessageDialog(p2,"Updated successfully");
con2.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p2,"Error in updating edit fields");
}
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p2,"Error");
}
}
});
b8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t6.setText("");
t5.setText("");
t7.setText("");
t8.setText("");
b3.setText("");
}
});
b6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
	String str=t1.getText();
	b5.setIcon(new ImageIcon(str));
}
});
resetbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf6.setText("");
b1.setText("");
}
});
savebtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf1.getText();
String value2=tf2.getText();
String value3=tf3.getText();
String value4=tf4.getText();
String value5=tf6.getText();
String value6=b1.getText();
//int t=Integer.parseInt(value6);

System.out.println(value1+value2+value3+value4+value5);
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	Statement st1=con1.createStatement();
	st1.executeUpdate("INSERT INTO contact_info VALUES('"+value1+"','"+value2+"','"+value4+"','"+value5+"','"+
		value3+"','"+value6+" ')");

JOptionPane.showMessageDialog(p1,"Data is successfully inserted into database.");
con1.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(p1,"Error in submitting data!");
}
}
});

deletebtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){

String value1=tf12.getText();

try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	String sql = "DELETE FROM contact_info WHERE id=?";
	 
	PreparedStatement statement = con1.prepareStatement(sql);
	statement.setString(1, value1);
	int rowsDeleted = statement.executeUpdate();
	if (rowsDeleted > 0) {
	    System.out.println("A user was deleted successfully!");
	}
	

JOptionPane.showMessageDialog(p3,"Record is deleted successfully.");
con1.close();
}
catch(Exception exp3)
{
JOptionPane.showMessageDialog(p3,"Error in deleting record.");
}
}
});
resetbtn3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf12.setText("");
}
});
resetbtn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf7.setText("");
tf8.setText("");
tf9.setText("");
tf10.setText("");
tf11.setText("");
b2.setText("");
}
});
editbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){

		 String value1=b3.getText();
	



try{

	Class.forName("com.mysql.jdbc.Driver");
	Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	
	String n = "";
	PreparedStatement ps = con2.prepareStatement( "select u_id from user_details where u_id = ?");
     ps.setString(1, value1);
 
   ResultSet rs = ps.executeQuery();
    if (rs.next()) {
    	n=rs.getString(1);
    }
    rs.close();
System.out.println(n);
	String sql = "SELECT   name,password, mobilenumber,email,area,state,nationality FROM user_details  WHERE u_id=?";
	 
	PreparedStatement statement = con2.prepareStatement(sql);
	
	statement=con2.prepareStatement(sql);
	statement.setString(1, n);
	
	ResultSet rs1= statement.executeQuery();
	
while(rs1.next()){

	
	String a = rs1.getString("name");
	String b = rs1.getString("password");
	String c = rs1.getString("mobilenumber");
	String d = rs1.getString("email");
	String e = rs1.getString("area");
	String f = rs1.getString("state");
	
	String i = rs1.getString("nationality");
	
	System.out.println(a+"   "+b+"  "+"   "+c+"  "+d+"  "+e+" ");
	t2.setText(a);
	t3.setText(b);
	t4.setText(c);
	t5.setText(d);
	t6.setText(e);
	t7.setText(f);
	t8.setText(i);
	
}




con2.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p4,"Invalid UserId");
}



}
});

resetbtn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf7.setText("");
tf8.setText("");
tf9.setText("");
tf10.setText("");
tf11.setText("");
b2.setText("");
}
});
editbtn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){

		 String value11=tf7.getText();
		 String value12=tf8.getText();
		 String value13=tf9.getText();
		 String value14=tf10.getText();
		 String value15=tf11.getText();
		 String value16 = b2.getText();
try
{
int x=JOptionPane.showConfirmDialog(p2,"Confirm edit? All data will be replaced");
if(x==0){


try{

	Class.forName("com.mysql.jdbc.Driver");
	Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	
	String n = "";
	PreparedStatement ps = con2.prepareStatement( "select id from contact_info where id = ?");
     ps.setString(1, value11);
 
   ResultSet rs = ps.executeQuery();
    if (rs.next()) {
    	n=rs.getString(1);
    }
    rs.close();
System.out.println(n);
	String sql = "UPDATE contact_info SET id=?, name=?, email=?  , address=? , contact=?, u_id=? WHERE id=?";
	 
	PreparedStatement statement = con2.prepareStatement(sql);
	statement.setString(1, value11);
	statement.setString(2, value12);
	statement.setString(3, value14);
	statement.setString(4, value15);
	statement.setString(5, value13);
	statement.setString(6, value16);
	statement.setString(7, n);
	int rowsUpdated = statement.executeUpdate();
	if (rowsUpdated > 0) {
	    System.out.println("An existing user was updated successfully!");
	}

	
	

JOptionPane.showMessageDialog(p2,"Updated successfully");
con2.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p2,"Error in updating edit fields");
}
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p2,"Error");
}
}
});

showbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){

		 String value1=b4.getText();
		JFrame f= new JFrame();



try{

	Class.forName("com.mysql.jdbc.Driver");
	Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/contact_manager", "root","root");
	
	String n = "";
	PreparedStatement ps = con2.prepareStatement( "select u_id from contact_info where u_id = ?");
     ps.setString(1, value1);
 
   ResultSet rs = ps.executeQuery();
    if (rs.next()) {
    	n=rs.getString(1);
    }
    rs.close();
System.out.println(n);
	String sql = "SELECT  id, name, email,address,contact FROM contact_info  WHERE u_id=?";
	 
	PreparedStatement statement = con2.prepareStatement(sql);
	
	statement=con2.prepareStatement(sql);
	statement.setString(1, n);
	
	ResultSet rs1= statement.executeQuery();
	String data [][]  = new String [100][150];
	int i=0;
while(rs1.next()){

	
	String a = rs1.getString("id");
	String b = rs1.getString("name");
	String c = rs1.getString("email");
	String d = rs1.getString("address");
	String e = rs1.getString("contact");
	data[i][0]=a;
	data[i][1]=b;
	data[i][2]=c;
	data[i][3]=d;
	data[i][4]=e;
	i++;
	System.out.println(a+"   "+b+"  "+"   "+c+"  "+d+"  "+e+" ");
	
	
}
if(i>1){
String column[]={"Id","Name","Email","Address","Contact"};
JTable jt = new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp = new JScrollPane(jt);
f.add(sp);
f.setSize(600,300);
f.setVisible(true);
}else{
	JOptionPane.showMessageDialog(p5,"No Contacts to Show");
}

con2.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(p4,"Error");
}



}
});


}

public static void main(String z[]){
new user();

}
}




