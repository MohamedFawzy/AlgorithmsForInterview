package Search;
/**
 * Write a method that takes a sorted array A of integers and a key k md
retums the hdex of first occurrmce of k h A Retum -l if k does Rot
appear in A. Write tests to verify your code.
 * @author Mohamed fawzy
 * @copyright GPL
 */
public class BinarySearch {
	
	public static int search(int a[], int k){
		int low=0;
		int high= a.length-1;
		int middle;
		while(low <= high){
			middle = low + (high - low) /2;
			if(a[middle]==k){
				return middle;
			}else if(a[middle] < k){
				low = middle+1;
			}else{
				high = middle-1;
			}
		}
		return -1;
	}
}
