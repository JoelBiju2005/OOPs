import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//user defined type: BankAccount
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


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList data structure
		LinkedList<String> linkedList=new LinkedList<String>();
		
		linkedList.add("one");
		linkedList.add("two");
		
		linkedList.addFirst("three");
		linkedList.addLast("four");
		linkedList.add("four");
		
		linkedList.addFirst("four");
		
		//obtain iteartor
		Iterator<String> itr=linkedList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

		for(String string: linkedList) {
			System.out.println(string);
		}

		//LinkedList methods

		linkedList.removeFirst();
		linkedList.removeLast();
		
		for(String string: linkedList) {
			System.out.println(string);
		}
		
		//LinkedList to store user defined objects: BankAccount
		
		LinkedList<BankAccount> linkedList1=new LinkedList<BankAccount>();
		
		linkedList1.add(new BankAccount(1001,1000));
		linkedList1.add(new BankAccount(1002,1000));
		linkedList1.addFirst(new BankAccount(1003,1000));
		linkedList1.addLast(new BankAccount(1004,1000));
		
		for(BankAccount accounts:linkedList1) {
		System.out.println(accounts);	
		}
	}

		
}
