package com.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login
{

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private ButtonGroup group;
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
					Login window = new Login();
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
	public Login()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.light"));
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 440, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel Username_Label = new JLabel("Username");
		Username_Label.setBounds(60, 117, 86, 16);
		frame.getContentPane().add(Username_Label);
		
		JLabel Password_label = new JLabel("Password");
		Password_label.setBounds(60, 151, 67, 16);
		frame.getContentPane().add(Password_label);
		
		usernameField = new JTextField();
		usernameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user_text =usernameField.getText();
			}
		});
		usernameField.setBounds(139, 112, 130, 26);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JButton signinbutton = new JButton("Sign in");
		signinbutton.setBounds(77, 205, 117, 29);
		frame.getContentPane().add(signinbutton);
		
		JButton forgetpassbutton = new JButton("Forget Password");
		forgetpassbutton.setBounds(206, 205, 130, 29);
		frame.getContentPane().add(forgetpassbutton);
		
		JButton signupbutton = new JButton("Sign up");
		signupbutton.setBounds(139, 246, 117, 29);
		frame.getContentPane().add(signupbutton);
		
		JRadioButton customer_radio = new JRadioButton("Customer");
		customer_radio.setBounds(282, 113, 141, 23);
		frame.getContentPane().add(customer_radio);
		
		JRadioButton admin_radio = new JRadioButton("Admin");
		admin_radio.setBounds(282, 147, 141, 23);
		frame.getContentPane().add(admin_radio);
		
		group =new ButtonGroup();
		group.add(admin_radio);
		group.add(customer_radio);

		signupbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
		signupbutton.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass_text = passwordField.getText();
			}
		});
		passwordField.setBounds(139, 146, 130, 26);
		frame.getContentPane().add(passwordField);
		
		JLabel titleLabel = new JLabel("Shopping App");
		titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		titleLabel.setBounds(145, 37, 160, 53);
		frame.getContentPane().add(titleLabel);
		
		
		
		
		
	}
}
