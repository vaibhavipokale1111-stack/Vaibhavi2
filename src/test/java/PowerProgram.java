import java.util.Scanner;

public class PowerProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double square = num * num;
        double cube = num * num * num;
        double fourthPower = num * num * num * num;

        System.out.println("square: " + square);
        System.out.println("cube: " + cube);
        System.out.println("fourth power: " + fourthPower);

        sc.close();
    }
}
