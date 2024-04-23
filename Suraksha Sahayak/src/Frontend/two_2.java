package Frontend;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
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


public class two_2 extends JFrame implements ActionListener,KeyListener{
	JButton loginb,loginb2;
	JTextField tfusername;
	JPasswordField tfpassword;
	

	public two_2() {
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
		
		loginb=new JButton("OK");
		loginb.setBounds(40,140,120,30);
		
		add(loginb);
		
		loginb2=new JButton("Go Back");
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
			}else{
				int rs=0;
				
			String username=tfusername.getText();
			if( !username.matches("[A-Za-z]+")) {
				JOptionPane.showMessageDialog(null, "Only letters allowed in username");

			}else {
			String password=tfpassword.getText();
			String query ="INSERT INTO login20(username,password) VALUES(?,?)";
			int result=0;
			try {
		       
		        conn con=new conn();
		        
	            PreparedStatement preparedStatement = con.c.prepareStatement(query);

		        preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);
				
	            result = preparedStatement.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Your Record added successfully");
				
			}catch(Exception ae) {
				ae.printStackTrace();	
			}
			
			
			
		}}}
		if(e.getSource()==loginb2) {
			new Login();
			setVisible(false);
			
		}
		
	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
