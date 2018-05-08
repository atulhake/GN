package student;

public class split {

	//public static void main(String[] args) 
	{
		String ab = "welcome   atul";
		String [] as = ab.split(" ");
			System.out.println(as[1]);  
	}  
	//public static void main(String[] args) 
	{
		String ab = "welcome atul";
		String lastWord = ab.substring(ab.lastIndexOf(" "));
		System.out.println(lastWord);
	}  
	//public static void main(String[] args) 
		{
			String ab = "welcome atul";
			String[] parts = ab.split(" ");
			String lastWord = parts[parts.length - 1];
			System.out.println(lastWord);
		} 
	}


