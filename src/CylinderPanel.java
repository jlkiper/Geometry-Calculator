/**
 * CylinderPanel.java
 * 
 * Demonstrates the functions of a calculator by building
 * the labels and listeners of the Cylinder panel.
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

public class CylinderPanel extends JPanel{

	private JLabel inputLabel1, inputLabel2, outputLabel1, outputLabel2, resultLabel1, resultLabel2;
	private JTextField radius, height;
	
	//--------------------------------------------------------------------------
	//  Sets up the main GUI components of the Cylinder Panel.
	//--------------------------------------------------------------------------
	public CylinderPanel() {
		
		setLayout(new GridLayout(0, 2));
		setBorder(BorderFactory.createTitledBorder("Cylinder"));
		
		inputLabel1 = new JLabel("Radius:", SwingConstants.RIGHT);
		radius = new JTextField(10);
		inputLabel2 = new JLabel("Height:", SwingConstants.RIGHT);
		height = new JTextField(10);
		outputLabel1 = new JLabel("Volume:", SwingConstants.RIGHT);
		resultLabel1 = new JLabel("---");
		outputLabel2 = new JLabel("Surface Area:", SwingConstants.RIGHT);
		resultLabel2 = new JLabel("---");
		
		add(inputLabel1);
		add(radius);
		add(inputLabel2);
		add(height);
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
		
	}//end CylinderPanel constructor
	
	//*****************************************************************
	//  Represents a listener for button push (action) events.
	//*****************************************************************
	private class Button1Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
                radius.setText("");
                height.setText("");
                resultLabel1.setText("---");
                resultLabel2.setText("---");
			
		}//ends actionPerformed

	}//ends private class
	
	private class Button2Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {

			Cylinder cy = new Cylinder();
			cy.setRadius(Double.parseDouble(radius.getText()));
			cy.setHeight(Double.parseDouble(height.getText()));
			resultLabel1.setText(Double.toString(cy.getVolume()));
			resultLabel2.setText(Double.toString(cy.getSurfaceArea()));
			
		}//ends actionPerformed
	
}//ends private class

}//end class
