package net.game.graphics;

import java.util.Random;

import net.game.Main;
import net.game.entity.Carrot;
import net.game.entity.Player;

public class Screen {

	public static int width = Main.w, height =Main.h;
	
	public static int[] pixels,layer;
	public static final int MAP_SIZE = 64,ts = Main.ts;
	public static final int MAP_SIZE_MASK  = MAP_SIZE -1;

	
	private static Random random = new Random();
		
	public static void Screen(){
		layer  = new int[width * height];

		pixels  = new int[width * height];
		
	}
	
	public static void clear(int c){
		for (int i = 0;i<pixels.length;i++){
			pixels[i]=c;
		}
	}
	public static void renderTile(int xp, int yp, Sprite sprite,int z){
		for (int y = 0; y < sprite.SIZE; y++) {
			for (int x = 0; x < sprite.SIZE; x++) {

				if(x+xp+(y+yp)*width>=0&&x+xp+(y+yp)*width<pixels.length&&x+xp<width&&x+xp>=0){
					if(sprite.pixels[x + y * sprite.SIZE]!=0xffff00ff){
						if(z>=1000&&z<2000){
							if(Map.c[x+xp+(y+yp)*width]==185){
								Player.kill(z-1000);
								
							}
							if(Map.c[x+xp+(y+yp)*width]==175){
								Player.folp();
								Carrot.create();
								
							}
							
						}
						if(layer[x+xp+(y+yp)*width]<z){	pixels[x+xp+(y+yp)*width] = sprite.pixels[x + y * sprite.SIZE];
							layer[x+xp+(y+yp)*width]=z;
							Map.c[x+xp+(y+yp)*width]=z;
						}
						
					}
				}
			}
		}
	}
	

}









