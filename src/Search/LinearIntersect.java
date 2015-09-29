package Search;

import java.util.*;
/**
 * 
 * @author Mohamed Fawzy
 * @copyright GPL
 * Given a sorted array a,b of length m,n find intersections between two arrays
 *
 */
public class LinearIntersect {


	public static List<Integer> tryLinearIntersect(int a, int b, int m , int n){
		// init array 1 with length n
		int[] array = new int[n];
		Random rand = new Random();
		for(int i=0; i < array.length; i++){
			array[i] = rand.nextInt(a) + b;
		}
		Arrays.sort(array);
		// init array 2 with length m
		int[] array1 = new int[m];
		for(int x=0; x< array1.length; x++){
			array1[x] = rand.nextInt(a) + b;
		}
		Arrays.sort(array1);
		return LinearInteresect(array , array1);
	}
	
	public static List<Integer> LinearInteresect(int []array1 , int []array2){
		List<Integer> output = new ArrayList<Integer>();
		int arrayOneCounter=0;
		int arrayTwoCounter=0;
		int lastMatch=0;
		while(arrayOneCounter < array1.length && arrayTwoCounter < array2.length){
			if(array1[arrayOneCounter] == array2[arrayTwoCounter] && array1[arrayOneCounter] != lastMatch){
				lastMatch = array1[arrayOneCounter];
				output.add(lastMatch);
				arrayOneCounter = arrayOneCounter +1;
				arrayTwoCounter = arrayTwoCounter +1;
			}else if(array1[arrayOneCounter] < array2[arrayTwoCounter]){
				arrayOneCounter = arrayOneCounter + 1;
			}else{
				arrayTwoCounter = arrayTwoCounter +1;
			}
		}
		return output;
	}
}
