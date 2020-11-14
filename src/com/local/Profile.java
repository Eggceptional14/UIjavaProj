package com.local;

import javax.swing.*;
import java.awt.*;

public class Profile
{

	private JFrame frmProfile;

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
					Profile window = new Profile();
					window.frmProfile.setVisible(true);
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
	public Profile()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmProfile = new JFrame();
		frmProfile.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmProfile.setTitle("Profile");
		frmProfile.setBounds(100, 100, 450, 361);
		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfile.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 61, 22);
		frmProfile.getContentPane().add(menuBar);
		
		JMenu profileMenu = new JMenu("Profile");
		menuBar.add(profileMenu);
		
		JMenuItem infoMenu = new JMenuItem("Info");
		profileMenu.add(infoMenu);
		
		JSeparator separator = new JSeparator();
		profileMenu.add(separator);
		
		JMenuItem historyMenu = new JMenuItem("History");
		profileMenu.add(historyMenu);
		
		JLabel profileLabel = new JLabel("Profile");
		profileLabel.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		profileLabel.setBounds(20, 45, 122, 16);
		frmProfile.getContentPane().add(profileLabel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(116, 100, 39, 16);
		frmProfile.getContentPane().add(nameLabel);
		
		JLabel usrnameLabel = new JLabel("Username");
		usrnameLabel.setBounds(93, 140, 71, 16);
		frmProfile.getContentPane().add(usrnameLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(116, 180, 34, 16);
		frmProfile.getContentPane().add(emailLabel);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setBounds(116, 220, 61, 16);
		frmProfile.getContentPane().add(phoneLabel);
		
		JLabel addrLabel = new JLabel("Address");
		addrLabel.setBounds(103, 259, 61, 16);
		frmProfile.getContentPane().add(addrLabel);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(327, 304, 117, 29);
		frmProfile.getContentPane().add(backButton);
		
		JLabel nmLabel = new JLabel(":");
		nmLabel.setForeground(Color.DARK_GRAY);
		nmLabel.setBackground(Color.WHITE);
		nmLabel.setBounds(202, 100, 210, 16);
		frmProfile.getContentPane().add(nmLabel);
		
		JLabel UserLabel = new JLabel(":");
		UserLabel.setBounds(202, 140, 210, 16);
		frmProfile.getContentPane().add(UserLabel);
		
		JLabel emlLabel = new JLabel(":");
		emlLabel.setBounds(202, 180, 210, 16);
		frmProfile.getContentPane().add(emlLabel);
		
		JLabel phnLabel = new JLabel(":");
		phnLabel.setBounds(202, 220, 210, 16);
		frmProfile.getContentPane().add(phnLabel);
		
		JLabel addressLabel = new JLabel(":");
		addressLabel.setBounds(202, 259, 210, 16);
		frmProfile.getContentPane().add(addressLabel);
	}
}
