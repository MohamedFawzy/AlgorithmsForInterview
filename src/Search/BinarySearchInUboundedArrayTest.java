package Search;

public class BinarySearchInUboundedArrayTest {

	public static void main(String[] args){
		int[] array = {1,2,3,4,5,7,9,10,15,20,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
		int k = 60;
		BinarySearchInUboundedArray BinarySearchInUboundedArray = new BinarySearchInUboundedArray();
		System.out.println(BinarySearchInUboundedArray.search(array, k));
	}
}
