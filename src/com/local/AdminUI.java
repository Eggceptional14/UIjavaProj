package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI
{

	private JFrame frame;
	private JTable table;

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
					AdminUI window = new AdminUI();
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
	public AdminUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 530, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);
		scrollPane.setBounds(50, 44, 430, 190);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		addButton.setBackground(Color.WHITE);
		addButton.setBounds(106, 254, 101, 29);
		frame.getContentPane().add(addButton);
		
		JButton restockButton = new JButton("Restock");
		restockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		restockButton.setBounds(401, 254, 101, 29);
		frame.getContentPane().add(restockButton);
		
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		removeButton.setBounds(302, 254, 101, 29);
		frame.getContentPane().add(removeButton);
		
		JButton editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editButton.setBounds(204, 254, 101, 29);
		frame.getContentPane().add(editButton);
		
		JButton calcelButton = new JButton("Cancel");
		calcelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calcelButton.setBounds(401, 297, 101, 29);
		frame.getContentPane().add(calcelButton);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveButton.setBounds(302, 297, 101, 29);
		frame.getContentPane().add(saveButton);
		
		JLabel adminLabel = new JLabel("Admin");
		adminLabel.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		adminLabel.setBounds(50, 10, 101, 26);
		frame.getContentPane().add(adminLabel);
	}
}
