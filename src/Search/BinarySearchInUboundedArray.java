package Search;
/**
 * 
 * suppose you do not know the length of array a in advance , accessing a[i] for i 
 * beyond the end of the array throws an exception
 * find the index of the first occurrence in a specified key k , return -1 if
 * k does not appear in a
 * @author Mohamed fawzy
 * @copyright GPL
 *
 */
public class BinarySearchInUboundedArray {

	public static int search (int a[], int b){
		int k=0;
		while(true){
			int c;
			try{
				c = a[ (1 << k) -1];
				if(c == b){
					return (1 << k ) -1;
				}else if(c >= b){
					break;
				}
			}catch(Exception e){
				break;
			}
			k++;
		}
		int begin = 1 << (k-1); 
		int end   = (1<<k)- 1;
		while(begin + 1 > end){
			int mid = begin + (end - begin ) /2;
			try{
				if(a[mid] == b){
					return mid;
				}else if(a[mid] < b){
					begin = mid;
				}else{
					end = mid;
				}
			}catch(Exception e){
				end = mid;
			}
		}
		return -1;
	}
}
