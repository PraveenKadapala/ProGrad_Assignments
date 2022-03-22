import java.util.*;

class Swap
{
	public void perform(ArrayList<Integer> arr)
	{
	    int size=arr.size();
		if(size%2==0)
		{
		    for (int i = 0; i < arr.size(); i++)
		    {
				int temp=arr.get(i);
				arr.set(i, arr.get(i+1));
				arr.set(i+1, temp);
				i+=1;
				System.out.println(i);
			}
		}
		else
		{
		    for (int i = 0; i < arr.size()-1; i++)
		    {
            	System.out.println(i);
				int temp=arr.get(i);
				arr.set(i, arr.get(i+1));
				arr.set(i+1, temp);
				i+=1;
				System.out.println(i);
			}
		}
		System.out.println(arr);
	}
}


public class Swapping {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		
		int n=Integer.parseInt(s.nextLine());
		
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			arr.add(Integer.parseInt(s.nextLine()));
		}

		Swap sw=new Swap();
		sw.perform(arr);
	}

}


