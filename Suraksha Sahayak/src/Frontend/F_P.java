package Frontend;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F_P extends JFrame implements Runnable{
Thread t;
	public F_P() {
		ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/dm.jpg"));
		Image i2=il.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image);
		t=new Thread(this);
		t.start();
		
		setVisible(true);
	   int x=1;
	    for(int i=2;i<=600;i+=4,x+=1) {
	    	 setLocation(600-((i+x)/2),350-(i/2));
	    	 
	 	    setSize(i+3*x,i+x/2);
	 	    try {
	 	    	Thread.sleep(10);
	 	    }catch(Exception e) {
	 	    	
	 	    }
	    }
	}

	public static void main(String[] args) {
		new F_P();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			setVisible(false);
			new Login();
		}catch(Exception e) {
			
		}
	}

}
