package net.game.entity;

import java.util.Random;

import net.game.Main;
import net.game.Sound;
import net.game.graphics.Map;
import net.game.graphics.Num;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;

public class Player {
	public static int x=16,y=96,fol=0,mfol=200,disx,disy,fre=10,t,score,score2,ts,sc,scx,scy;
	public static int[] x2= new int[mfol],y2= new int[mfol],
			xb= new int[mfol*30],yb= new int[mfol*30],state= new int[mfol];
	public static Random R = new Random();
	public static boolean move,cl,cu,cr,cd,move2;
	public static void render(){
		Num.render(0, 0,score);
		//Num.render(0, 16,fol-2);
		if(ts>0){
			Num.render(scx, scy,sc);
		}
		Screen.renderTile(x, y, Sprite.big, 1000);
		
		for(int i = 2;i < fol;i++){
			Screen.renderTile(x2[i], y2[i]+Main.t/10%2, Sprite.small, 1000+i);

		}
	}
	public static void tick() {
		cu=false;cd=false;cr=false;cl=false;
		for(int i = 0; i < 12;i++){
			
		if(Map.c[(x+1)+(y+3+i)*Main.w]==165){cl=true;}
		if(Map.c[(x+15)+(y+3+i)*Main.w]==165){cr=true;}

		if(Map.c[(x+i+2)+(y+2)*Main.w]==165){cu=true;}
		if(Map.c[(x+i+2)+(y+16)*Main.w]==165){cd=true;}

			
		
		}
		
		if(x<4){cl=true;}
		if(x>Main.w-20){cr=true;}	
		
		if(y<4){cu=true;}
		if(y>Main.h-20){cd=true;}
		move = false;
		
		if(x<48){move=true;}

		if(x2[fol]<48&&x<48&&fol>2){
			for(int i = 2;i<fol;i++){
				score2+=i-1;
			}fol=2;
			sc=score2;
			score+=score2;
			score2=0;
			ts=40;
			scy = y-4;
			scx= x+8;
			Main.kp();
			Sound.sss="get";
			Sound.play=true;
			for(int i = 0;i<100;i++){
				Particel.Create(0, R.nextInt(Main.h), R.nextInt(4)+100, R.nextInt(90), R.nextDouble(), R.nextDouble()-.5);
			}
		}
		if(ts>0){
			ts--;
			scy--;
		}
		if(Main.key.left&&x>0&&!cl){
			x--;
			move=true;
		}
		if(Main.key.right&&x<Main.w-1&&!cr){
			move=true;
			x++;
		}
		
		if(Main.key.down&&y<Main.h-1&&!cd){
			y++;
			move=true;
		}
		if(Main.key.up&&y>0&&!cu){
			y--;
			move=true;
		}
		if (Main.key.shift){
			
			if(Main.key.left&&x>0&&!cl){
				x--;
				move=true;
			}
			if(Main.key.right&&x<Main.w-1&&!cr){
				move=true;
				x++;
			}
			
			if(Main.key.down&&y<Main.h-1&&!cd){
				y++;
				move=true;
			}
			if(Main.key.up&&y>0&&!cu){
				y--;
				move=true;
			}
			cu=false;cd=false;cr=false;cl=false;
			for(int i = 0; i < 12;i++){
				
			if(Map.c[(x+1)+(y+3+i)*Main.w]==165){cl=true;}
			if(Map.c[(x+15)+(y+3+i)*Main.w]==165){cr=true;}

			if(Map.c[(x+i+2)+(y+2)*Main.w]==165){cu=true;}
			if(Map.c[(x+i+2)+(y+16)*Main.w]==165){cd=true;}

				
			
			}
			
			if(x<4){cl=true;}
			if(x>Main.w-20){cr=true;}	
			
			if(y<4){cu=true;}
			if(y>Main.h-20){cd=true;}
		}
		disx=x-x2[0];
		disy=y-y2[0];
		
		if(move){
		for(int i=xb.length-1;i>0;i--){
				yb[i]=yb[i-1];
				xb[i]=xb[i-1];
			}
			yb[0]=y;
			xb[0]=x;
		
			
		}
		for(int i=0;i<x2.length;i++){
			x2[i]=xb[i*fre];
			y2[i]=yb[i*fre];
		}
		
		
	
		if(t>0)t--;
		if(fol<2)fol=2;
		
	}
	public static void folp(){
		if(t<=0){
			fol++;
			t=20;
			score++;
			for(int i = 0; i < 10;i++){

			Particel.Create(x+8, y+8, 100+R.nextInt(4), R.nextInt(30),( R.nextDouble()-.5)*2, (R.nextDouble()-.5)*2);
			Sound.sss="carrot";
			Sound.play=true;
			}
		}
		
	}
	public static void kill(int n) {
		fol-=(fol-n);
		Sound.sss="hit";
		Sound.play=true;
		for(int i = 0; i < 20;i++){
			Particel.Create(x+8, y+8, 100, R.nextInt(30),( R.nextDouble()-.5)*2, (R.nextDouble()-.5)*2);
		}
	}

}
