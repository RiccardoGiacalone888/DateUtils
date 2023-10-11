import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtils {
    public static String formatDate (Date date, String pattern){
        // Create a SimpleDateFormat object using the specified pattern.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        // Use SimpleDateFormat to format the date into a string.
        return sdf.format(date);

    }
    public static Date parseDate
            (String dateStr, String pattern) throws java.text.ParseException{
        // Create a SimpleDateFormat object using the specified pattern.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        // Use SimpleDateFormat to parse the date from the string.
        return sdf.parse(dateStr);
    }
}
