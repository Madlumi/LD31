package net.game.entity;

import net.game.Main;
import net.game.graphics.Map;
import net.game.graphics.Screen;
import net.game.graphics.Sprite;

public class Particel {
	public static int pc=200;
	public static int[] c=new int[pc],t=new int[pc];
	public static double[] x=new double[pc],y=new double[pc],xm=new double[pc],ym=new double[pc];
	
	public static void Create(int xx,int yy, int cc ,int tt, double xxm,double yym){
		
		for(int i = 0; i< pc;i++){
			if(t[i]<=0){
				x[i]=xx;
				y[i]=yy;
				c[i]=cc;
				t[i]=tt;
				ym[i]=yym;
				xm[i]=xxm;		

				return;
			}
		}
		
	}
	public static void tick(){	
		

		for(int i = 0; i< pc;i++){
			if(t[i]!=0){
				t[i]--;
				x[i]+=xm[i];
				y[i]+=ym[i];
				if(c[i]==285){
					for (int ii = 0; ii<8; ii++){
						if((int)((x[i]+4)+(y[i]+ii)*Main.w)<Map.c.length&&(int)((x[i]+ii)+(y[i]+4)*Main.w)<Map.c.length&&
						(int)((x[i]+4)+(y[i]+ii)*Main.w)>0&&(int)((x[i]+ii)+(y[i]+4)*Main.w)>0){
							if(Map.c[(int)((x[i]+4)+(y[i]+ii)*Main.w)]==165||Map.c[(int)((x[i]+ii)+(y[i]+4)*Main.w)]==165){
							c[i]=0;
							t[i]=0;
						}
					} }
				}
			}
		}
		

	}
	public static void render(){
		

		for(int i = 0; i< pc;i++){
			if(t[i]!=0){
				if(c[i]==1){Screen.renderTile((int)x[i], (int)y[i], Sprite.part1, 2000);}
				else if(c[i]==2){Screen.renderTile((int)x[i], (int)y[i], Sprite.part2, 2000);}
				else if(c[i]==3){Screen.renderTile((int)x[i], (int)y[i], Sprite.part3, 2000);}
				else if(c[i]==4){Screen.renderTile((int)x[i], (int)y[i], Sprite.part4, 2000);}
				else if(c[i]==5){Screen.renderTile((int)x[i], (int)y[i], Sprite.part5, 2000);}
				else if(c[i]==6){Screen.renderTile((int)x[i], (int)y[i], Sprite.part6, 2000);}
			
				else if(c[i]==285){Screen.renderTile((int)x[i], (int)y[i], Sprite.sBall, 285);}
				
				else if(c[i]==100){Screen.renderTile((int)x[i], (int)y[i], Sprite.partr, 2000);}
				else if(c[i]==101){Screen.renderTile((int)x[i], (int)y[i], Sprite.party, 2000);}
				else if(c[i]==102){Screen.renderTile((int)x[i], (int)y[i], Sprite.partb, 2000);}
				else if(c[i]==103){Screen.renderTile((int)x[i], (int)y[i], Sprite.partg, 2000);}
				else{Screen.renderTile((int)x[i], (int)y[i], Sprite.part0, 2000);}
			}
		}
	}
	
}
