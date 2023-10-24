public class DayOfWeek {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // ! Assuming today is THURSDAY
        Day today = Day.THURSDAY;

        // ! Use a switch statement to perform different actions based on the day
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday. Start of heavy week.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday. Busy day.");
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's Thursday. Keep up the good work.");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Enjoy your day at work and the weekend ahead.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! Time to relax and have fun.");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
