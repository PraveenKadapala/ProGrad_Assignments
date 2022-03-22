import java.io.*;
import java.util.*;

class Anagram1
{
    int count=0;
    public int perform(String str1,String[] str2)
    {
        for(int i=0;i<str2.length;i++)
        {
            if(str1.length()!=str2[i].length())
                continue;
            else
            {
                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2[i].toCharArray();
                
                Arrays.sort(arr1);
                Arrays.sort(arr2);

                if(Arrays.equals(arr1,arr2))
                    count+=1;
            }
        }
        return count;
    }
    public int usinghashmap(String str1,String[] str2)
    {
        int count=0;
        for(int i=0;i<str2.length;i++)
        {
            if(str1.length()!=str2[i].length())
                continue;
            else
            {
                HashMap<Character, Integer> hm1=new HashMap<Character, Integer>();
                HashMap<Character, Integer> hm2=new HashMap<Character, Integer>();
            
                char[] ch1=str1.toCharArray();
                char[] ch2=str2[i].toCharArray();
                
                for(int j=0;j<str1.length();j++)
                {
                    if(hm1.get(ch1[j])==null)
                    {
                        hm1.put(ch1[j],1);
                    }
                    else
                    {
                        hm1.put(ch1[j],(hm1.get(ch1[j])+1));
                    }
                }
                
                for(int j=0;j<str1.length();j++)
                {
                    if(hm2.get(ch2[j])==null)
                    {
                        hm2.put(ch2[j],1);
                    }
                    else
                    {                        
                        hm2.put(ch2[j],(hm2.get(ch2[j])+1));
                    }
                }
                if(hm1.equals(hm2))
                    count+=1;
            }
        }
        return count;
    }
    

}
public class Anagram
{
	public static void main(String[] args) {
		Anagram1 ex=new Anagram1();
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String str1=s.nextLine();
		System.out.print("Enter no of Strings to be tested: ");
		int n=s.nextInt();
		System.out.print("Enter the Strings one by one: ");
		String[] str2= new String[n];
		
		for(int i=0;i<n;i++)
		{
		    str2[i]=s.next();
		}

		System.out.println("No of Anagrams = "+ex.perform(str1,str2));
		System.out.println("No of Anagrams using HashMap = "+ex.usinghashmap(str1,str2));
	}
}



