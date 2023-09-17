package api_class;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now= LocalDateTime.now();
        System.out.println("현재 시간 = " + now);
        //현재 시간 = 2023-09-17T12:13:29.889164

        LocalDateTime targetTime = now
                .plusYears(1)
                .minusMonths(2)
                .plusDays(3)
                .minusHours(4)
                .plusMinutes(5)
                .plusSeconds(6);
        System.out.println("연산 후 = " + targetTime);
        //연산 후 = 2024-07-20T08:18:35.889164
    }
}
