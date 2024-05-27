
public class Animation extends MyFrame {
	public void run() {
		int x = 30;
		int y = 100;
		double sin = 0;
		
		while (true) {
			while (x <= 210) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, 100 + Math.sin(sin) * 40, 10, 100);
				x += 5;
				sin += 0.1;
				sleep(0.1);
			}
			
			while (x >= 30) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, 100 + Math.sin(sin) * 40, 10, 100);
				x -= 5;
				sin -= 0.1;
				sleep(0.1);
			}
		}
	}
}
