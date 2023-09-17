package api_class;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate= LocalDate.parse("2024.05.01",formatter);
    }
}
