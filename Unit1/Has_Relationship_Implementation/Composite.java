//Implemetation of Composition
import java.util.Scanner;

class BankAccount{
    int accNo;
    double accBal;
    BankAccount(){
    accNo=0;
    accBal=0;
    }
    BankAccount(int n, double b){
    accNo=n;
    accBal=b;
    }
    void debitAccount(double amt){
    accBal-=amt;
    }
    void creditAccount(double amt){
    accBal+=amt;
    }
    void printAccount(){
    System.out.println(accNo+":"+accBal);
    }
}
class Customer{
    int custId;
    String name;
    BankAccount ba; // Reference to BankAccount                                                                                //differently, this is one possible solution 
    Scanner sc=new Scanner(System.in);
    //The default or parameterized constructor can be
    //used to create the objects	
    Customer(){
    custId=0;
    name="";
    ba=new BankAccount(1001,1000); //object created
    }
    Customer(int id, String n){
    custId=id;
    name=n;
    ba=new BankAccount(1001,1000);  //object created
    }
    void printCustomer(){
    System.out.println(custId+":"+name);
    ba.printAccount();
    }
    void debitAccount(double value){
	ba.debitAccount(value);
    }
    void debitAccount(){
	double value;	
	System.out.println("Enter amt to be debited");
	value=sc.nextInt();
	ba.accBal-=value;
	}

}
class CompositeDemo{
	public static void main(String[] args){
        Customer c1=new Customer(1,"akash");
        c1.ba.creditAccount(1000);
        c1.printCustomer();
        c1.ba.debitAccount(1000);
        c1.printCustomer();
	//c1.ba.debitAccount();
        }
}