package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restock
{

	private JFrame frame;
	private JTextField amountField;

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
					Restock window = new Restock();
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
	public Restock()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 274, 187);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel amountLbl = new JLabel("Amount");
		amountLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		amountLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		amountLbl.setBounds(27, 56, 73, 17);
		frame.getContentPane().add(amountLbl);
		
		amountField = new JTextField();
		amountField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = amountField.getText();
			}
			
		});
		amountField.setBounds(121, 52, 107, 26);
		frame.getContentPane().add(amountField);
		amountField.setColumns(10);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		saveButton.setBounds(143, 90, 85, 29);
		frame.getContentPane().add(saveButton);
	}

}
