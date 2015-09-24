package Search;
/**
 * Design an efficient algorithm that finds the next index of first occurrence  an element
 * larger than specified key k, return -1 if every element is less than or equal to k 
 *  
 * @copyright GPL
 * @author mohamed fawzy
 *
 */
public class NextLargeNumber {
	
	/**
	 * we use binary seach to solve this problem
	 * @param a
	 * @param k
	 * @return int
	 */
	public static int search(int a[], int k){
		int low =0;
		int high = a.length-1;
		int middle;
		while(low <= high){
			middle = low + (high-low) /2;
			if(a[middle] == k){
				low = middle+1;
			}else if(a[middle] < k){
				low = middle+1;
			}else{
				return middle;
			}
		}
		return -1;
	}

}
