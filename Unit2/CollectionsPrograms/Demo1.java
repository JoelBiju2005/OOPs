import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class BankAccount{
	int accNo;
	double bal;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	BankAccount(int accNo, double bal){
		this.accNo=accNo;
		this.bal=bal;
	}
	void debitAmt(double amt) {
		bal-=amt;
	}
	void creditAmt(double amt) {
		this.bal=amt;
	}
	public String toString() {
		return accNo+":"+this.bal;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The non generic ArrayList to store any type of object
		/*ArrayList myList=new ArrayList();
		
		myList.add(10);
		myList.add(1.2F);
		myList.add("kletech");
		myList.add(10L);
		
		Iterator itr=myList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	*/
		//ArrayList to store String objects
		ArrayList<String> myList=new ArrayList<String>();

		myList.add("kletech");
		myList.add("bvebcet");
		myList.add("kleit");
		
		//obtain iterator
	
		Iterator itr=myList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		myList.set(2, "element");
	
		
		Iterator itr1=myList.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//using remove method		
		myList.remove(2);
		
		//System.out.println(itr1.next());
		
		//ArrayList to store integer objects
		ArrayList<Integer> myList1=new ArrayList<Integer>(5);
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		myList1.add(4);
		myList1.add(5);
		
		for (Integer integer : myList1) {
			
			System.out.println(integer);
		} 
		
		myList1.remove(4);
		
		for (Integer integer : myList1) {
			
			System.out.println(integer);
		}
		myList1.add(0,0);
	
		
		for (Integer integer : myList1) {
			
			System.out.println(integer);
		}
		Integer i=myList1.get(1);
		
		System.out.println(i);
		
		/*System.out.println("Removed All");
		
		myList1.clear();
		
		System.out.println("Removed All");
		*/
		
		
		//addAll
		ArrayList<String> myList2=new ArrayList<String>();
		myList2.add("aaa");
		myList2.add("bbb");
		myList2.add("ccc");
		myList2.add("ddd");
		
		ArrayList<String> myList3=new ArrayList<String>();
		myList3.add("ccc");
		myList3.add("ddd");
		myList3.add("eee");
		myList3.add("fff");
		
		myList2.addAll(4, myList3);
		
		
		for (String string : myList2) {
			System.out.println(string);
		}
	
		System.out.println("Array List of Bank accounts");
		
		//ArrayList tostore user defined object of type BankAccount
		ArrayList<BankAccount> accounts=new ArrayList<BankAccount>(3);
		
		accounts.add(new BankAccount(1001,1000));
		accounts.add(new BankAccount(1002,1000));
		accounts.add(new BankAccount(1003,1000));
		accounts.add(new BankAccount(1004,500));
		
		Iterator< BankAccount> itr2=accounts.iterator();
			
		//Adding 100 to all the accounts	
		while(itr2.hasNext()) {
			//itr2.next().
			
			itr2.next().bal+=100;
		}
		
		for(BankAccount account:accounts){
		System.out.println(account);	
		
		if(account.bal>1000) {
		account.bal+=1000;
		
		
		}
		
		}
		for(BankAccount account:accounts){
			System.out.println(account);	
			}
	}
	
	
	}


