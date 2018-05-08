package java_progrms;

public class Someofthedigits {

	public static void main(String[] args) {


		String str = "12345ss4565";

		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Integer.parseInt(str.charAt(i)+"");
			}
		
	System.out.println(sum);
	}
}}
