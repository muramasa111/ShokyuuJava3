
public class Animation extends MyFrame {
	public void run() {
		int x = 30;
		int y = 100;

		for (int i = 1; i <= 3; i++) {
			while (x <= 170) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x += 5;
				sleep(0.1);
			}

			while (x >= 30) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x -= 5;
				sleep(0.1);
<<<<<<< HEAD

=======
>>>>>>> parent of 04da0b8 (練習問題5-ex1)
			}
		}

	}
}
