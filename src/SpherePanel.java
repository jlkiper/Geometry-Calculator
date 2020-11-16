/**
 * SpherePanel.java
 * 
 * Demonstrates the functions of a calculator by building
 * the labels and listeners of the Sphere panel.
 */

/**
 * Programming Project 2
 * @author jkiper
 * CS131-01
 * Spring 2019
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpherePanel extends JPanel{

	private JLabel inputLabel, outputLabel1, outputLabel2, resultLabel1, resultLabel2;
	private JTextField radius;
	
	//--------------------------------------------------------------------------
	//  Sets up the main GUI components of the Sphere Panel.
	//--------------------------------------------------------------------------
	public SpherePanel() {
		
		setLayout(new GridLayout(0, 2));
		setBorder(BorderFactory.createTitledBorder("Sphere"));
		
		inputLabel = new JLabel("Radius:", SwingConstants.RIGHT);
		outputLabel1 = new JLabel("Volume:", SwingConstants.RIGHT);
		resultLabel1 = new JLabel("---");
		outputLabel2 = new JLabel("Surface Area:", SwingConstants.RIGHT);
		resultLabel2 = new JLabel("---");
		radius = new JTextField(10);
		
		add(inputLabel);
		add(radius);
		add(outputLabel1);
		add(resultLabel1);
		add(outputLabel2);
		add(resultLabel2);
		
		JButton clear = new JButton("Clear");
		JButton calculate = new JButton("Calculate");
		clear.addActionListener(new Button1Listener());
		calculate.addActionListener(new Button2Listener());
		
		add(clear);
		add(calculate);
		
	}//end SpherePanel constructor
	
	//*****************************************************************
	//  Represents a listener for button push (action) events.
	//*****************************************************************
	private class Button1Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
                radius.setText("");
                resultLabel1.setText("---");
                resultLabel2.setText("---");
			
		}//ends actionPerformed

	}//ends private class
	
	private class Button2Listener implements ActionListener{
			
		public void actionPerformed(ActionEvent event) {
			
			Sphere s = new Sphere();
			s.setRadius(Double.parseDouble(radius.getText()));
			resultLabel1.setText(Double.toString(s.getVolume()));
			resultLabel2.setText(Double.toString(s.getSurfaceArea()));
				
		}//ends actionPerformed
		
	}//ends private class

}//end class
