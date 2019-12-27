//a drawing of a cute giraffe!

package apcs;

public class HelloGiraffe {
	
	public static void main(String[] args){
		
		Window.out.background("light blue");
		
		Window.out.color("light green");
		Window.out.rectangle(250, 400, 500, 200);
		
		Window.out.color("yellow");
		Window.out.oval(250, 300, 200, 90);
		Window.out.rectangle(158, 200, 10, 230);
		Window.out.oval(133, 85, 65, 30);
		Window.out.rectangle(140, 80, 5, 40);
		Window.out.rectangle(155, 80, 5, 40);
		Window.out.rectangle(225, 375, 12, 150);
		Window.out.rectangle(200, 375, 12, 150);
		Window.out.rectangle(280, 375, 12, 150);
		Window.out.rectangle(305, 375, 12, 150);
		Window.out.rectangle(340, 325, 10, 75);
		
		Window.out.color("brown");
		Window.out.circle(140, 55, 5);
		Window.out.circle(155, 55, 5);
		Window.out.oval(340, 372, 14, 24);
		Window.out.oval(200, 280, 13, 8);
		Window.out.oval(300, 322, 12, 6);
		Window.out.oval(180, 315, 8, 11);
		
		Window.out.color("black");
		Window.out.circle(127, 80, 4);
		
	}

}
