package piff_corp_4ever;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.io.*;
import javax.sound.sampled.*;


public class PiffGui2 implements ActionListener{
	private JLabel PiffLabel;
	private JFrame frame;
	private JPanel panel;
	
	public PiffGui2()
    {
        JButton PiffButton = new JButton("PIFF BUTTON");
        PiffLabel = new JLabel("PIFF CORP RULE THE WORLD");
       
        PiffButton.addActionListener(this);
       
        frame = new JFrame();
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(PiffButton);;
        panel.add(PiffLabel);
       
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Piff Gui");
        frame.setVisible(true);


    }

	@Override
	public void actionPerformed(ActionEvent e) {
    
	}
    }
