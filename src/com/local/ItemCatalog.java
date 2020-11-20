package com.local;

import javax.swing.*;
import java.awt.*;

public class ItemCatalog extends JPanel {
    public JSpinner itemNumSpn;
    public JButton addToCartBtn;
    public JButton previewBtn;
    private JLabel picture;

    private JPanel rowOne;
    private JPanel rowTwo;
    private JPanel rowThree;

    public ItemCatalog(String name){

        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder(name));
        this.setPreferredSize(new Dimension(200, 250));

        GridBagConstraints gbc = new GridBagConstraints();

        picture = new JLabel();
        itemNumSpn = new JSpinner();
        addToCartBtn = new JButton("Add To Cart");
        previewBtn = new JButton("Preview");

        rowOne = new JPanel();
        rowTwo = new JPanel(new FlowLayout());
        rowThree = new JPanel();
        picture.setIcon(new ImageIcon("asset/tshirt.png"));

        itemNumSpn.setPreferredSize(new Dimension(45, 30));
        addToCartBtn.setPreferredSize(new Dimension(100, 30));

        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(rowOne, gbc);

        gbc.anchor = GridBagConstraints.BASELINE;
        gbc.gridy = 1;
        this.add(rowTwo,gbc);

        gbc.gridy = 2;
        this.add(rowThree,gbc);

        rowOne.add(picture);
        rowOne.setAlignmentX(Component.CENTER_ALIGNMENT);
        rowOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 3, 5));

        rowTwo.add(itemNumSpn);
        rowTwo.setBorder(BorderFactory.createEmptyBorder(0, 5, 3, 5));
        rowTwo.add(addToCartBtn);

        rowThree.add(previewBtn);
        rowThree.setBorder(BorderFactory.createEmptyBorder(0, 5, 3, 5));

    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        JPanel myPanel = new JPanel();
//        frame.setSize(1000, 600);
//        frame.add(myPanel);
//        myPanel.add(new ItemCatalog("Test"));
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//    }
}