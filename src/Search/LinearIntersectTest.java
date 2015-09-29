package Search;

import java.util.List;
/**
 * 
 * @author Mohamed fawzy
 *
 */
public class LinearIntersectTest {
	
	public static void main(String[] args){
		LinearIntersect LinearIntersect = new LinearIntersect();
		int a=5,b=6,m=4,n=6;
		List<Integer> x = LinearIntersect.tryLinearIntersect(a,b,m,n);
		System.out.println(x.toString());
	}

}
