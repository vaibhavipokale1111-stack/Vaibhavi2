import java.util.Scanner;

    public class Integer {
        public static void main(String[] args) {
            int num1;
            int num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num1 :");
            num1 = sc.nextInt();

            System.out.println("Enter Num2 :");
            num2 = sc.nextInt();

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double average = (num1 + num2) / 2.0;
            int distance = Math.abs(num1 - num2);
            int maximum = Math.max(num1, num2);
            int minimum = Math.min(num1, num2);


            System.out.println("sum : " +sum);
            System.out.println("difference: " +difference);
            System.out.println("product : " +product);
            System.out.println("average: " +average);
            System.out.println("distance : " +distance);
            System.out.println("maximum : " +maximum);
            System.out.println("minimum : " +minimum);


        }
    }


