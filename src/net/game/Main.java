package net.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;

import net.game.entity.Car;
import net.game.entity.Carrot;
import net.game.entity.Kid;
import net.game.entity.Particel;
import net.game.entity.Player;
import net.game.graphics.Map;
import net.game.graphics.Num;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;
import net.game.input.Key;



public class Main extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;
	
	
	public static int w = 416;
	public static int h = 320,ts=16;


	public static boolean t2m=false,t22=true,gameTime=true;;
	public static int scale =2,t,t2;;
	
	
	public static int fps, ups,bC = 0,kam=0;
	public static String fileName;
	
	public static Thread thread2;

	public static Thread thread;
	private JFrame frame;
		
	

	
	
	public static int mob = 0;
	
	
	private boolean running = false;
	public boolean deBug = false;
		
	
	
	
	
	
	public static Random R=  new Random();
	
	private BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	
	
	
	
	public static Kid[] k=new Kid[20];
	
	
	public Main(){
		Dimension size = new Dimension(w * scale, h * scale);
		setPreferredSize(size);
		
		frame = new JFrame();

		
	}
	Sound sound=new Sound();
	public synchronized void start (){
		running = true;
		thread = new Thread(this, "Display");
		
		Sound.thread = new Thread(sound, "Sound");

		thread.start();
		Sound.thread.start();

		
	}
	
	public synchronized void stop(){
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static 	Key key = new Key();
	public void run(){
		for (int i = 0; i < k.length;i++){
			k[i]= new Kid();
		}
		long lastTime = System.nanoTime();
		long timer =  System.currentTimeMillis();
		final double ns = 1000000000.0 / 60.0;
		double delta = 0;
		int frames = 0;
		int ticks = 0;
		requestFocus();	
		
		addKeyListener(key);
					
		Screen.Screen();

		
		Carrot.create();
		kp();
		while (running){
			
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			while (delta >= 1){
				tick();
				t+=1;
				ticks ++;
				delta --;
			}
			render();
			frames++;
			
			if (System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				ups = ticks;
				fps = frames;
				ticks = 0;
			

				
				System.out.println("Fps: "+fps);
				if(ups<60){System.out.println("UPS LOW ("+ups+" of 60)");}
				if(ups>60){System.out.println("UPS HIGH ("+ups+" of 60)");}
				frames = 0;

			}

		}
		stop();
	}
	public static void kp(){
		if(kam<k.length-1){
			kam++;
			k[kam].create();
			}
	}
	public void tick(){
		
		Player.tick();
		key.tick();
		Car.tick();
		for(int i=0;i<kam;i++){
			k[i].tick();
		}
		Particel.tick();
		if(R.nextInt(5)==1){
			Particel.Create(t/35, h-6, 100+R.nextInt(2), 30,-R.nextDouble() , -R.nextDouble());
		}
		if(t/35>=360){
				Sound.sss="done";
		Sound.play=true;
		}
		if(t/35>=420){
			Num.render(w/2-32, h/2-8, Player.score);
			Screen.renderTile(w/2-16, h/2-48, Sprite.TimeUp, 6000);
			try {
				end();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	
	public  void end() throws InterruptedException{
		
	
		
		Num.render(w/2-32, h/2-8, Player.score);
		Screen.renderTile(w/2-16, h/2-48, Sprite.TimeUp, 6000);

		running = false;
		}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}	

		
		Screen.clear(0xffffffff);
		Map.snow();
		if(t/35>=420){
			Num.render(w/2-32, h/2-8, Player.score);		
			Screen.renderTile(w/2-16, h/2-48, Sprite.TimeUp, 6000);

		}
		Car.render();
		for(int i=0;i<kam;i++){
			k[i].render();
		}
		Carrot.render();
		Particel.render();
		Screen.renderTile(t/35, h-19, Sprite.t, 5000);
		for (int i = 0;i < w/16; i++){
		Screen.renderTile(i*16, h-16, Sprite.t2, 5000);
		}
			Player.render();
		for (int i = 0;i < pixels.length; i++){
			pixels[i] = Screen.pixels[i];
			Screen.layer[i]=0;
		}
		
		Graphics g = bs.getDrawGraphics();
		//DrawGraphics
		//System.out.println(new File(".").getAbsolutePath());
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(),null);
		
		//GraphicsDispose
		g.dispose();
		bs.show();
	}
	
	
	
	
	
	public static void main(String[] args){
		Main m = new Main();
		m.frame.setResizable(false);
		m.frame.setTitle("LD31");
		m.frame.add(m);
		m.frame.pack();
		m.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.frame.setLocationRelativeTo(null);
		m.frame.setVisible(true);
		m.start();
	}






	
}