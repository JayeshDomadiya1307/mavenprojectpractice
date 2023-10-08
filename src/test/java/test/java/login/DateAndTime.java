package test.java.login;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		Date date = new Date();
		
		System.out.println(localDate);
		System.out.println(localDate.toString());
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = localDate.format(dateFormat);
		System.out.println(formattedDate);
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate1 = dateFormat1.format(date);
		System.out.println(formattedDate1);
	
		
		
		
	}

}
