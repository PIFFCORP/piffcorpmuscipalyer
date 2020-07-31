package piff_corp_4ever;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

public class PiffGui2 implements ActionListener{
	
	public JFrame frame; 
	public JPanel panel;
	public static JLabel PiffLabel2;
	public static JLabel PiffLabel3;
	JLabel Background;
	ImageIcon ashton;
	Image asthon2;
	
	private static JButton Piffbutton3 = new JButton("PIFF STOP");
	private static JButton PiffButton = new JButton("PIFF START");
	private static JButton Piffbutton2 = new JButton("PIFF PAUSE");
	private static JButton Piffbutton4 =  new JButton(Songlist.getSongFromList(0));
	private static JButton Piffbutton5 =  new JButton(Songlist.getSongFromList(1));
	private static JButton Piffbutton6 =  new JButton(Songlist.getSongFromList(2));
	private static JButton Piffbutton7 =  new JButton(Songlist.getSongFromList(3));
	private static JButton Piffbutton8 =  new JButton(Songlist.getSongFromList(4));
	private static JButton Piffbutton9 =  new JButton(Songlist.getSongFromList(5));
	private static JButton Piffbutton10 =  new JButton(Songlist.getSongFromList(6));
	private static JButton Piffbutton11 =  new JButton(Songlist.getSongFromList(7));
	private static JButton Piffbutton12 =  new JButton(Songlist.getSongFromList(8));
	
	
	 static ArrayList<String> piff = (ArrayList<String>) Songlist.getList();
	 static int n = (int) Math.round(Math.random()*8 );
     static String songrandom = piff.get(n);
	 static File Songchoice = new File(songrandom + ".WAV");

	
	
	public PiffGui2()
    {
        
        PiffLabel2= new JLabel("");
        PiffLabel3 = new JLabel("to select a song click the box with the song name and press 'PIFF START'");
        PiffButton.addActionListener(this);
        
        Piffbutton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(0);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(1);
				Songchoice = new File(songrandom + ".WAV");
				
			}
        	
        });
        Piffbutton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(2);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(3);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(4);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(5);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(6);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(7);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });
        Piffbutton12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				songrandom.equals("");
				songrandom = piff.get(8);
				Songchoice = new File(songrandom + ".WAV");
			}
        	
        });

        frame = new JFrame();
        
        panel = new JPanel();
    
        frame.setResizable(false);
       
        panel.add(Piffbutton4);
        panel.add(Piffbutton5);
        panel.add(Piffbutton6);
        panel.add(Piffbutton7);
        panel.add(Piffbutton8);
        panel.add(Piffbutton9);
        panel.add(Piffbutton10);
        panel.add(Piffbutton11);
        panel.add(Piffbutton12);
        panel.add(PiffButton);
       panel.add(Piffbutton2);
       panel.add(Piffbutton3);
       
       panel.setLayout( new FlowLayout(25,26,27));
       frame.setSize(1150,575);
       panel.add(PiffLabel2);
       panel.add(PiffLabel3);
      panel.setBackground(Color.BLACK);
       
    try {  
      File PathToFile =new File("ashton.jpg");
     Image ashton2 = ImageIO.read(PathToFile);
      ashton = new ImageIcon(ashton2);
     Background= new JLabel(ashton);
      Background.setBounds(0, 0, 1150, 575);
      frame.add(Background);
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
       frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PIFF CORP RULE THE WORLD");
        frame.setVisible(true);
       


    }
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Sound.PlaySong(Songchoice);
    
	}
	
		   
		      
	
public static File SongChoiceGetter() {
	return Songchoice;
}
	public static JButton getPiffbutton2() {
		return Piffbutton2;
	}
public static JButton getPiffbutton3() {
	return Piffbutton3;
}
public static JLabel getPiffLabel2() {
	return PiffLabel2;
}
public static String getsongrandom() {
	return songrandom;
}
public static JLabel getPiffLabel3() {
	return PiffLabel3;
}




		
	}
