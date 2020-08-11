import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfTheWeek {

    public static String getDay(int m, int d, int y) {
        int month = m;
        int day = d;
        int year = y;

        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] firstMultipleInput = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String result = DayOfTheWeek.getDay(month, day, year);

        System.out.println(result);
    }
}