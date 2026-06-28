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
	public int getProduct(int a){
		return a*2;
	}
	public int getSum(int a, int b){
	System.out.println("Default method ");
	return a+b;
	
	}	
}
class Demo1{
	public static void main(String[] args){
	TestInterface ti=new TestClass();;
	System.out.println(ti.getSquare(10));
	System.out.println(ti.getSum(10,10));
	System.out.println(ti.getProduct(10));
	}
}