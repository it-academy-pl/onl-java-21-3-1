package pl.itacademy.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Before8Example {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE MMMM hh-mm-ss a");
        System.out.println(dateFormat.format(now));

        String text = "31.12.2021 23:59:30";
        SimpleDateFormat polishFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date parsedDate = polishFormat.parse(text);
        System.out.println(parsedDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parsedDate);
        calendar.add(Calendar.SECOND, 31);
        parsedDate = calendar.getTime();
        System.out.println(parsedDate);
    }
}
