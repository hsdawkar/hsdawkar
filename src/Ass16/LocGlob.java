package Ass16;

public class LocGlob {
	public static String name1 = "harshad";
	
	void method()
	{
		String name = "harshad";
		
		if(name1==name)
		{
			System.out.println("variable values are same");
		}
		else
		{
			System.out.println("variable values are not same");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocGlob har = new LocGlob();
		har.method();
		
		

	}

}
