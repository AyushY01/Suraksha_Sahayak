package Frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Second_p extends JFrame implements ActionListener{

	JMenuItem exit;
	JMenuItem Earthquake,Flood,Landslide,Terrorist_Attack,Bomb,other,Victim_a,Survivor,Volunteer1,Donate;
	public Second_p() {
		setSize(1540,815);
		this.setTitle("suraksha_Sahayak");
		ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/main.jpg"));
		Image i2=il.getImage().getScaledInstance(1500,750, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image);

		JMenuBar mb=new JMenuBar(); 
		JMenu es =new JMenu("Emergercency Services");
		mb.add(es);
		es.setForeground(Color.BLACK);
		
		//ES
		Earthquake  =new JMenuItem("EarthQuake");
		mb.add(Earthquake);
		Earthquake.setForeground(Color.BLACK);
		es.add(Earthquake);
		
		Flood  =new JMenuItem("Flood");
		mb.add(Flood);
		Flood.setForeground(Color.BLACK);
		es.add(Flood);
		
		Landslide  =new JMenuItem("LandSlide");
		mb.add(Landslide);
		Landslide.setForeground(Color.BLACK);
		es.add(Landslide);
		
		Terrorist_Attack  =new JMenuItem("Terrorists_Attack");
		mb.add(Terrorist_Attack);
		Terrorist_Attack.setForeground(Color.BLACK);
		es.add(Terrorist_Attack);
		
		Bomb  =new JMenuItem("Bomb");
		mb.add(Bomb);
		Bomb.setForeground(Color.BLACK);
		es.add(Bomb);
		
		other  =new JMenuItem("Other");
		mb.add(other);
		other.setForeground(Color.BLACK);
		es.add(other);
		
		//Report
		
		JMenu es2 =new JMenu("Report");
		mb.add(es2);
		es2.setForeground(Color.BLACK);
		
		Victim_a  =new JMenuItem("Victim");
		Victim_a.setForeground(Color.BLACK);
		es2.add(Victim_a);
		
		Survivor  =new JMenuItem("Survivor");
		Survivor.setForeground(Color.BLACK);
		es2.add(Survivor);
		
		//Volunteer
		
		JMenu es3 =new JMenu("Volunteer");
		mb.add(es3);
		es3.setForeground(Color.BLACK);
		
		
		
		Volunteer1 =new JMenuItem("Volunteer");
		Volunteer1.setForeground(Color.BLACK);
		es3.add(Volunteer1);
		
		Donate  =new JMenuItem("Donate");
		Donate.setForeground(Color.BLACK);
		es3.add(Donate);
		
		//
		
				JMenu es4 =new JMenu("Exit");
				mb.add(es4);
				es4.setForeground(Color.BLACK);
				
				
				
				exit =new JMenuItem("Exit");
				exit.setForeground(Color.BLACK);
				es4.add(exit);
				
				
		
		
		
		
		
		
		
		setJMenuBar(mb);

		exit.addActionListener(this);
		Earthquake.addActionListener(this);
		Flood.addActionListener(this);
		Landslide.addActionListener(this);
		Terrorist_Attack.addActionListener(this);
		Bomb.addActionListener(this);
		other.addActionListener(this);
		Victim_a.addActionListener(this);
		Survivor.addActionListener(this);
		Volunteer1.addActionListener(this);
		Donate.addActionListener(this);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Second_p();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit) {
			setVisible(false);
			
		}else if(e.getSource()==Earthquake) {
			setVisible(false);
			new Form();
			
			
			 
			
		}else if(e.getSource()==Flood) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Landslide) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Terrorist_Attack) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Bomb) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==other) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Victim_a) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Survivor) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Volunteer1) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}else if(e.getSource()==Donate) {
			new Form();
			 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setTitle("Suraksha Sahayak");
				this.setSize(600, 600);
				this.getContentPane().setBackground(new Color(153, 204, 255));
		}
		
	}

}
