package Other;

public class ArithmaticExpressionTest {
	
	public static void main(String[] args){
		String[] tokens = new String[] {"2","1","+","3","*"};
		ArithmaticExpression ae = new ArithmaticExpression();
		System.out.println(ae.evalRPN(tokens));
	}
}
