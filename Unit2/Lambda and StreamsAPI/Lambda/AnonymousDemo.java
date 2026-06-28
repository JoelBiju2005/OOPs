interface Age 
{ 
   void getAge(int a); 
}

// Myclass implement the methods of Age Interface 

/*
class MyClass implements Age 
{ 
    @Override
    public void getAge(int a)  
    { 
        // printing the age 
        System.out.print("Age is "+a); 
    } 
} 
 
class AnonymousDemo 
{ 
    public static void main(String[] args)  
    { 
        // Myclass is implementation class of Age interface 
        MyClass obj=new MyClass(); 
  
        // calling getage() method implemented at Myclass 
        obj.getAge(21);      
    } 
}*/
//second method 
/*
 class AnonymousDemo 
{ 
    public static void main(String[] args)  
    { 
	//creating anonymous class
        Age oj1 = new Age() { 
            @Override
            public void getAge(int a) { 
                 // printing  age 
                System.out.print("Age is "+a); 
            } 
        }; 
        oj1.getAge(21); 
    } 
} */
//Third method
class AnonymousDemo 
{ 
    public static void main(String[] args)  
    {
	// lambda expression 
	Age oj1; //reference to interface
        oj1 = (a)->{System.out.println("Age is "+a); }; 
        oj1.getAge(21); 
    } 
} 

