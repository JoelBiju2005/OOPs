import java.util.*;	
//functional interface

interface MyNumber{
	double getValue();

}
interface NumericTest{

	boolean test(int n);
}

interface CreateObject{

	A getObject();
}
class A{
	int a;
	int b;

	A(){}
	A(int a,int b){
	this.a=a;
	this.b=b;
	
	}
	public String toString(){
	return this.a+":"+this.b;
	}

}

//A Generic Functional interface

interface SomeFunc<T>{

	T func(T t);
}



class LambdaDemo1{
//reference to interface 

public static void main(String[] args){
MyNumber myNum;

	myNum = ()->{return 123.45;};

	System.out.println("value="+myNum.getValue());

// reference to NumericTest

	NumericTest isEven;

	isEven=(n)->{return (n%2==0);};

	System.out.println("Is Even="+ isEven.test(10));
	System.out.println("Is Even="+ isEven.test(11));
	//System.out.println("Is Even="+ isEven.test("test"));

	//CreateObject

	//Block Lambda Expressions
	CreateObject obj;
	obj=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a");
			int a=sc.nextInt();
			System.out.println("Enter b");
			int b=sc.nextInt();

			A object=new A(a,b);

			return object;
		
			

			};
	System.out.println(obj.getObject());

	//generic interface

	SomeFunc<String> someFun1= (str)->{ return str;};

	SomeFunc<Integer> anotherFun1=(n)->{return (n*n);};

	System.out.println("SomeFun="+someFun1.func("KLETECH"));
	System.out.println("SomeFun="+anotherFun1.func(10));
}

}