
public class Rectfl extends MyFrame{
	public void run()
	{
		int x = 30;
		setColor(0,128,0);
		int i;
		for(i = 0; i <= 9; i++)
		{
			if( i == 0)
			{
				fillRect(x,100,10,100);
			}
			else if(i == 9)
			{
				fillRect(x,80,10,100);

			}
			else
			{
				fillRect(x,90,10,100);
			}
			x+=20;
		}
	}

}
