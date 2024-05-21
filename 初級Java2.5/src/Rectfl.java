
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 20;
		int y = 180;
		setColor(0,128,0);
		int i = 0;
		for(i = 0; i <= 9; i++)
		{
			
			fillRect(x,50,10,y - 50);
			fillRect(x,y + 40,10,200 - y);
			x += 20;
			y -= 10;
		}
	}

}
