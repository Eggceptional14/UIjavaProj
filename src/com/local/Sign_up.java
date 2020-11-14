package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sign_up
{

	private JFrame frame;
	private JTextField emailField;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JPasswordField confirmField;
	private JTextField phoneField;
	private JTextField nameField;
	

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
					Sign_up window = new Sign_up();
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
	public Sign_up()
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
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Email_label = new JLabel("Email");
		Email_label.setBounds(113, 38, 34, 16);
		frame.getContentPane().add(Email_label);
		
		JLabel Username_label = new JLabel("Username");
		Username_label.setBounds(85, 66, 62, 16);
		frame.getContentPane().add(Username_label);
		
		JLabel Password_label = new JLabel("Password");
		Password_label.setBounds(86, 94, 61, 16);
		frame.getContentPane().add(Password_label);
		
		JLabel Confirm_label = new JLabel("Confirm Password");
		Confirm_label.setBounds(30, 122, 130, 16);
		frame.getContentPane().add(Confirm_label);
		
		emailField = new JTextField();
		emailField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email_text =emailField.getText();
			}
		});
		emailField.setBounds(194, 33, 212, 26);
		frame.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		usernameField = new JTextField();
		usernameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user_text =usernameField.getText();
			}
		});
		usernameField.setBounds(194, 61, 212, 26);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass_text= passwordField.getText();
			}
		});
		passwordField.setBounds(194, 89, 212, 26);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		confirmField = new JPasswordField();
		confirmField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String comfirm_text= confirmField.getText();
			}
		});
		confirmField.setBounds(194, 117, 212, 26);
		frame.getContentPane().add(confirmField);
		confirmField.setColumns(10);
		
		JLabel Phone_label = new JLabel("Phone");
		Phone_label.setBounds(106, 150, 67, 16);
		frame.getContentPane().add(Phone_label);
		
		phoneField = new JTextField();
		phoneField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phone_text= phoneField.getText();
			}
		});
		phoneField.setBounds(194, 145, 212, 26);
		frame.getContentPane().add(phoneField);
		phoneField.setColumns(10);
		
		JLabel Address_label = new JLabel("Address");
		Address_label.setBounds(95, 178, 51, 16);
		frame.getContentPane().add(Address_label);
		
		
		
		
		JButton confirmbutton = new JButton("Confirm");
		confirmbutton.setBounds(99, 269, 117, 29);
		frame.getContentPane().add(confirmbutton);
		
		JButton cancelbutton = new JButton("Cancel");
		cancelbutton.setBounds(218, 269, 117, 29);
		frame.getContentPane().add(cancelbutton);
		
		JLabel Name_label = new JLabel("Name");
		Name_label.setBounds(113, 11, 47, 16);
		frame.getContentPane().add(Name_label);
		
		nameField = new JTextField();
		nameField.setBounds(194, 6, 212, 26);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 183, 212, 74);
		frame.getContentPane().add(scrollPane);
		
		JTextArea addressTextarea = new JTextArea();
		scrollPane.setViewportView(addressTextarea);
	}
}