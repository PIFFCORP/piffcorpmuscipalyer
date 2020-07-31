package piff_corp_4ever;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Set;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Sound {
	
	public static boolean isPlaying = false;
	static void PlaySong(File Song) {
		try {
		    Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Song));
			clip.start();
		 isPlaying = true;
		 JLabel PiffLabel2 = PiffGui2.getPiffLabel2();
		 PiffLabel2.setText( PiffGui2.getsongrandom());
		 JLabel PiffLabel3 = PiffGui2.getPiffLabel3();
		 PiffLabel3.setText("to change the current song you are listening to hit 'PIFF STOP' while the song is playing and then click the next song");
		 JButton Piffbutton2 = PiffGui2.getPiffbutton2();
		JButton Piffbutton3 = PiffGui2.getPiffbutton3();
		 if(isPlaying) {
				Piffbutton3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						clip.stop();
						clip.close();
						PiffGui2.songrandom.equals("");
					}
					
				});
			 
			 
			 Piffbutton2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						long clipTimePosition = clip.getMicrosecondPosition();
						if(isPlaying) {
						clip.stop();
						isPlaying =  false;
						Piffbutton2.setText("PIFF RESUME");
						}
						else {
							clip.setMicrosecondPosition(clipTimePosition);
							clip.start();
							isPlaying = true;
							Piffbutton2.setText("PIFF PAUSE");
						}
						
					}
				 
				 });
		 }
		 else {
			 System.out.println("error");
		 }
				 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
	
	
	
		
		
	}
	

	
}
