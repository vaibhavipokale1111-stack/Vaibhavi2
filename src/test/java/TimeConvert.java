import java.util.Scanner;

class TimeConvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(hours + " hours " +
                minutes + " minutes " +
                seconds + " seconds");
    }
}
