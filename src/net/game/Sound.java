package net.game;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Sound implements Runnable{
	public static boolean play = false;
	public static String sss="";

	public static Thread thread;

	public static void play(String sound){
		try {
		    
			/*URL u = this.getClass().getResource("/x.wav"); 
			String s = u.toString();
			new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
			s= s.replace("file:", "");
			System.out.println(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
			System.out.println(System.getProperty("user.home")+"/x.wav");*/
		    //File yourFile= new File(System.getProperty("user.home")+"/"+sound+".wav");


			System.out.println(new File(".").getAbsolutePath());
			String s = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			s=s.replace("/LD31.jar", "/"+sound+".wav");
			File yourFile= new File(s);

			AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(yourFile);
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		    clip.close();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		play=false;
		
	}
	public static void start() {
		
	}

	public void run() {
		
		while(true){
			System.err.println("ookk");
		if(play){
			try {
				thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			play(sss);
		}
		}
		
	}

}
