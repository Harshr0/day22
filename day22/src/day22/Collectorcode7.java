package day22;
import java.util.*;
public class Collectorcode7 {

	public static void main(String[] args) {
		ArrayList<String> firstList= new ArrayList<String>(Arrays.asList("Good", "Morning", "Students")); 
		ArrayList<String> secondList= new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));  
		ArrayList<String> thirdList= new ArrayList<String>();
		for(String tempList : firstList)    
		thirdList.add(secondList.contains(tempList) ? "Yes" : "No");  
		System.out.println(thirdList);  
	}

}
