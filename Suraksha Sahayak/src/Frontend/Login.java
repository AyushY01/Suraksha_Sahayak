package Frontend;

import java.awt.Color;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;


public class Login extends JFrame implements ActionListener{
	JButton loginb,loginb2;
	JTextField tfusername;
	JPasswordField tfpassword;
	

	public Login() {
		// TODO Auto-generated constructor stub
		getContentPane().setBackground(Color.white);
		setLayout(null);
		JLabel lblusername =new JLabel("Username");
		lblusername.setBounds(40,20,100,20);
		add(lblusername);
		
		JLabel lblpassword =new JLabel("Password");
		lblpassword.setBounds(40,70,100,20);
		add(lblpassword);
		
		tfusername=new JTextField();
		tfusername.setBounds(150,20,150,20);
		add(tfusername);
		
		tfpassword=new JPasswordField();
		tfpassword.setBounds(150,70,150,20);
		add(tfpassword);
		
		loginb=new JButton("Login");
		loginb.setBounds(40,140,120,30);
		
		add(loginb);
		
		loginb2=new JButton("Signup");
		loginb2.setBounds(180,140,120,30);
		
		add(loginb2);
		
		ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/loginicon.jpeg"));
		Image i2=il.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350,0,200,200);
		
		add(image);
		loginb2.addActionListener(this);
		loginb.addActionListener(this);
		
		
		setSize(600,300);
		setLocation(500,250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginb) {
			if(tfusername.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Can't be empty");
			}else {
			String username=tfusername.getText();
			String password=tfpassword.getText();
			String query ="select * from login20 where username='"+username+"'and password='"+password+"'";
			try {
				 conn c=new conn();
				ResultSet rs=c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Second_p();
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Credentials");
					
				}
				
			}catch(Exception ae) {
				ae.printStackTrace();	
			}
			
			
			
		}}
		if(e.getSource()==loginb2) {
			new two_2();
			setVisible(false);
			
		}
		
	}

}
