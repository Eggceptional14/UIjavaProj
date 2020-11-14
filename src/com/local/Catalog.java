package com.local;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Catalog
{

	private JFrame frame;
	private JTextField searchField;
	private ButtonGroup group;
	private ArrayList<ItemCatalog> shirts;
	private ArrayList<ItemCatalog> pants;

	/**
	 * Create the application.
	 */
	public Catalog()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		shirts = new ArrayList<ItemCatalog>();
		pants = new ArrayList<ItemCatalog>();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton profileButton = new JButton("PROFILE");
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		profileButton.setBounds(37, 6, 85, 45);
		frame.getContentPane().add(profileButton);
		
		JButton cartButton = new JButton("");
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cartButton.setBounds(915, 6, 79, 45);
		frame.getContentPane().add(cartButton);
		
		cartButton.setIcon(new ImageIcon("asset/shopping-cart.png"));
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(54, 86, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		searchField = new JTextField();
		searchField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		searchField.setBounds(17, 114, 130, 26);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sort By");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(54, 184, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox sortBox = new JComboBox();
		sortBox.setBounds(17, 212, 130, 27);
		frame.getContentPane().add(sortBox);
		
		sortBox.addItem("Price (Low to high)");
		sortBox.addItem("Price (High to low)");
		sortBox.addItem("Name(A-Z)");
		sortBox.addItem("Name(Z-A)");
		sortBox.addItem("Latest");
		sortBox.addItem("Newest");
		
		JRadioButton shirtRadioButton = new JRadioButton("Shirts");
		shirtRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		shirtRadioButton.setBounds(17, 300, 141, 23);
		frame.getContentPane().add(shirtRadioButton);
		
		JRadioButton pantRadioButton = new JRadioButton("Pants");
		pantRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		pantRadioButton.setBounds(17, 335, 141, 23);
		frame.getContentPane().add(pantRadioButton);
		
		JRadioButton allRadioButton = new JRadioButton("All");
		allRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		allRadioButton.setBounds(17, 370, 141, 23);
		frame.getContentPane().add(allRadioButton);
		
		JButton applyButton = new JButton("Apply");
		applyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		applyButton.setBounds(15, 486, 130, 29);
		frame.getContentPane().add(applyButton);
		
		JLabel modelLabel = new JLabel("");
		modelLabel.setBounds(764, 80, 189, 403);
		frame.getContentPane().add(modelLabel);
		modelLabel.setIcon(new ImageIcon("asset/model.png"));
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		clearButton.setBounds(836, 508, 117, 29);
		frame.getContentPane().add(clearButton);
		
		group =new ButtonGroup();
		group.add(shirtRadioButton);
		group.add(pantRadioButton);
		group.add(allRadioButton);
		
		JScrollPane shirtScrollPane = new JScrollPane();
		shirtScrollPane.setBounds(190, 18, 562, 305);
		frame.getContentPane().add(shirtScrollPane);
		
		JPanel shirtPanel = new JPanel();
		shirtScrollPane.setViewportView(shirtPanel);

		for(int i = 0; i < 5; i++) {
			ItemCatalog tempItem = new ItemCatalog("Sample");
			tempItem.addToCartBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			tempItem.previewBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			tempItem.itemNumSpn.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {

				}
			});
			shirts.add(tempItem);
		}

		for(int i = 0; i < shirts.size(); i++) {
			shirtPanel.add(shirts.get(i));
		}
		
		shirtScrollPane.setBorder(BorderFactory.createTitledBorder("T-shirt"));
		
		JScrollPane pantScrollPane = new JScrollPane();
		pantScrollPane.setBounds(190, 335, 562, 305);
		frame.getContentPane().add(pantScrollPane);
		
		JPanel pantPanel = new JPanel();
		pantScrollPane.setViewportView(pantPanel);

		for(int i = 0; i < 5; i++) {
			ItemCatalog tempItem = new ItemCatalog("Sample");
			tempItem.addToCartBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			tempItem.previewBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}
			});
			tempItem.itemNumSpn.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {

				}
			});
			pants.add(tempItem);
		}

		for(int i = 0; i < pants.size(); i++) {
			pantPanel.add(pants.get(i));
		}

		pantScrollPane.setBorder(BorderFactory.createTitledBorder("Pants"));
	}

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
					Catalog window = new Catalog();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
