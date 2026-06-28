import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> dataSet=new HashSet<String>();
		
		dataSet.add("kletech");
		dataSet.add("bvrit");
		dataSet.add("socse");
		dataSet.add("sdmcet");
		dataSet.add("abit");
		
		//System.out.println(dataSet);
		
		java.util.Iterator<String> itr=dataSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Integer> dataSet1=new HashSet<Integer>();
		
		dataSet1.add(4);
		dataSet1.add(1);
		dataSet1.add(2);
		dataSet1.add(5);
		dataSet1.add(3);
		
		System.out.println(dataSet1);
		
		SortedSet sortedSet=new TreeSet(dataSet);
		System.out.println(sortedSet);
		
	}

}
