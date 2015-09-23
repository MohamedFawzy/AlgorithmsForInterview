package Other;
import java.util.Stack;

/**
 * 
 * @author Mohamed Fawzy
 * @copyright GPL
 */
public class ArithmaticExpression {
	
	public static int evalRPN(String[] tokens){
		int returnValue=0;
		String operations = "+-*/"; // All Arithmatic operations
		// we push Expression and values into statck then return them back based on priroity for it 
		Stack<String> stack = new Stack<String>();
		for(String t: tokens){
			if(!operations.contains(t)){
				stack.push(t);
			}else{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch(t){
					case "+":
							stack.push(String.valueOf(a+b));
						break;
					case "-":
							stack.push(String.valueOf(a-b));
						break;
					case "*":
							stack.push(String.valueOf(a*b));
						break;
					case "/":
							stack.push(String.valueOf(a/b));
						break;
					
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}
}
