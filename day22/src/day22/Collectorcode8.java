package day22;
import java.util.*;
public class Collectorcode8 {
	   
		public static boolean compareList(ArrayList ls1, ArrayList ls2)  
		{    
		return ls1.toString().contentEquals(ls2.toString())?true:false;  
		}  

	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		System.out.println("When Lists are same: "+compareList(firstList, secondList));  
		secondList.add("C++");  
		System.out.println("When Lists are not same: "+compareList(firstList, secondList));
	}

}
