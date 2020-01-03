import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class lab19 extends JFrame implements ActionListener
{
	JButton SUBMIT;
	JPanel panel;
	JLabel usrLabel,pwdLabel;
	JTextField usrText,pwdText;
	static final String dbClass = "com.mysql.jdbc.Driver";
	static final String dbUrl = "jdbc:mysql://localhost/java";
	static final String dbUsr = "root";
	static final String dbPwd = "root123";
	lab19()
	{
		usrLabel = new JLabel();
		usrLabel.setText("username");
		usrText = new JTextField(15);
		pwdLabel = new JLabel();
		pwdLabel.setText("password");
		pwdText = new JPasswordField(15);
		SUBMIT = new JButton("SUBMIT");
		panel = new JPanel(new GridLayout(3,1));
		panel.add(usrLabel);
		panel.add(usrText);
		panel.add(pwdLabel);
		panel.add(pwdText);
		panel.add(SUBMIT);
		add(panel,BorderLayout.CENTER);
		SUBMIT.addActionListener(this);
		setTitle("login form");
	}
	public void actionPerformed(ActionEvent ae)
	{
		String username = usrText.getText();
		String password = pwdText.getText();
		java.sql.Connection conn = null;
		try
		{
			Class.forName(dbClass).newInstance();
			conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/java?user=root&password=root123");
			java.sql.DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("error in loading driver"+e);
			System.exit(1);
		}
		catch(Exception e)
		{
			System.out.println("error in connection"+e);
			System.exit(0);
		}
		System.out.println("connection established");
		try
		{
			java.sql.Statement s = conn.createStatement();
			String query = "SELECT * FROM user WHERE username ='"+username+"'and password = '"+password+"'";
			java.sql.ResultSet r = s.executeQuery(query);
			r.next();
			int x = r.getRow();
			if (x>0)
			{
			JOptionPane.showMessageDialog(null,"WELCOME " +	username);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"incorrect login or password","error",JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
}
class loginDemo
{
	public static void main(String args[])
	{
		try
		{
			lab19 frame = new lab19();
			frame.setSize(300,100);
			frame.setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
}



mysql -u root -p
show databases
create database java
show databases
use java
create table user(username varchar(20),password varchar(20));
insert into values("java","password");


select * from user
exit
javac loginDemo.java
java loginDemo

