package day22;
import java.util.*;
public class Collectorcode6 {

	public static void main(String[] args) {
		ArrayList<Integer> firstList=new ArrayList<Integer>(Arrays.asList(12, 4, 67, 90, 34));  
		System.out.println("First array list: ");  
		System.out.println(firstList);   
		List<Integer> secondList=new ArrayList<Integer>(Arrays.asList(12, 4, 67, 0, 34));  
		System.out.println("Second array list: ");  
		System.out.println(secondList);    
		firstList.removeAll(secondList);   
		System.out.println("Un-common element of the first list: ");  
		System.out.println(firstList);  
	}

}
