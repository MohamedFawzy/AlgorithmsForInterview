package Search;

public class BinarySearchTest {
	
	public static void main(String[] args){
		int[] array = {1,2,3,4,6,10,15,20};
		int k = 10;
		BinarySearch binarysearch = new BinarySearch();
		int index = binarysearch.search(array, k);
		System.out.println(index);
	}

}
