
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 20;
		int color = 0;
		int i = 0;
		for(i = 0; i <= 9; i++)
		{
			setColor(color,color,color);
			fillRect(x,50,10,100);
			x+=20;
			color += 14;
		}
	}

}
