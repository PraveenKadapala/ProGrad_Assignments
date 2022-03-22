import java.util.*;
import java.io.*;

class InvalidOperand  extends Exception  
{  
    public InvalidOperand(String str)  
    {  
        super(str);  
    }  
}  

class InvalidOperator  extends Exception  
{  
    public InvalidOperator(String str)  
    {  
        super(str);  
    }  
}  

class DenominatorException extends Exception
{
    public DenominatorException(String str)
    {
        super(str);
    }
}
    
 
class Exception1  
{  
  
    public float check(String[] input) throws InvalidOperand,DenominatorException,InvalidOperator
    {    

        boolean isNumeric=true;
        for (int i = 0; i < input[0].length(); i++)
        {
            if (!Character.isDigit(input[0].charAt(i)))
            {
                isNumeric = false;
                break;
            }
        }
        if(isNumeric)
        {  
            if(input[1].equals("+")||input[1].equals("-")||input[1].equals("*")||input[1].equals("/")||input[1].equals("%"))
            {
                isNumeric=true;
                for (int i = 0; i < input[2].length(); i++)
                {
                    if (!Character.isDigit(input[2].charAt(i)))
                    {
                        isNumeric = false;
                        break;
                    }
                }
                if(isNumeric)
                {
                    int input0=Integer.parseInt(input[0]);
                    int input2=Integer.parseInt(input[2]);
                    if(input[1].equals("+"))
                    {
                        return input0+input2;
                    }
                    else if(input[1].equals("-"))
                    {
                        return input0-input2;
                    }
                    else if(input[1].equals("*"))
                    {
                        return input0*input2;
                    }
                    else if(input[1].equals("/"))
                    {
                        if(input2==0)
                        {
                            throw new DenominatorException("Denominator can't be zero");
                        }
                        else
                        {
                            return (float)input0/input2;
                        }
                    }
                    else if(input[1].equals("%"))
                    {
                        return input0%input2;
                    }
                }
            else
                {
                    throw new InvalidOperand("Enter valid Operand"); 
                }
            }
            else
            {
                throw new InvalidOperator("Enter a valid Operator");     
            }
        }
        else
        {   
            throw new InvalidOperand("Enter valid Operand");  
        }
        return 0;
    }
}


public class Exception_Handling
{
    public static void main(String args[])  
    {  
        Exception1 e=new Exception1();
        Scanner s=new Scanner(System.in);
        try  
        {  
            String input1=s.nextLine();
            String[] input=input1.split(" ");
            System.out.println(e.check(input));  
        }
        catch(InvalidOperand i)
        {
            System.out.println(i);
        }        
        catch (InvalidOperator i)  
        {  
            System.out.println(i);  
        }  
        catch(DenominatorException d)
        {
            System.out.println(d);
        }
   
    }  
}  







