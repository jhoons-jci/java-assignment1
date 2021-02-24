package question2;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

	public class DateAndTime 
	{
	    public void calc() throws ParseException {
	        Date date = Calendar.getInstance().getTime();
	        DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss.sss");
	        String newFormat = formatter.format(date);
	        System.out.println(newFormat);
	        
	        formatter = new SimpleDateFormat(""+ "dd MMM,yyyy hh:mm a");
	        newFormat = formatter.format(date);
	        System.out.println(newFormat);
	    
	}}

