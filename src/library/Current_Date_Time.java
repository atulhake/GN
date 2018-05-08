package library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date_Time {

	public static void main(String[] args)
	{
	  DateFormat dateformate = new SimpleDateFormat("dd/MM/yyyy-HHmmss");
	  Date date = new Date();
	  String date1= dateformate.format(date);
	  System.out.println("Current date & time is = "+date1);
	  

	}

}
