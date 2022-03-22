import java.util.Scanner;

public class Palindrome {
	static boolean check(String s) {
		for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        }
        return true;
	}
	static int appends(String s)
	{
	    if (check(s))
	        return 0;
	    s=s.substring(1);
	
	    return 1 + appends(s);
	}
	static void make(String s) {
		int r= appends(s);
		for (int i=r-1;i>=0;i--) {
			s=s+s.charAt(i);
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (check(s)) {
			System.out.println("Palindrome");
		}
		else {
			make(s);
			
		}
	}
}
