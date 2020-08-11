import java.util.*;

public class CalendarYear {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
    }
}