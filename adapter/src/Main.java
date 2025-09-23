import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter calendar = new CalendarToNewDateAdapter();
        LocalDateTime date = LocalDateTime.now();

        // Fetch date from computer and pass to the adapter
        calendar.setDay(date.getDayOfMonth());
        calendar.setMonth(date.getMonthValue());
        calendar.setYear(date.getYear());


        System.out.println("Starting date\n");
        System.out.println("Day " + calendar.getDay());
        System.out.println("Month " + calendar.getMonth());
        System.out.println("Year " + calendar.getYear());

        System.out.println("\nAdding 5 days: \n");
        calendar.advanceDays(5);

        System.out.println("Day " + calendar.getDay());
        System.out.println("Month " + calendar.getMonth());
        System.out.println("Year " + calendar.getYear());

        System.out.println("\nAdding 50 days: \n");
        calendar.advanceDays(50);

        System.out.println("Day " + calendar.getDay());
        System.out.println("Month " + calendar.getMonth());
        System.out.println("Year " + calendar.getYear());

        System.out.println("\nSubtracting 10 days: \n");
        calendar.advanceDays(-10);

        System.out.println("Day " + calendar.getDay());
        System.out.println("Month " + calendar.getMonth());
        System.out.println("Year " + calendar.getYear());


    }
}
