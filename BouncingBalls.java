//animation of balls bouncing across the screen!

package apcs;

import java.util.ArrayList;

public class BouncingBalls {

	public static void main(String[] args) {
		
		Window.size(800, 600);
		
		int i = 0;
		
		ArrayList<Balls> alist = new ArrayList<Balls>();
		
		while(i < 150){
			alist.add(new Balls());
			alist.add(new Balls());
			i++;
			
		}
		
		while (true){
			Window.frame();
			Window.out.background("white");
			
			for(Balls b : alist){
				b.draw();
				b.move();
			}
			
		}
		
	}

}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Balls {
	
	int x = Window.random(10, 790);
	int y = Window.random(10, 590);
	int dx = Window.random(-5, 5);
	int dy = Window.random(-5, 5);
	int radius = 10;
	int red = Window.random(0, 400);
	int green = Window.random(0, 400);
	int blue = Window.random(0, 400);
	
	
	public void draw() {
		
		//radius = radius + 1;
		Window.out.color(red, green, blue);
		Window.out.circle(x, y, radius);		
	}
	public void move() {
		x = x + dx;
		y = y + dy;
		
		if(x < 5 || x > 795){
			dx = -dx;
		}
		if(y < 5 || y > 595){
			dy = -dy;
		}
		
	}
	

}
