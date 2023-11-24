package net.game.graphics;

import net.game.Main;

public class Map {

	public static int h=Main.h,w=Main.w,ts=Main.ts,c[]=new int[Screen.pixels.length];
	public static void snow(){
		//                     00007f
		for (int y=0;y<25;y++){
			for (int x=0;x<26;x++){
				Screen.renderTile(x*ts, y*ts, Sprite.snow, 10);

				if(Sprite.map.pixels[x+y*26]==0xffffffff){
									Screen.renderTile(x*ts, y*ts, Sprite.snow, 100);

				}else 	if(Sprite.map.pixels[x+y*26]==0xff00ff00){
					Screen.renderTile(x*ts, y*ts, Sprite.stree, 165);
				}else 	if(Sprite.map.pixels[x+y*26]==0xff000000){
					if(x>0){
						if(Sprite.map.pixels[(x-1)+y*26]!=0xff000000&&Sprite.map.pixels[(x-1)+y*26]!=0xff333333){
					
						Screen.renderTile(x*ts, y*ts, Sprite.snowRoad, 100);
					}else if(Sprite.map.pixels[(x+1)+y*26]!=0xff000000&&Sprite.map.pixels[(x+1)+y*26]!=0xff333333){
						Screen.renderTile(x*ts, y*ts, Sprite.roadSnow, 100);
					}else{
					Screen.renderTile(x*ts, y*ts, Sprite.road, 100);
					}
						}else{
							Screen.renderTile(x*ts, y*ts, Sprite.road, 100);

						}
				}else 	if(Sprite.map.pixels[x+y*26]==0xff333333){
					Screen.renderTile(x*ts, y*ts, Sprite.roadM, 100);

					
				}else 	if(Sprite.map.pixels[x+y*26]==0xffff0000){
					Screen.renderTile(x*ts, y*ts, Sprite.car, 165);
					Screen.renderTile(x*ts+32, y*ts, Sprite.car2, 165);

				
				}else 	if(Sprite.map.pixels[x+y*26]==0xff007f00){
					Screen.renderTile(x*ts, y*ts, Sprite.tree, 165);
				
				}else 	if(Sprite.map.pixels[x+y*26]==0xff00007f){
				
				
				if(Sprite.map.pixels[(x-1)+y*26]!=0xff00007f&&Sprite.map.pixels[(x-1)+y*26]!=0xff0000ff){
					Screen.renderTile(x*ts, y*ts, Sprite.walll, 165);
				}else if(Sprite.map.pixels[(x+1)+y*26]!=0xff00007f&&Sprite.map.pixels[(x+1)+y*26]!=0xff0000ff){
					Screen.renderTile(x*ts, y*ts, Sprite.wallr, 165);
				}else{		
					Screen.renderTile(x*ts, y*ts, Sprite.wall, 165);

				}
				}else 	if(Sprite.map.pixels[x+y*26]==0xff0000ff){
					Screen.renderTile(x*ts, y*ts, Sprite.gate, 165);
				
				}else if(Sprite.map.pixels[x+y*26]==0xffff00ff){
					Screen.renderTile(x*ts, y*ts, Sprite.colz, 125);
				}
			}
			
		}
	}
}
