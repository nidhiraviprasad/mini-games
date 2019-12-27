//a game where the user uses the up, left, and right arrow to safely land the spacecraft!

package apcs;

public class LunarLander {

	public static void main(String[] args) {
		
		int x = 250;
		int y = 250;
		int dx = 0;
		int dy = 0;
		boolean lose = false;
		boolean check = false;
		
		while(true){
			
			Window.frame();
			Window.out.background("black");
		
			Window.out.color("gray");
			Window.out.oval(x, y, 100, 25);
			Window.out.oval(x, y - 13, 50, 20);
			Window.out.rectangle(x, y - 30, 5, 15);
			Window.out.rectangle(x - 10, y + 15, 3, 10);
			Window.out.rectangle(x + 10, y + 15, 3, 10);
			Window.out.color("aqua");
			Window.out.circle(x, y - 40, 5);
			
			Window.out.rectangle(250, 495, 150, 10);
			
			x = x + dx;
			y = y + dy;
			dy = dy + 1;
			
			if (Window.key.pressed("up")){
				dy = dy - 2;
			}
		
			if (Window.key.pressed("left")){
				x = x - 5;
			}
		
			if (Window.key.pressed("right")){
				x = x + 5;			
			}
			
			if (y > 472){
				y = 472;
				
				if(dy > 10 && !check){
					lose = true;
				}
				else {
					lose = false;
				}
				
				if (lose) {
					Window.out.color("red");
					Window.out.print("Sorry, you lose!", 190, 250);
				}
				
				else {
					Window.out.color("aqua");
					Window.out.print("Yay, you win!", 190, 250);
					check = true;
				}
			}
		}
	}
}
	
	
