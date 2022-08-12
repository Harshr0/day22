package day22;
import java.util.*;
import java.util.stream.Collectors;
public class Collectorcode9 {

	public static void main(String[] args) {
		ArrayList<String> firstList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		System.out.println("First List: "+firstList);   
		ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));  
		System.out.println("Second List: "+secondList);     
		System.out.print("Common elements: " +firstList.stream().filter(secondList::contains).collect(Collectors.toList()));  
	}

}
