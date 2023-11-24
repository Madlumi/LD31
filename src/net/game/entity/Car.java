package net.game.entity;

import java.util.Random;

import net.game.Main;
import net.game.graphics.Map;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;

public class Car {
	
	public static int x=40,x2=70;
	public static double y2=0,y=-32;
	public static Random R = new Random();

	public static void tick(){
		Particel.Create(x+10, (int)y-2, R.nextInt(6)+1, R.nextInt(30)+10, R.nextDouble()-.5,- R.nextDouble());
		Particel.Create(x2+20, (int)y2+64, R.nextInt(6)+1, R.nextInt(30)+10, R.nextDouble()-.5, R.nextDouble());

		y+=.65;
		y2-=.5;
		if(y>Main.h)y=-64;
		if(y2<-64)y2=Main.h;
		
		
		
	
	}
	public static void render(){
		Screen.renderTile(x2, (int)y2, Sprite.carMu, 185);
		Screen.renderTile(x2, (int)y2+32, Sprite.carMu2, 185);

		Screen.renderTile(x, (int)y, Sprite.carM, 185);
		Screen.renderTile(x, (int)y+32, Sprite.carM2, 185);

	}
}
