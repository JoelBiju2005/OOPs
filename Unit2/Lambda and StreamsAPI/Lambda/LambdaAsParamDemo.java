interface PrintInterface{
	void printData(String str);
}
class LambdaAsParam{
	void display(PrintInterface pFace, String str){
		pFace.printData(str);
	}	
}
class LambdaAsParamDemo{
	public static void main(String[] args){
	PrintInterface pFace1= (str)->{System.out.println(str);};
	LambdaAsParam lap=new LambdaAsParam();
	lap.display(pFace1,"Test");
}
}
