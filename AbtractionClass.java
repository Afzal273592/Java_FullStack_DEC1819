package day4.homework;

public class AbtractionClass {

	public static void main(String[] args) {
		
		/**
		 * As Abstraction have meeting Dealing with quality rather than events,
		 * 
		 * Data Abstraction is the property allow use to display only essential details.
		 * it is also identified to define a process which explain the the characteristics of an object.
		 * 
		 * Interface and Abstract are core element of java abstraction. In Java Abstraction is achieve by interface and Abstract class,
		 * 
		 * Interface is pure Abstract class which has 100 % Abstraction qualities!!!
		 * 
		 * 
		 *  * 
		 */
	
		
			}

}

interface classabstract{
	
String NAME = "MUHAMMAD AZAL";
String CLASS = "CS";
int ROLL_NUMBER = 1001;

public int Rollnumber(int rolllnum);
default String Name(String name) {
	return null;
}

static void Classname(String cs) {
	System.out.println("Static Mehtod");
}
	
}

abstract class newAbstarct implements classabstract{
	
}