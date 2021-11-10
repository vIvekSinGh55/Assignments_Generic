import java.util.HashMap;
import java.util.Random;


public class Application 
{
	public static void main(String[] args)
	{
		
		HashMap<Integer,Double> Store=new HashMap<Integer,Double>();
		Random r=new Random();
		int max=50;
		double range=7;
		double min=5;
		for (int i = 0; i < 10; i++)
		{
			
			int x=(int)(r.nextInt(max));
	        double y=range+r.nextDouble()-min;
	        Store.put(x,y);
	        System.out.println(x+" "+y);
	    }
	    
		System.out.println(" ");
	    System.out.println(Store);
	}
	
}

