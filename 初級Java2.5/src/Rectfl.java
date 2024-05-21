
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 20;
		int y = 0;
		setColor(0,128,0);
		int i = 0;
		for(i = 0; i <= 9; i++)
		{
			fillRect(y,y,x,x);
			y = y + x;
			x += 20;
			
		}
	}

}
