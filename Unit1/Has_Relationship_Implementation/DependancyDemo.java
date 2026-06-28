// Implementation of uses/Dependancy relationship


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

    Customer(){
    custId=0;
    name="";
    }
    Customer(int id, String n){
    custId=id;
    name=n;
    }
//The BankAccount object is passed as a parameter to any function of 
//the container class
    void printCustomer(BankAccount ba){
    System.out.println(custId+":"+name);
    ba.printAccount();
    ba.creditAccount(100);
    ba.printAccount();
    }
	
}
class DependancyDemo{
	public static void main(String[] args){
	Customer c1=new Customer(1,"a");
    	c1.printCustomer(new BankAccount(1001,1000));
	
}
}
