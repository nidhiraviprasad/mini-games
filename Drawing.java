//a program where you can draw with your mouse!

package apcs;

public class Drawing {

	public static void main(String[] args) {
		
		Window.size(1200, 800);
		Window.out.background("white");
		
		while(true){
			Window.out.color("turquoise");
			Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 25);
			Window.sleep(8);
		}
	}

}
