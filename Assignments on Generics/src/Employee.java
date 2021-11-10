import java.util.HashSet;
import java.util.Set;


import java.util.HashSet;

class Empdetail 
{
	
	int id;
	double salary;
    String empname,department;
	
    public Empdetail(int id, String empname, String department, double salary) 
	{
		this.id = id;
		this.empname = empname;
		this.department = department;
		this.salary = salary;
	}
    
	
	public void display_detail()
    {
    	
    	System.out.println("This Your ID:"+id);
    	System.out.println(empname+" Welcome!");
    	System.out.println("This Your Department:"+department);
    	System.out.println("You get this much Salary "+salary);
    }
    
    
}




public class Employee
{
	public static void main(String[] args) 
	{
		HashSet<Empdetail> set = new HashSet<>();
		
		
		Empdetail em = new Empdetail(01,"JK","IT",70000.0);
		
		set.add(em);
		for(Empdetail ed:set)
		{  
		    ed.display_detail();
		}  
	}
}
