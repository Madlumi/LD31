package net.game.entity;

import java.util.Random;

import net.game.Main;
import net.game.graphics.Map;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;

public class Kid {

	public  int ssp=1,x2[],y2[],ssp2,fall;
	public  double x,y,xm,ym;
	public  boolean gen;
	private  Random R = new Random();
	private  Sprite s= Sprite.kid1;
	public  boolean move,cl,cu,cr,cd,move2;

	public  void create(){				

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
	public  void tick(){
		cd=false;cl=false;cr=false;cu=false;
		s=Sprite.kid1;
		for(int i = 0; i < 12;i++){
		if(Map.c[(int)(x+1)+((int)y+3+i)*Main.w]==165){cl=true;}
		if(Map.c[(int)(x+15)+((int)y+3+i)*Main.w]==165){cr=true;}

		if(Map.c[((int)x+i+2)+((int)y+2)*Main.w]==165){cu=true;}
		if(Map.c[((int)x+i+2)+((int)y+16)*Main.w]==165){cd=true;}
		
		}
		if(x<7*16-10){create();}
		if(x<7*16-8){cl=true;}
		if(x>Main.w-20){cr=true;}	
		
		if(y<4){cu=true;}
		if(y>Main.h-20){cd=true;}	
		
		
		if(((xm>0)&&!cr)||((xm<0)&&!cl)){
			x+= xm;
		}
		if(((ym>0)&&!cd)||((ym<0)&&!cu)){
		y+= ym;
		}
		if(fall==0){
			if(Main.t%60==1){
			if(Player.y>y){
		
			ym+=.03*(R.nextInt(20)+1);
		}
		if(Player.y<y){
			ym-=.03*(R.nextInt(20)+1);
		}
		
		if(Player.x>x){
			xm+=.03*(R.nextInt(20)+1);
		}
		if(Player.x<x){
			xm-=.03*(R.nextInt(20)+1);
		}
		}if(xm*xm>1||ym*ym>1){
			fall=60;
		}
		}
		if(fall>0){
			ym/=7;xm/=7;
			ym*=6;xm*=6;
			fall--;
			s=Sprite.kidDo;
		}
		
		//Particel.Create((int)x+8, (int)y+8, 285, 150, (R.nextDouble()-.5)*5,  (R.nextDouble()-.5)*5);
	}
	public  void render(){
			Screen.renderTile((int)x, (int)y, s, 185);
	}
}
