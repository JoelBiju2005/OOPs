import java.util.*;
import java.util.Collections;


public class PriorityQueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue< String> pq=new PriorityQueue<String>();
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		
		
		pq.offer("bbb");
		pq.offer("aaa");
		pq.offer("sss");
		pq.offer("ccc");
		pq.offer("ddd");
		
		for(String str: pq) {
			System.out.println(str);
		}
		
		pq.poll();
		for(String str: pq) {
			System.out.println(str);
		}
		
		pq.poll();
		for(String str: pq) {
			System.out.println(str);
		}
		
		pq.poll();
		for(String str: pq) {
			System.out.println(str);
		}
		
		pq.offer("aaa");
		for(String str: pq) {
			System.out.println(str);
		}

	
	
		pq1.add(1);
		pq1.add(2);
		pq1.add(3);
		pq1.add(5);
		pq1.add(4);
		for(Integer data: pq1) {
			System.out.println(data);
		}
		
		
		
		/*
		pq.add("zzz");
		pq.add("bbb");
		pq.add("aaa");
		pq.add("ccc");
		
	pq.offer("fff");
	pq.offer("eee");
	pq.offer("mmm");
	*/	
/*
		pq.add("Ramesh");
		pq.add("Suresh");
		pq.add("Rudresh");
		pq.add("Kamlesh");
		pq.add("Suhash");
		
		
		Object[] data=pq.toArray();
		
		System.out.println(pq);
		
		System.out.println(data[0].toString());
		
		pq.add("Kotresh");			
		System.out.println(pq);
		*/
		//System.out.println(pq);
	}

}
