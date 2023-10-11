import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;

public class DataUtilsTest {
    @Test
    public void formatTestDate() {
        Date date = new Date();
        String formattedDate = DateUtils.formatDate(date, "yyyy-MM-dd");
        assertEquals("2023-10-11", formattedDate);
    }

    @Test
    public void ParseTestDate() throws ParseException {
     String dateStr= "2023-10-11";
     Date date = DateUtils.parseDate(dateStr, "yyyy-MM-dd");
     assertNotNull(date);

    }
}
