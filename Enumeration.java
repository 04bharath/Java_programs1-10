public class Enumeration {
    public enum Daysofweek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSADY,
        FRIDAY,
        SATURSDAY,
        SUNDAY;

        public boolean isworkingday() {
            return (this != SATURSDAY && this != SUNDAY);
        }
        }
        public static void main(String args[]) {
            System.out.println("Monday is working day : " + Daysofweek.MONDAY.isworkingday());
            System.out.println("Monday is working day : " + Daysofweek.SUNDAY.isworkingday());
        }
        }
