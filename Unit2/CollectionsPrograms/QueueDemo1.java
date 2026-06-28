import java.util.*;

public class QueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Queue<Integer> q 
        = new LinkedList<>(); 
	

    // Adds elements {0, 1, 2, 3, 4} to 
    // the queue 
    for (int i = 0; i < 5; i++) 
        q.add(i); 

    // Display contents of the queue. 
    System.out.println("Elements of queue "
                       + q); 

    // To remove the head of queue. 
    int removedele = q.remove(); 
    System.out.println("removed element-"
                       + removedele); 

    System.out.println(q); 

    // To view the head of queue 
    int head = q.peek(); 
    System.out.println("head of queue-"
                       + head); 

    // Rest all methods of collection 
    // interface like size and contains 
    // can be used with this 
    // implementation. 
    int size = q.size(); 
    System.out.println("Size of queue-"
                       + size);
                       */
		Queue<String> queue=new ArrayDeque<String>();
		
		queue.add("kletech");
		queue.add("ait");
		queue.add("bvrit");
		queue.add("bvbcet");
		queue.add("sdmcet");
		
		System.out.println(queue);
		
		String str=queue.peek();
		
		System.out.println(str);
		
		queue.remove();
		
		
		
		System.out.println(queue);
		
		queue.add("kletech");
		
		System.out.println(queue);
		String str1=queue.peek();
		
		System.out.println(str1);
		
		
		
		
		
				
	}

}
