/**
 * GeometryCalculator.java
 * 
 * Demonstrates the functions of a calculator by finding the
 * volume and surface area of a sphere, cylinder, and cone.
 */

/**
 * Programming Project 2
 * @author jkiper
 * CS131-01
 * Spring 2019
 */
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeometryCalculator {
	
	//-----------------------------------------------------------------
	//  Creates and displays the application frame for Geometry Calculator.
	//-----------------------------------------------------------------

	public static void main(String[] args)
	{
		JFrame frame= new JFrame("Geometry Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//what to do when you click the X on title bar
		frame.setSize(300,500);
	
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(300,500));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		SpherePanel panel1 = new SpherePanel();
		mainPanel.add(panel1);
		
		CylinderPanel panel2 = new CylinderPanel();
		mainPanel.add(panel2);
		
		ConePanel panel3 = new ConePanel();
		mainPanel.add(panel3);

		frame.getContentPane().add(mainPanel);
		frame.pack();//shrinks the frame to its smallest size
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);//must do this to see the frame, otherwise in memory, but not visible
	}

}
