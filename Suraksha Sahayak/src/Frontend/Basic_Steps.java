package Frontend;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Basic_Steps extends JFrame{

	public Basic_Steps() {
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Suraksha Sahayak");
		this.setSize(600, 600);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.add(new JLabel("Do this step untill the help is arrived"
				+ "1.Stay Put: Remain indoors if you're already inside, outdoors if you're already outside. Don't try to relocate within a building.\r\n"
				+ "\r\n"
				+ "2. Take Cover (Indoors): Drop, Cover, and Hold On! Find a sturdy table or desk and shelter beneath it. If unavailable, crouch in an interior corner with your head protected by your arms.\r\n"
				+ "\r\n"
				+ "3. Stay Away from Hazards (Both Indoors and Outdoors): Avoid windows, mirrors, outside walls, falling objects, power lines, and trees. In bed? Stay put and protect your head with a pillow.\r\n"
				+ "\r\n"
				+ "4. Wait Until Shaking Stops: Don't rush outside during the tremors. Only evacuate once it's safe, being cautious of possible aftershocks.\r\n"
				+ "\r\n"
				+ "5. Be Aware of Additional Risks: Expect potential power outages, sprinkler activation, and fire alarms. Remain calm and follow your emergency plan.\r\n"
				+ "\r\n"
				+ "Remember, staying calm and minimizing movement are crucial for earthquake safety."));
		this.setVisible(true);
		
	}
     

}
