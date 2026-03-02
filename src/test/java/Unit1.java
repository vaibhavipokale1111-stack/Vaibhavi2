import java.util.Scanner;

    public class Unit1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter minutes: ");
            long minutes = sc.nextLong();

            long minutesInYear = 365 * 24 * 60;
            long minutesInDay = 24 * 60;

            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / minutesInDay;

            System.out.println("Years: " + years);
            System.out.println("Days: " + days);


        }
    }


