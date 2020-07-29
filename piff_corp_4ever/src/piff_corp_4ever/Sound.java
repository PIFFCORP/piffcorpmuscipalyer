package piff_corp_4ever;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Sound {
	public Sound(){
	try {
	    File grace_3;
	    AudioInputStream stream;
	    AudioFormat Format;
	    DataLine.Info info;
	    Clip clip;
	    
	    stream=AudioSystem.getAudioInputStream(grace_3);
	    Format = stream.getFormat();
	    info =  new DataLine.Info(Clip.class, Format);
	    clip = (Clip) AudioSystem.getLine(info);
	    clip.open(stream);
	    clip.start();
	    }
	    catch(Exception p) {
	    	System.out.println("error");
	    }
}
}