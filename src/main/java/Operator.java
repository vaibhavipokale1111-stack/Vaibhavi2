public class Operator {
    public static void main(String[] args) {
         //sum of all digit no
        int i= 34 ;
        int lastDigit = i% 10;
        int firstdigit =i/10;
        int sum = lastDigit + firstdigit ;
        System.out.println(" sum is "+ sum);

        int rev = lastDigit * 10 + firstdigit ;
        System.out.println(rev);


    }
}
