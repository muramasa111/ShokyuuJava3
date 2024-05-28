
public class Car {
	int x,y,vx,vy;
	public Car(int x, int y,int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x,y + 10,40,10);
		frame.fillRect(x + 10,y,20,10);
		
		frame.fillOval(x + 4,y + 20,10,10);
		frame.fillOval(x + 24,y + 20,10,10);
	}
	public void move(MyFrame frame) {
		x += vx;
		y += vy;
	}
}
