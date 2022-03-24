import java.util.*;

public class PerfectString
{
    static String check(String s){
        	if(!s.equals(s.toUpperCase()))
            {
            return "Not Perfect";
            }
		    if (! (s.contains("PR") || s.contains("RP") ))
		    {
		        return "Not Perfect";
		    }
		    else
		    { 
		        int i=0;
		        while (i<s.length()-1)
		        {
		            char p = s.charAt(i);
		            char r = s.charAt(i+1);
		            if ((p=='P' && r=='R') || (p=='R' && r=='P' ))
		            {
		                i+=1;
		            }
		            else
		            {
		                return "Not Perfect";
		            }
		            
		        }
		        return "Perfect";
		    }
    }
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    System.out.println(check(s));
	}
}