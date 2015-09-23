package Search;
/**
 * Implement a fasthteger square root functiOI1that takes
 *  in a 32-bit unsigned lteger and returns another 32-bit unsigned integer
 *  that is the floor of the square root of the input
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class SquareSearch {

	public static  int SqrtSearch(int input){
		int begin = 0;
		int end   = 65536;
		while(begin+1 < end){
			int mid = begin + (end - begin) /2;
			int midSquare = mid * mid;
			if(midSquare == input){
				return mid;
			}else if(midSquare > input){
				end=mid;
			}else{
				begin=mid;
			}
		}
		return begin;
	}
}
