public class Method1 {
    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("sum is :" + sum);

        int substract = sub(100, 20);
        System.out.println("sum is :" + sum);

        int Multiply = Mul(10, 2);
        System.out.println("sum is :" + sum);


    }

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int sub(int a, int b) {
        int c = a - b;
        return c;

    }

    static int Mul(int a, int b) {
        int c = a * b;
        return c;


    }
}
