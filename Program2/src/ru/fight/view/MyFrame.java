package ru.fight.view;


import javax.swing.*;
import java.awt.*;

public class MyFrame {
    private   JFrame frame = new JFrame("The test");
    public    void start(){
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton west = new JButton("WEST");
        JButton north = new JButton("NORTH");
        JButton center = new JButton("CENTER");
        JButton east = new JButton("EAST");
        JButton south = new JButton("south");



        JPanel buttonPanelWest = new JPanel(new FlowLayout());
        buttonPanelWest.add(west);

        JPanel buttonPanelCenter = new JPanel(new FlowLayout());
        buttonPanelWest.add(center);


        JPanel buttonPanelNorth = new JPanel(new FlowLayout());
        buttonPanelNorth.add(north);

        JPanel buttonPanelEast = new JPanel(new FlowLayout());
        buttonPanelEast.add(east);

        JPanel buttonPanelSouth = new JPanel(new FlowLayout());
        buttonPanelSouth.add(south);


//        buttonPanel.setVisible(true);

        frame.add(buttonPanelWest, BorderLayout.WEST);
        frame.add(buttonPanelNorth, BorderLayout.NORTH);
        frame.add(buttonPanelEast, BorderLayout.EAST);
        frame.add(buttonPanelSouth, BorderLayout.SOUTH);
        frame.add(buttonPanelCenter,BorderLayout.CENTER);

    }

}
