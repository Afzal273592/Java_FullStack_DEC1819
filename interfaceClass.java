package day4.homework;

public class interfaceClass implements Interface_class {
	static String Name = "";
	static int rollnum;
	static float cgpa;
	@Override
	public int rollNumber(int rollnum) {

		return 1005;
	}

	@Override
	public float cgpa(float cgpa) {
		System.out.println(2.5f);
		return 2.5f;
	}
	
	@Override
	public void Name(String Str) {
		// TODO Auto-generated method stub
		System.out.println(Str);
	}


	public static void main(String[] args) {
		
		interfaceClass inter = new interfaceClass();
		
		inter.Name("MUHAMMAD AKRAM");
		
		
//		(int Roll, String Name , float cgpa, String Schoolname)
		Interface_class.printdetails(1005, "ALI", 35.f, "PSGSCHOOL");
		
	}



}
