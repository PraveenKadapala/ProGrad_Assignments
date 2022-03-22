import java.util.*;
import java.io.*;

class Permutations
{
    public int no_of_permutations(String str)
    {
        int numerator=factorial(str.length());
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>(str.length());
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(hm.get(ch[i])==null)
            {
                hm.put(ch[i],1);
            }
            else
            {
                hm.put(ch[i],hm.get(ch[i])+1);
            }
        }
        int denominator=1;
        for (Integer value : hm.values())
        {
            denominator=denominator*factorial(value);
        }
        int result=numerator/denominator;
        return result;
    }
    
    public int factorial(int x)
    {
        int n=1;
        for(int i=1;i<=x;i++)
        {
            n=n*i;
        }
        return n;
    }
}

public class Permutations_Main
{
	public static void main(String[] args) {
	    Permutations p=new Permutations();
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(p.no_of_permutations(str));
	}	
}

