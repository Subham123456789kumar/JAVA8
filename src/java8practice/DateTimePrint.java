package java8practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.w3c.dom.ls.LSOutput;

public class DateTimePrint {
    
    public static void main(String[] args) {
        Date today = new Date();
        
        System.out.println("Today: " + today);
        System.out.println("Next Day: " + findNextDay(today));
        System.out.println("Previous Day: " + findPreviousDay(today)); 
        
        
        
        System.out.println("\n\n");
        
        
        LocalDate todayDate=  LocalDate.now();

        
        
        System.out.println("Today: " + todayDate);
        System.out.println("Next Day: " + findNextDay1(todayDate));
        System.out.println("Previous Day: " + findPrevDay(todayDate)); 
        
        
    }
    
    public static Date findNextDay(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate nextDay = localDate.plusDays(1);
        return Date.from(nextDay.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date findPreviousDay(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate previousDay = localDate.minusDays(1);
        return Date.from(previousDay.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    
    
    
    // local date 
    private static LocalDate findNextDay1(LocalDate localdate)
	{
		return localdate.plusDays(1);
	}

	private static LocalDate findPrevDay(LocalDate localdate)
	{
		return localdate.minusDays(1);
	}




    
    
    
    
    
    
    
    
    
}
