//functional interface
interface SayHello{
	void sayHello();
}
//functional interface
interface SayHello1{

	String sayHello1();
}
//functional interface
interface AddNums{

	void addNums(int num1, int num2);

}

class LambdaDemo{
	public static void main(String[] args){

	String name="Friend";
	
	//functional interface
	SayHello ref= ()->{System.out.println("Say Hello:"+name);};
	
	ref.sayHello();
	//functional interface
	SayHello1 ref1=()->{ return "Say Hello1";};

	System.out.println(ref1.sayHello1());

	//functional interface
	AddNums addition=(int num1, int num2)-> {System.out.println("res="+(num1+num2));};
	
	addition.addNums(10,10);
	}
}