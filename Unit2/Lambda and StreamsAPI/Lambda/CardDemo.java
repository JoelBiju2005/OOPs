/*
Design a functional interface to define a
void swipe(double amt) method.
Implement the functional interface by the
class DebitCard to swipe, which adds the amt to the
balance of the debit card.
Print the DebitCard details before swipe and 
after swipe.
*/
import java.util.Scanner;
interface SwipeInterface{
	void swipe(double amt);
}
class DebitCard{
	int cardNo;
	double balance;
	String bankName;
	DebitCard(int cardNo, double balance,
	 String bankName){
	this.cardNo=cardNo;
	this.balance=balance;
	this.bankName=bankName;
	}	
	void swipe(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount");
	double a=sc.nextDouble();	
	SwipeInterface si=(amt)->{ this.balance+=amt;};
	si.swipe(a);	
	}
	void printCard(){
	System.out.println(cardNo+":"+balance+":"+bankName);
	}

}
class CardDemo{
	public static void main(String[] args){
		DebitCard dc=new DebitCard(12345,0,"SBI");
		dc.printCard();
		dc.swipe();
		dc.printCard();
	}	
}