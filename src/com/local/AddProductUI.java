package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductUI
{

	private JFrame frame;
	private JTextField productNameField;
	private JTextField priceField;
	private JTextField discriptionField;

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
					AddProductUI window = new AddProductUI();
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
	public AddProductUI()
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
		frame.setBounds(100, 100, 450, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel productLabel = new JLabel("Product Name");
		productLabel.setBounds(46, 36, 93, 16);
		frame.getContentPane().add(productLabel);
		
		JLabel priceLabel = new JLabel("Price");
		priceLabel.setBounds(104, 64, 35, 16);
		frame.getContentPane().add(priceLabel);
		
		JLabel categoryLabel = new JLabel("Category");
		categoryLabel.setBounds(78, 92, 61, 16);
		frame.getContentPane().add(categoryLabel);
		
		JLabel pictureLabel = new JLabel("Pictures");
		pictureLabel.setBounds(86, 120, 53, 16);
		frame.getContentPane().add(pictureLabel);
		
		JLabel descLabel = new JLabel("Description");
		descLabel.setBounds(60, 148, 79, 16);
		frame.getContentPane().add(descLabel);
		
		productNameField = new JTextField();
		productNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productName = priceField.getText();
			}
		});

		productNameField.setBounds(173, 31, 174, 26);
		frame.getContentPane().add(productNameField);
		productNameField.setColumns(10);
		
		priceField = new JTextField();
		priceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String price = priceField.getText();
			}
		});
		priceField.setBounds(173, 59, 106, 26);
		frame.getContentPane().add(priceField);
		priceField.setColumns(10);
		
		JComboBox categotiescomboBox = new JComboBox();
		categotiescomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		categotiescomboBox.setBounds(173, 88, 106, 27);
		frame.getContentPane().add(categotiescomboBox);
		
		JButton chooseFilebutton = new JButton("Choose File");
		chooseFilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		chooseFilebutton.setBounds(173, 115, 106, 29);
		frame.getContentPane().add(chooseFilebutton);
		
		discriptionField = new JTextField();
		discriptionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String description = priceField.getText();
			}
		});
		discriptionField.setBounds(173, 143, 234, 117);
		frame.getContentPane().add(discriptionField);
		discriptionField.setColumns(10);
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cancelButton.setBounds(314, 272, 93, 29);
		frame.getContentPane().add(cancelButton);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		saveButton.setBounds(214, 272, 88, 29);
		frame.getContentPane().add(saveButton);
	}
}
