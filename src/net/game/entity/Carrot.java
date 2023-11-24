package net.game.entity;

import java.util.Random;

import net.game.Main;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;

public class Carrot {

	public static int x,y,ssp=1,x2[],y2[],ssp2;
	public static boolean gen;
	private static Random R = new Random();
	public static void create(){				

		for(int i = 0;i<26*26;i++){
			if(Sprite.map.pixels[i]==0xffffff00){
				ssp++;
			}
		}
		x2=new int[ssp];
		y2=new int[ssp];

		for(int yy = 0;yy<26;yy++){
			for(int xx = 0;xx<26;xx++){
				if(Sprite.map.pixels[(xx)+(yy)*26]==0xffffff00){
					ssp2++;	
					x2[ssp2]=xx;
					y2[ssp2]=yy;
					
								

				}
			}
		}
		gen=true;
		while(gen){
		int sp = R.nextInt(ssp);
		
		x=x2[sp]*16;
		y=y2[sp]*16;
		if(x>32){
			gen=false;
		}
		}
	}
	public static void render(){		
		Screen.renderTile(x, y, Sprite.carrot, 175);
	}
}
