
public class Genric<T> {

	public <E> void Swapping(int a[], int i,int k)
	{
		int temp;
		temp=a[i];
		a[i]=a[k];
		a[k]=temp;

	}
	public void print(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
