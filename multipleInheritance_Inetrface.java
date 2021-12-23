package day4.homework;

 interface interfaceclass1
{
	 int num1 = 0; 
	 abstract String Name1(String Str);	 
	 public static void printdetails(String str) 
	 {
		 System.out.println(" interfaceclass1 " + str);
	 }	 
}

 interface interfaceclass2 
{	
	 int num1 = 0; 
	 abstract String Name2(String Str); 
	 public static void printdetails(String str) 
	 {
		 System.out.println(" interfaceclass2 " + str);
	 }	 
}


public class multipleInheritance_Inetrface implements interfaceclass1, interfaceclass2
{
	@Override
	public String Name1(String Str) 
	{
		String Str2 = "MS_DHONI";
		return Str2;
	}

	@Override
	public String Name2(String Str) 
	{
		String Str2 = "BABBAR_AZAM";
		return Str2;
	}

	public static void main(String[] args) 
	{	
		multipleInheritance_Inetrface intr = new multipleInheritance_Inetrface();		
		System.out.println(intr.Name1(""));
		System.out.println(intr.Name2(""));
		
	}


}
