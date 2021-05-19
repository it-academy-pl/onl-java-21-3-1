package pl.itacademy.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class After8Example {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDateTime nowWithDate = LocalDateTime.now();
        System.out.println(nowWithDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");
        System.out.println(today.format(formatter));
        LocalDate todayPlusMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println(todayPlusMonth.format(formatter));

        System.out.println(today.minusYears(2).format(formatter));

        String text = "31.12.2021 23:59:30";
        DateTimeFormatter polishFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime parsedDateTime = LocalDateTime.parse(text, polishFormatter);
        System.out.println(parsedDateTime);

        System.out.println(parsedDateTime.isAfter(nowWithDate));

        System.out.println(nowWithDate);

        DateTimeFormatter polishFormatterWithZone = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss VV");
        System.out.println(polishFormatterWithZone.format(nowWithDate.atZone(ZoneId.systemDefault())));


        LocalDateTime localTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(localTime);

//        System.out.println(ZoneId.getAvailableZoneIds());
        Date fromLocal = Date.from(localTime.atZone(ZoneId.of("UTC")).toInstant());
        System.out.println(fromLocal);

    }
}
