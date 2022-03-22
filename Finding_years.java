
import java.util.HashSet;

public class Finding_years {

	public static void main(String[] args) {
		
		String str="Hello Earthlings , Today is 16-03-2022, you will be destroyed by 01-01-2025";
		String[] input=str.split(" ");
		String str1="";
		HashSet<String> hs=new HashSet<String>();
		int i;
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i+1)) && str.charAt(i+2)=='-')
			{
				str1=str1.concat(Character.toString((str.charAt(i))));
				str1=str1.concat(Character.toString((str.charAt(i+1))));
				int date=Integer.parseInt(str1);
				str1="";
				
				if(date<=31 && Character.isDigit(str.charAt(i+3)) && Character.isDigit(str.charAt(i+4)) && str.charAt(i+5)=='-')
					{
						str1=str1.concat(Character.toString((str.charAt(i+3))));
						str1=str1.concat(Character.toString((str.charAt(i+4))));
						int month=Integer.parseInt(str1);
						str1="";
						
						if(month<=12 &&Character.isDigit(str.charAt(i+6)) && Character.isDigit(str.charAt(i+7)) && Character.isDigit(str.charAt(i+8)) && Character.isDigit(str.charAt(i+9)))
						{
							str1=str1.concat(Character.toString((str.charAt(i+6))));
							str1=str1.concat(Character.toString((str.charAt(i+7))));
							str1=str1.concat(Character.toString((str.charAt(i+8))));
							str1=str1.concat(Character.toString((str.charAt(i+9))));
						}
					}
				i=i+10;
			}
			if(str1.length()!=0)
			{
				hs.add(str1);
				str1="";
			}
			if(!(i+10<str.length()))
				break;
		}
	System.out.println(hs.size());
	}
}
