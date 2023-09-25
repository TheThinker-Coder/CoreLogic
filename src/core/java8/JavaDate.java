package core.java8;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localtime is "+ localTime);
        LocalDate localDate = LocalDate.now();
        System.out.println("localdate is"+ localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime is "+ localDateTime);
        // Date Time Formatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Formated date "+formatDateTime);

        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(2022);
        System.out.println(date);


    }
}
