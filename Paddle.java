//paddle game where user has to keep ball from hitting the ground!

package apcs;

public class Paddle {
	public static void main(String[] args){
		Window.size(1000, 600);
		
		int x;
		int y;
		
		int a;
		int b;
		
		int s = 10;
		
		int counter;
		
		boolean lose = false;

		
		x = 500;
		y = 550;
		
		a = 100;
		b = 100;
		//speed = 1;
		
		counter = 0;
		while(!lose) {
			
			Window.frame();
		
			Window.out.background("white");
			
			Window.out.color("turquoise");
			Window.out.rectangle(x, y, 75, 20);
			
			Window.out.color("magenta");
			Window.out.circle(a, b, 20);

			Window.out.color("turquoise");
			Window.out.print("Your score:", 800, 65);
			Window.out.print(counter, 900, 65);
			
			x = Window.mouse.getX();
			
			b = b + s;
			
			if ((a > x - 37) && (a < x + 37) && (b == 520)){
				s = -s;
				counter = counter + 1;
			}
			
			if(b < 30){
				s = -s;
			}
			
			if(b > 650){
				lose = true;

				Window.out.print("You Lose, Try Again Next Time", 400, 300);
			}
		}
		
	}

}
