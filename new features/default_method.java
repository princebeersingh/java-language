/**
 * default_method
 */
interface TestInterface 
{ 
	// abstract method 
	public void square(int a); 

	// default method 
	default void show() 
	{ 
	System.out.println("Default Method Executed"); 
	} 
} 

class default_method implements TestInterface 
{ 
	public void square(int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		default_method d = new default_method(); 
		d.square(4); 

		// default method executed 
		d.show(); 
	} 
} 
