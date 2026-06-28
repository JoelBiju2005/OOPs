/*Consider a customer has bank account and it is of type savings account.
He can credit, debit money to his accounts and transfer amount from one account
to another (student can try this). Write a java program to simulate 
the above scenario. 
First implement the contained object
then the container object
*/

// Implementation of Aggregation


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
    BankAccount ba;   // Declaration only, no object created. reference
    Customer(){
    custId=0;
    name="";
    }
    //Use the following constructor to create the object	
    Customer(int id, String n, BankAccount ba){ 
    custId=id;
    name=n;
    this.ba=ba;
    }
    void printCustomer(){
    System.out.println(custId+":"+name);
    ba.printAccount();
    }
    void debitAccount(double value){
	ba.debitAccount(value);
	}
}
class AggregationDemo{
	public static void main(String[] args){


BankAccount ba=new BankAccount(1001,1000); // Object created   
//If the customer is destroyed //still the bank account is alive
//Deleting the object is under the control 
//java Garbage collector
Customer c1=new Customer(1,"a",ba);
c1.printCustomer();
c1.ba.creditAccount(100);
c1.printCustomer();
}
}