import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Examples
{


    
  public static void main(String[] args){
    
    /**local date time .of method lets you save a new date/time
    goes by year, month, day, hour, min, second , nanosec, 
    the last two are not required*/
    LocalDateTime test1 = LocalDateTime.of(2069,8,12,11,17);
    System.out.println(test1);
    
    
    /**get the exact time/date right now, with seconds, nanoseconds use .now() method.*/
    LocalDateTime test2 = LocalDateTime.now();
    System.out.println(test2);
    
    /**to format the date you can use java.time.format.DateTimeFormatter and the .ofPattern
    /to set a pattern, such as:*/
    DateTimeFormatter formatTypeA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    /** to print in this format use the .format with the object of your format.*/
    System.out.println(test1.format(formatTypeA));
    
    
    /**new format, EEE means day text eg Mon , MMM is text of month d is day but if it is
    // a single digit it will not put a zero in front, yy is last two digits of year.*/
    DateTimeFormatter formatTypeB = DateTimeFormatter.ofPattern("EEE, MMM d, yy");
    
    /**you can pass these formatted dates into a string.*/
    String stringy = test1.format(formatTypeB);
    System.out.println(stringy);
    
}  

    
}
