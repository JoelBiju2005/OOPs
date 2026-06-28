import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> dataSet=new HashSet<Integer>();
		
		dataSet.add(34);
		dataSet.add(34);
		dataSet.add(34);
		dataSet.add(34);
		dataSet.add(34);
		
		for(Integer data: dataSet) {
			System.out.println(data);
		}
		

	
		int score[]= {5,2,4,1,3};
		
		Set<Integer> dataSet1=new HashSet<Integer>();
		
		for(int i=0;i<score.length;i++) {
			dataSet1.add(score[i]);
		}
		/*
		dataSet1.add(5);
		dataSet1.add(2);
		dataSet1.add(4);
		dataSet1.add(1);
		dataSet1.add(3);
		*/
		System.out.println(dataSet1);
		
		/*SortedSet<Integer> dataSet2=new TreeSet<Integer>(dataSet1);
		
		System.out.println(dataSet2);
		*/
		
	}

}
