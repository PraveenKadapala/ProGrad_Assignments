import java.util.*;
public class Brackets_Balancing {
	static void check(String s) {
		Stack<Character> stack = new Stack();
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				str += ch;
				stack.push(ch);
			} 	
			else {
				if (!stack.isEmpty()) {
					char value = stack.pop();
					
					if (ch == ']' && value == '[') {
						str += ch;
					}
					else if (ch == '}' && value == '{') {
						str += ch;
					}
					else if (ch == ')' && value == '(') {
						str += ch;
					}
					else if (ch == ']' && value != '[') {
						stack.push(value);
						str += "[]";
					}
					else if (ch == '}' && value != '{') {
						stack.push(value);
						str += "{}";
					}
					else if (ch == ')' && value != '(') {
						stack.push(value);
						str += "()";
					}
				}
				else {
					if (ch== ']') {
						str += "[]";
					}
					else if (ch == '}') {
						str += "{}";
					}
					else if (ch == ')') {
						str += "()";
					}
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			char value = stack.pop();	
			
			if (value == '(') {
				str += ")";
			}
			else if (value == '[') {
				str += "]";
			}
			else {
				str += "}";
			}
		}
		
		System.out.println(str);
	}
			
		
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		check(s);
	}
}