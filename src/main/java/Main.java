import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        String formattedDate = DateUtils.formatDate(date, "yyyy-MM-dd");
        System.out.println("Formatted Date: " + formattedDate);
        String dateStr = "2023-10-11";

        try {
            // Parsing  date
            Date parsedDate = DateUtils.parseDate(dateStr, "yyyy-MM-dd");
            System.out.println("Parsed Date: " + parsedDate);
        } catch (java.text.ParseException e) {
            System.out.println("Error parsing the date: " + e.getMessage());
        }
    }
}

