package api_class;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now= Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        System.out.println("year = " + year);
        //year = 2023

        int month = now.get(Calendar.MONTH);
        System.out.println("month = " + month);
        //month = 8

        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println("day = " + day);
        //day = 17

        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println("week = " + week);
        //week = 1

        int amPm = now.get(Calendar.AM_PM);
        System.out.println("amPm = " + amPm);
        //amPm = 0

        int hour = now.get(Calendar.HOUR);
        System.out.println("hour = " + hour);
        //hour = 11

        int minute = now.get(Calendar.MINUTE);
        System.out.println("minute = " + minute);
        //minute = 49

        int second = now.get(Calendar.SECOND);
        System.out.println("second = " + second);
        //second = 14

        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now2=Calendar.getInstance(tz);
    }
}
