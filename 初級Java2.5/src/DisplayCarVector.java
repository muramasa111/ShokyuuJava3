import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		
		Vector<Car>cars = new Vector<Car>();
		cars.add(new Car(50,60,1,0));
		cars.add(new Car(50,120,2,0));
		cars.add(new Car(50,180,3,0));
		cars.add(new Car(50,240,4,0));
		cars.add(new Car(50,300,5,0));
		
		int cnt = 0;
		while(true)
		{	
			cnt++;
			clear();
			for(int j = 0; j < cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move(this);
			}
			sleep(0.1);
		}
	}

}
