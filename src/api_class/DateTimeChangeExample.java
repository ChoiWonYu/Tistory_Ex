package api_class;

import java.time.LocalDateTime;

public class DateTimeChangeExample {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println("현재 = " + now);
        //현재 = 2023-09-17T12:26:01.468480

        LocalDateTime targetDateTime=null;

        targetDateTime = now
                .withYear(2024)
                .withMonth(10)
                .withDayOfMonth(25)
                .withHour(13)
                .withMinute(20)
                .withSecond(10);
        System.out.println("변경된 날짜,시간 = " + targetDateTime);
        //변경된 날짜,시간 = 2024-10-25T13:20:10.468480
    }
}
