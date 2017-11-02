package filters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Printer {
	
	public Printer() { }
	
	public static void printTopTen(Map<String, Integer> stringIntegerMap) {
		// Algorithm taken from http://www.java2novice.com/java-interview-programs/sort-a-map-by-value/
		Set<Entry<String, Integer>> set = stringIntegerMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() 
		{
			public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
			{
				return (o2.getValue()).compareTo( o1.getValue() );
			}
		} );
		
		for (Map.Entry<String, Integer> entry:list) {
			System.out.println(entry.getKey()+" : "+entry.getValue()) ;
		}
	}
}
