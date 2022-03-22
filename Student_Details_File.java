import java.io.*;
import java.util.*;

class Students
{
    private String name;
    private int age;
    private char gender;
    Students(String name,int age,char gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void filewrite(File f)
    {
        try
        {
    	    FileWriter fw=new FileWriter("file2.txt");
    	    fw.write(name+'\n');
    	    fw.write(Integer.toString(age)+'\n');
    	    fw.write(gender);
    	    fw.close();
        }
        catch(IOException e)
        {
	        System.out.println("An error has occurred.");
        }
    }
    public void fileread(File f)
    {
        try
        {
            Scanner s=new Scanner(f);
            while(s.hasNextLine())
            {
                String data=s.nextLine();
                System.out.println(data);
            }
            s.close();
        }
        catch(IOException e)
        {
            System.out.println("An error has occurred.");
        }
    }
}

public class Student_Details_File
{
	public static void main(String[] args){
	    
	    String name;
	    int age;
	    char gender;
	    try 
		{
		    Scanner s=new Scanner(System.in);
		    name=s.nextLine();
		    age=Integer.parseInt(s.nextLine());
		    gender=s.next().charAt(0);
		    
	        Students p=new Students(name,age,gender);
		    File f=new File("file2.txt");
		    if (f.createNewFile()) 
		    {
                System.out.println("File created: "+ f.getName());
            }
            else 
            {
                System.out.println("File already exists");
            }
            p.filewrite(f);
            p.fileread(f);
            
    	}
    	catch(NumberFormatException n)
    	{
    	    System.out.println("Enter the correct input");
    	}
	    catch(IOException e) 
	    {
	        System.out.println("An error has occurred.");
	    }
	}
}

