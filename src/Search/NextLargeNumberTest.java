package Search;

public class NextLargeNumberTest {

	public static void main(String[] args){
		int[] array = {1,2,3,5,6,7,10,20,50};
		int k=20;
		NextLargeNumber nextlargenumber = new NextLargeNumber();
		int result = nextlargenumber.search(array, k);
		System.out.println(result);
	}
}
