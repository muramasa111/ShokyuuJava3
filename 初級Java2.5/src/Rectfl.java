
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 30;
		setColor(0,128,0);
		int i = 0;
		for(i = 0; i <= 9; i++)
		{
			fillRect(x,x,10,100);
			x+=20;
		}
	}

}
