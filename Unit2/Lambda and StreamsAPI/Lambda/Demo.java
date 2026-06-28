interface TestInterface{
	int getProduct(int a);
	
	default int getSquare(int x){

	System.out.println("test");
	return x*x;
	
	}
	default int getSum(int a, int b){

	return a+b;
	}

}
class TestClass implements TestInterface{
	
	public int getSquare(int a){

	return a*a;
	}
	public int getProduct(int a){
	return a*2;
	}

}
class Demo{
	public static void main(String[] args){

	TestClass tc=new TestClass();

	//System.out.println("Square="+tc.getSquare(10));
	
	TestInterface ti=new TestClass();
	System.out.println(ti.getSquare(10));
	TestInterface ti1=new TestClass();	
	System.out.println(ti1.getSum(10,10));	

	System.out.println(ti1.getProduct(4));	

	}
}