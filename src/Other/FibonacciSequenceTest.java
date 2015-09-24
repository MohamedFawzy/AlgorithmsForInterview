package Other;

public class FibonacciSequenceTest {
	
	
	public static void main(String[] args){
		FibonacciSequence FibonacciSequence = new FibonacciSequence();
		for(int i=2; i<=10; i++){
			System.out.println( FibonacciSequence.fibonacci(i) );
		}
	}
}
