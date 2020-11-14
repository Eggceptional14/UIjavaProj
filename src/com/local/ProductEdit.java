package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductEdit
{

	private JFrame frame;
	private JTextField productNameField;
	private JTextField priceField;
	private JTextField descriptionTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ProductEdit window = new ProductEdit();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProductEdit()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel prodNameLabel = new JLabel("Product Name");
		prodNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		prodNameLabel.setBounds(55, 40, 95, 16);
		frame.getContentPane().add(prodNameLabel);
		
		JLabel priceLabel = new JLabel("Price");
		priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		priceLabel.setBounds(89, 68, 61, 16);
		frame.getContentPane().add(priceLabel);
		
		JLabel picLabel = new JLabel("Pictures");
		picLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		picLabel.setBounds(89, 96, 61, 16);
		frame.getContentPane().add(picLabel);
		
		JLabel descLabel = new JLabel("Description");
		descLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		descLabel.setBounds(43, 124, 107, 16);
		frame.getContentPane().add(descLabel);
		
		productNameField = new JTextField();
		productNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productName = productNameField.getText();
			}
		});
		productNameField.setBounds(184, 35, 172, 26);
		frame.getContentPane().add(productNameField);
		productNameField.setColumns(10);
		
		priceField = new JTextField();
		priceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String price = priceField.getText(); 
			}
			
		});
		priceField.setBounds(184, 63, 107, 26);
		frame.getContentPane().add(priceField);
		priceField.setColumns(10);
		
		descriptionTextField = new JTextField();
		descriptionTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String description = priceField.getText();
			}
		});
		descriptionTextField.setBounds(184, 119, 172, 108);
		frame.getContentPane().add(descriptionTextField);
		descriptionTextField.setColumns(10);
		
		JButton descriptionField = new JButton("Choose File");
		descriptionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		descriptionField.setBounds(184, 91, 107, 29);
		frame.getContentPane().add(descriptionField);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		saveButton.setBounds(194, 239, 77, 29);
		frame.getContentPane().add(saveButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cancelButton.setBounds(279, 239, 77, 29);
		frame.getContentPane().add(cancelButton);
	}

}
