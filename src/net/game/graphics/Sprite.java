package net.game.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	
	
	
	
	
	
	
	
	
	public static Sprite n1 = new Sprite(16, 0, 0, SpriteSheet.num);	
	public static Sprite n2 = new Sprite(16, 1, 0, SpriteSheet.num);	
	public static Sprite n3 = new Sprite(16, 2, 0, SpriteSheet.num);	
	public static Sprite n4 = new Sprite(16, 3, 0, SpriteSheet.num);	
	
	public static Sprite n5 = new Sprite(16, 0, 1, SpriteSheet.num);	
	public static Sprite n6 = new Sprite(16, 1, 1, SpriteSheet.num);	
	public static Sprite n7 = new Sprite(16, 2, 1, SpriteSheet.num);	
	public static Sprite n8 = new Sprite(16, 3, 1, SpriteSheet.num);	

	public static Sprite n9 = new Sprite(16, 0, 2, SpriteSheet.num);	
	public static Sprite n0 = new Sprite(16, 1, 2, SpriteSheet.num);	
	public static Sprite nmin = new Sprite(16, 2, 2, SpriteSheet.num);	
	
	
	public static Sprite t = new Sprite(16, 1, 3, SpriteSheet.tiles);	
	public static Sprite t2 = new Sprite(16, 1, 4, SpriteSheet.tiles);	

	
	public static Sprite kid1 = new Sprite(16, 0, 2, SpriteSheet.tiles);	
	public static Sprite kid2 = new Sprite(16, 0, 3, SpriteSheet.tiles);	

	public static Sprite kidAl = new Sprite(16, 0, 4, SpriteSheet.tiles);	

	public static Sprite kidFa1 = new Sprite(16, 0, 5, SpriteSheet.tiles);	
	public static Sprite kidFa2 = new Sprite(16, 0, 6, SpriteSheet.tiles);	
	public static Sprite kidDo = new Sprite(16, 0, 7, SpriteSheet.tiles);	

	public static Sprite part1 = new Sprite(4, 0, 0, SpriteSheet.tiles);	
	public static Sprite part2 = new Sprite(4, 0, 1, SpriteSheet.tiles);	
	public static Sprite part3 = new Sprite(4, 1, 0, SpriteSheet.tiles);	
	public static Sprite part4 = new Sprite(4, 1, 1, SpriteSheet.tiles);	
	public static Sprite part5 = new Sprite(4, 2, 0, SpriteSheet.tiles);	
	public static Sprite part6 = new Sprite(4, 2, 1, SpriteSheet.tiles);	
	
	public static Sprite partb = new Sprite(4, 0, 2, SpriteSheet.tiles);	
	public static Sprite partg = new Sprite(4, 0, 3, SpriteSheet.tiles);	
	
	public static Sprite partr = new Sprite(4, 1, 2, SpriteSheet.tiles);	
	public static Sprite party = new Sprite(4, 1, 3, SpriteSheet.tiles);	
	
	public static Sprite sBall = new Sprite(8, 0, 2, SpriteSheet.tiles);	

	public static Sprite part0 = new Sprite(4, 3, 0, SpriteSheet.tiles);	

	
	
	
	public static Sprite map = new Sprite(26, 0, 0, SpriteSheet.map);		

	public static Sprite test = new Sprite(16, 0, 0, SpriteSheet.tiles);	
	
	public static Sprite snow = new Sprite(16, 1, 0, SpriteSheet.tiles);		
	public static Sprite snowRoad = new Sprite(16, 2, 0, SpriteSheet.tiles);	
	public static Sprite road = new Sprite(16, 3, 0, SpriteSheet.tiles);	
	public static Sprite roadSnow = new Sprite(16, 4, 0, SpriteSheet.tiles);	
	public static Sprite roadM = new Sprite(16, 5, 0, SpriteSheet.tiles);	
	public static Sprite colz = new Sprite(16, 1, 2, SpriteSheet.tiles);		

	public static Sprite stree = new Sprite(16, 1, 1, SpriteSheet.tiles);		
	public static Sprite carrot = new Sprite(16, 2, 1, SpriteSheet.tiles);		
	public static Sprite wall = new Sprite(16, 3, 1, SpriteSheet.tiles);		
	public static Sprite walll = new Sprite(16, 4, 1, SpriteSheet.tiles);		
	public static Sprite wallr = new Sprite(16, 5, 1, SpriteSheet.tiles);		
	public static Sprite gate = new Sprite(16, 2, 2, SpriteSheet.tiles);		

	public static Sprite small = new Sprite(16, 6, 0, SpriteSheet.tiles);	
	public static Sprite big = new Sprite(16, 7, 0, SpriteSheet.tiles);	

	public static Sprite smallAlert = new Sprite(16, 6, 1, SpriteSheet.tiles);	
	public static Sprite smallM1 = new Sprite(16, 6, 2, SpriteSheet.tiles);	
	public static Sprite smallM2 = new Sprite(16, 6, 3, SpriteSheet.tiles);	
	public static Sprite smallM3 = new Sprite(16, 6, 4, SpriteSheet.tiles);	
	public static Sprite smallM4 = new Sprite(16, 6, 5, SpriteSheet.tiles);	
	public static Sprite smallM5 = new Sprite(16, 6, 6, SpriteSheet.tiles);	
	public static Sprite smallM6 = new Sprite(16, 6, 7, SpriteSheet.tiles);	
	public static Sprite smallM7 = new Sprite(16, 6, 8, SpriteSheet.tiles);	

	public static Sprite down1 = new Sprite(16, 1, 1, SpriteSheet.tiles);		

	
	public static Sprite tree = new Sprite(32, 4, 1, SpriteSheet.tiles);		

	
	public static Sprite car = new Sprite(32, 4, 0, SpriteSheet.tiles);		
	public static Sprite car2 = new Sprite(32, 5, 0, SpriteSheet.tiles);		

	public static Sprite TimeUp = new Sprite(32, 1, 2, SpriteSheet.tiles);		

	public static Sprite carM = new Sprite(32, 2, 1, SpriteSheet.tiles);		
	public static Sprite carM2 = new Sprite(32, 2, 2, SpriteSheet.tiles);		


	public static Sprite carMu = new Sprite(32, 2, 3, SpriteSheet.tiles);		
	public static Sprite carMu2 = new Sprite(32, 2, 4, SpriteSheet.tiles);		
	
	
	
	
	public Sprite (int size, int x, int y, SpriteSheet sheet){
	    SIZE = size;
	    pixels = new int[SIZE * SIZE];
	    this.x = x * size;
	    this.y = y * size;
	    this.sheet = sheet;
	    load();
	}
	
	public Sprite (int size, int colour){
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColour(colour);
	}
	
	private void setColour(int colour) {
		for (int i = 0; i < SIZE * SIZE; i++){
			pixels[i] = colour;
		}
		
	}

	private void load(){
		for (int y = 0;y < SIZE; y++ ) {
			for (int x = 0;x < SIZE; x++ ) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}

}
