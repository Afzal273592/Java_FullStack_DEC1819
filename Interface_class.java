package day4.homework;

public interface Interface_class 
{

	/**
	 * interface can have method and variables
	 * 
	 * Rules to create Interface:
	 * 
	 * Variables in interface are public, Static and final (Mostly we use constant
	 * variables) The variable in an interface is public, static, and final by
	 * default. No access modifier is allowed except the public for interface
	 * variables. Every variable of an interface must be initialized in the
	 * interface itself. The class that implements an interface can not modify the
	 * interface variable, but it may use as it defined in the interface. We must
	 * use UPPER_CASE Letter to define variables in java Interface
	 * 
	 * 
	 * 
	 * Interfaces also can have few things - what are those things  can interfaces have apart from abstract methods? 
	 * 
	 * interface can have method and variables
	 * 
	 * Constant variables Abstract Methods Static Methods Default Methods (have
	 * collection of methods and mostly interface have only abstract Methods)
	 * 
	 * Interface can not have constructor
	 * 
	 * 
	 * 
	 * Can interfaces have methods with definitions ? if so how ? or what ?
	 * 
	 * if we use Method with defination in interface than we must use {} and right the logic of code it will not be an abstract method.
	 * 
	 * 
	 */
	
	//	Variables ** We can not change the values of 

	static int ROLL_NUMBER = 1001;
	public float TOTAL_CGPA = 4.2f;
	final String NAME = "MUHAMMAD AFZAL";
	String SCHOOL_NAME = "ASGI_SCHOOL";
	
//	public Interface_class() {
//		
//	}
//	
	
	// Methods
	
	public int rollNumber(int rollnum);
	abstract float cgpa(float CGPA);
	abstract void Name(String Str);
	
	static void printdetails(int Roll, String Name , float cgpa, String Schoolname)
	{
		System.out.println("Student Details are ..." );
		System.out.println("Student NAME .." + NAME );
		System.out.println("Student ROLL_NUMBER .." + ROLL_NUMBER );
		System.out.println("Student TOTAL_CGPA .." + TOTAL_CGPA );
		System.out.println("Student SCHOOL_NAME .." + SCHOOL_NAME );
	}
	
		
	default void printDetailsof() {
		
		System.out.println("Student Details are ..." );
		System.out.println("Student NAME .." + NAME );
		System.out.println("Student ROLL_NUMBER .." + ROLL_NUMBER );
		System.out.println("Student TOTAL_CGPA .." + TOTAL_CGPA );
		System.out.println("Student SCHOOL_NAME .." + SCHOOL_NAME );
		
	}
	
	

}

