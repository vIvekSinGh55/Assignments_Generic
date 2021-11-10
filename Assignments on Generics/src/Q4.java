import java.util.Date;


public class Q4 
{
	public static void main(String[] args)
	{
		
		Pair<String, String> obj=new Pair<String, String>("1","Hello");
        System.out.println(obj.getKey()+" : "+obj.getValue());
        
        
        Date obj1=new Date();
        Pair<String, java.util.Date> object=new Pair<String,java.util.Date> ("Today is",obj1);
        System.out.println(object.getKey()+" : "+object.getValue());
	}
	
	
}