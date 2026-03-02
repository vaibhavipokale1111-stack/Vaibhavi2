import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches: ");
        String input = sc.nextLine();


        if (input.matches("-?\\d+(\\.\\d+)?")) {

            double inches = Double.parseDouble(input);
            double meters = inches * 0.0254;

            System.out.printf("%.2f", meters);

        } else {
            System.out.println("Invalid output");
        }


    }
}
