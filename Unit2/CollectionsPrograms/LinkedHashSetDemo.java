import java.util.*;
import java.util.Collections;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		linkedHashSet.add("five");
		
		LinkedHashSet< Float> linkedHashSet1=new LinkedHashSet<Float>();
		
		linkedHashSet1.add(1F);
		linkedHashSet1.add(2F);
		linkedHashSet1.add(3F);
		linkedHashSet1.add(4F);
		linkedHashSet1.add(5F);
		
		
		Iterator itr1=linkedHashSet.iterator();
		
		//order of inserting is maintained
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	
		for(Float data: linkedHashSet1) {
			System.out.println(data);
		}
		
		
	}

}
