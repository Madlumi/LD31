package net.game.graphics;

public class Num {

	public static void render(int x,int y,int n){
		
		
		if(n>9999){	
			if(n>90000){Screen.renderTile(x, y, Sprite.n9, 5000);n-=90000;}
			else if(n>80000){Screen.renderTile(x, y, Sprite.n8, 5000);n-=80000;}
			else if(n>70000){Screen.renderTile(x, y, Sprite.n7, 5000);n-=70000;}
			else if(n>60000){Screen.renderTile(x, y, Sprite.n6, 5000);n-=60000;}
			else if(n>50000){Screen.renderTile(x, y, Sprite.n5, 5000);n-=50000;}
			else if(n>40000){Screen.renderTile(x, y, Sprite.n4, 5000);n-=40000;}
			else if(n>30000){Screen.renderTile(x, y, Sprite.n3, 5000);n-=30000;}
			else if(n>20000){Screen.renderTile(x, y, Sprite.n2, 5000);n-=20000;}
			else if(n>10000){Screen.renderTile(x, y, Sprite.n1, 5000);n-=10000;}
			x+=16;
			if(n<1000){
				Screen.renderTile(x, y, Sprite.n0, 5000);
				x+=16;
				if(n<100){
					Screen.renderTile(x, y, Sprite.n0, 5000);
					x+=16;
					if(n<10){
						Screen.renderTile(x, y, Sprite.n0, 5000);
						x+=16;
					}
				}
			}
		}
		
		if(n>999){
			
			if(n>9000){Screen.renderTile(x, y, Sprite.n9, 5000);n-=9000;}
			else if(n>8000){Screen.renderTile(x, y, Sprite.n8, 5000);n-=8000;}
			else if(n>7000){Screen.renderTile(x, y, Sprite.n7, 5000);n-=7000;}
			else if(n>6000){Screen.renderTile(x, y, Sprite.n6, 5000);n-=6000;}
			else if(n>5000){Screen.renderTile(x, y, Sprite.n5, 5000);n-=5000;}
			else if(n>4000){Screen.renderTile(x, y, Sprite.n4, 5000);n-=4000;}
			else if(n>3000){Screen.renderTile(x, y, Sprite.n3, 5000);n-=3000;}
			else if(n>2000){Screen.renderTile(x, y, Sprite.n2, 5000);n-=2000;}
			else if(n>1000){Screen.renderTile(x, y, Sprite.n1, 5000);n-=1000;}
			x+=16;
			if(n<100){
				Screen.renderTile(x, y, Sprite.n0, 5000);
				x+=16;
				if(n<10){
					Screen.renderTile(x, y, Sprite.n0, 5000);
					x+=16;
				}
			}
		}
		
		
		if(n>99){
			
			if(n>900){Screen.renderTile(x, y, Sprite.n9, 5000);n-=900;}
			else if(n>800){Screen.renderTile(x, y, Sprite.n8, 5000);n-=800;}
			else if(n>700){Screen.renderTile(x, y, Sprite.n7, 5000);n-=700;}
			else if(n>600){Screen.renderTile(x, y, Sprite.n6, 5000);n-=600;}
			else if(n>500){Screen.renderTile(x, y, Sprite.n5, 5000);n-=500;}
			else if(n>400){Screen.renderTile(x, y, Sprite.n4, 5000);n-=400;}
			else if(n>300){Screen.renderTile(x, y, Sprite.n3, 5000);n-=300;}
			else if(n>200){Screen.renderTile(x, y, Sprite.n2, 5000);n-=200;}
			else if(n>100){Screen.renderTile(x, y, Sprite.n1, 5000);n-=100;}
			x+=16;
			if(n<10){
				Screen.renderTile(x, y, Sprite.n0, 5000);
				x+=16;
			}
		}

		if(n>9){
			
			if(n>=90){Screen.renderTile(x, y, Sprite.n9, 5000);n-=90;}
			else if(n>=80){Screen.renderTile(x, y, Sprite.n8, 5000);n-=80;}
			else if(n>=70){Screen.renderTile(x, y, Sprite.n7, 5000);n-=70;}
			else if(n>=60){Screen.renderTile(x, y, Sprite.n6, 5000);n-=60;}
			else if(n>=50){Screen.renderTile(x, y, Sprite.n5, 5000);n-=50;}
			else if(n>=40){Screen.renderTile(x, y, Sprite.n4, 5000);n-=40;}
			else if(n>=30){Screen.renderTile(x, y, Sprite.n3, 5000);n-=30;}
			else if(n>=20){Screen.renderTile(x, y, Sprite.n2, 5000);n-=20;}
			else if(n>=10){Screen.renderTile(x, y, Sprite.n1, 5000);n-=10;}
			x+=16;
		}
		
		
		
		if(n==9){Screen.renderTile(x, y, Sprite.n9, 5000);}
		else if(n==8){Screen.renderTile(x, y, Sprite.n8, 5000);}
		else if(n==7){Screen.renderTile(x, y, Sprite.n7, 5000);}
		else if(n==6){Screen.renderTile(x, y, Sprite.n6, 5000);}
		else if(n==5){Screen.renderTile(x, y, Sprite.n5, 5000);}

		else if(n==4){Screen.renderTile(x, y, Sprite.n4, 5000);}
		else if(n==3){Screen.renderTile(x, y, Sprite.n3, 5000);}
		else if(n==2){Screen.renderTile(x, y, Sprite.n2, 5000);}
		else if(n==1){Screen.renderTile(x, y, Sprite.n1, 5000);}
		else if(n==0){Screen.renderTile(x, y, Sprite.n0, 5000);}
	}
}
