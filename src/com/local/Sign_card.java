package com.local;

import javax.swing.*;
import java.awt.*;

public class Sign_card
{

	private JFrame frame;
	private JTextField cardnumberField;
	private JTextField expiredField;
	private JPasswordField ccvField;
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
					Sign_card window = new Sign_card();
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
	public Sign_card()
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
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton visaRadio = new JRadioButton("Visa");
		visaRadio.setBounds(6, 16, 141, 23);
		frame.getContentPane().add(visaRadio);
		
		JRadioButton mastercardRadio = new JRadioButton("MasterCard");
		mastercardRadio.setBounds(144, 16, 141, 23);
		frame.getContentPane().add(mastercardRadio);
		
		JRadioButton AmericanRadio = new JRadioButton("American Express");
		AmericanRadio.setBounds(297, 16, 147, 23);
		frame.getContentPane().add(AmericanRadio);
		
		cardnumberField = new JTextField();
		cardnumberField.setBounds(164, 68, 163, 26);
		frame.getContentPane().add(cardnumberField);
		cardnumberField.setColumns(10);
		
		expiredField = new JTextField();
		expiredField.setBounds(164, 121, 163, 26);
		frame.getContentPane().add(expiredField);
		expiredField.setColumns(10);

		ccvField = new JPasswordField();
		ccvField.setBounds(164, 175, 64, 26);
		frame.getContentPane().add(ccvField);
		ccvField.setColumns(10);
		
		JButton confirmButton = new JButton("Confirm ");
		confirmButton.setBounds(179, 243, 117, 29);
		frame.getContentPane().add(confirmButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(308, 243, 117, 29);
		frame.getContentPane().add(cancelButton);
		
		JLabel ccvLabel = new JLabel("CVV");
		ccvLabel.setBounds(88, 180, 31, 16);
		frame.getContentPane().add(ccvLabel);
		
		JLabel Expiredlabel = new JLabel("Expired Date");
		Expiredlabel.setBounds(36, 126, 83, 16);
		frame.getContentPane().add(Expiredlabel);
		
		JLabel Cardlabel = new JLabel("Card Number");
		Cardlabel.setBounds(36, 73, 83, 16);
		frame.getContentPane().add(Cardlabel);
		
		group =new ButtonGroup();
		group.add(visaRadio);
		group.add(mastercardRadio);
		group.add(AmericanRadio);
	}
}
