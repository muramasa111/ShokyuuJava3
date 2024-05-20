
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 20;
		setColor(0,128,0);
		int i = 0;
		for(i = 0; i <= 9; i++)
		{
			fillRect(x,50,10,x + 5);
			x+=20;
		}
	}

}
