import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Vehicle implements KeyListener{
	int x,y,vx,vy;
	public Vehicle(int x,int y,int vx,int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	//キーから文字が入力されたとき
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	//キーが離されたとき
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
