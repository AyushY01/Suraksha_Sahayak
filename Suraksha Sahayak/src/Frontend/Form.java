package Frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Form extends JFrame implements ActionListener {
	JButton button1,button2;
	JTextField name,phone_no;
	JTextArea address;
	
	public Form() {
		// TODO Auto-generated constructor stub
		

		
			//JComboBox state = null;
			JPanel panel,panel1,panel2;
			button1=new JButton("Submit");
			button1.setBounds(250,450,100,40);
			button2=new JButton("Go Back");
			button2.setBounds(450,10,100,40);
			
			
			panel=new JPanel();
			panel1=new JPanel();
			panel2=new JPanel();
			
			name=new JTextField();
			 address= new JTextArea();
			 phone_no = new JTextField();

			
			panel.setBounds(100,100,100,40);
			name.setBounds(210,100,200,40);
			panel1.setBounds(100,150,100,40);
			address.setBounds(210,150,200,100);
		    address.setLineWrap(true);

			JRadioButton male,female;
			ButtonGroup Gender=new ButtonGroup();
			
			 JLabel label2,label3,label4;
			 label2=new JLabel();
			 label2.setText("Name");
			 label2.setFont(new Font("MV BOLI", Font.BOLD,20));
			 label3=new JLabel("Address");
			 label3.setFont(new Font("MV BOLI", Font.BOLD,20));
			 label4=new JLabel("Phone NO.");
			 label4.setFont(new Font("MV BOLI", Font.BOLD,18));
			 panel2.setBounds(100,350,100,40);
			 phone_no.setBounds(210,350,200,40);




			 male=new JRadioButton("male");
			 male.setBounds(210,256,100,50);
			 Gender.add(male);
			 female=new JRadioButton("Female");
			 female.setBounds(310,256,100,50);
			 Gender.add(female);
			 
			 
			
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha_Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(128, 128, 128));
				this.setLocationRelativeTo(null);
			
				this.setLayout(null);
				this.add(panel);
				this.add(panel1);
				this.add(panel2);

				panel.add(label2);
				panel1.add(label3);
				panel2.add(label4);
				this.add(male);
				this.add(female);
				this.add(name);
				this.add(address);
				this.add(phone_no);
				this.add(button2);

				this.add(button1);
				
				button1.addActionListener(this);
				button2.addActionListener(this);


				
				
				this.setVisible(true);

				
			 
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1) {
				
				String Name=name.getText();
				String Address=address.getText();
				String Phone_no=phone_no.getText();
				try {
					String query="insert into signup values('"+Name+"','"+Address+"','"+Phone_no+"')";
					conn con=new conn();
					con.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Details added successfull");
					UIManager.put("OptionPane.minimumSize",new Dimension(500,500)); 
					JOptionPane.showMessageDialog(null, "Do this step untill the help is arrived\n"
							+ "1.Stay Put: Remain indoors if you're already inside, outdoors if you're already outside. Don't try to relocate within a building.\n"
							+ "2. Take Cover (Indoors): Drop, Cover, and Hold On! Find a sturdy table or desk and shelter beneath it. If unavailable, crouch in an interior corner with your head protected by your arms.\n"
							+ "3. Stay Away from Hazards (Both Indoors and Outdoors): Avoid windows, mirrors, outside walls, falling objects, power lines, and trees. In bed? Stay put and protect your head with a pillow.\n"
							+ "4. Wait Until Shaking Stops: Don't rush outside during the tremors. Only evacuate once it's safe, being cautious of possible aftershocks.\n"
							+ "5. Be Aware of Additional Risks: Expect potential power outages, sprinkler activation, and fire alarms. Remain calm and follow your emergency plan.\n"
							+ " Remember, staying calm and minimizing movement are crucial for earthquake safety.");
					setVisible(false);
					

					
					
					
					
			}catch (Exception ae) {
				ae.printStackTrace();
				
			}
				
			
			
		}if(e.getSource()==button2) {
			new Login();
			setVisible(false);
			
		}

	}


}
