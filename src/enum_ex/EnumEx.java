package enum_ex;

public class EnumEx {
    public static void main(String[] args) {
        Week today=Week.MONDAY;
        System.out.println(today.name());
        //MONDAY
        System.out.println(today.ordinal());
        //0
        Week someday = Week.valueOf("MONDAY");
        System.out.println(someday);

        Week[] days=Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
        /*
          MONDAY
          TUESDAY
          WEDNESDAY
          THURSDAY
          FRIDAY
          SATURDAY
          SUNDAY
         */
    }
}
