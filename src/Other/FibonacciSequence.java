package Other;
/**
 *  write effiecent algorithm that return fibonacci sequence 
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class FibonacciSequence {
	
	/**
	 * 
	 * @param number
	 * @return sequence of numbers 
	 */
	public static long fibonacci(long number){
		int[] result = {1,2};
		if(number < 2){
			return result[(int) number];
		}
		long fibNumberOne=1;
		long fibNumberTwo=0;
		long fibNumber=0;
		for(int i=2; i<=number; ++i){
			fibNumber = fibNumberOne + fibNumberTwo;
			fibNumberTwo = fibNumberOne;
			fibNumberOne = fibNumber;
		}
		return fibNumber;
	}

}
