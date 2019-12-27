//a golf game where the user uses the putter (mouse) to hit the ball into the hole!

package apcs;

public class MiniGolf {

	public static void main(String[] args) {
		
		Window.size(800, 600);
		
		int x = 100;
		int y = 100;
		
		int a = 700;
		int b = 500;
		
		int hx = Window.rollDice(750);
		int hy = Window.rollDice(550);
		
		int dx = 30;
		int dy = 30;
		
		while(true) {
			Window.frame();
			
			Window.out.background("green");
			
			Window.out.color("white");
			Window.out.circle(x, y, 5);
			
			Window.out.color("light gray");
			Window.out.rectangle(a, b, 18, 18);
			
			Window.out.color("black");
			Window.out.circle(hx, hy, 10);
			
			x = x + dx;
			y = y + dy;
			
			dx = (int) (dx * 19.0/20);
			dy = (int) (dy * 19.0/20);
			
			a = Window.mouse.getX();
			b = Window.mouse.getY();
			
			if(Math.abs(x - a) < 10 && Math.abs(y - b) < 10){
				dx =  (x - a);
				dy =  (y - b);
			}
			
			if (Math.abs(x - hx) < 10 && Math.abs(y - hy) < 10){
				
				Window.out.color("aqua");
				Window.out.rectangle(400, 300, 300, 150);
				Window.out.color("black");
				Window.out.print("You Win!", 375, 300);
			}
		}

	}

}
