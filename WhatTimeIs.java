import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class WhatTimeIs {

    public static void time() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(calendar.getTime()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String whatTime = in.nextLine();
        if (whatTime.equals("What time is?")) {
            WhatTimeIs.time();
        } else System.out.println("Error input.");
    }
}