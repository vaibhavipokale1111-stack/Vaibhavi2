import java.lang.Object;

public class Static {
    static void Hello() {
        System.out.println("Hello Vaibhavi");

    }

    static int add(int a, int b) {
        return a + b;
    }

    void display() {
        System.out.println("i am anon static");
    }


    public static void main(String[] args) {

        Hello();
        int result = add(10, 20);
        System.out.println("sum :"+result);

         Static s1 = new Static ();
         s1.display();




    }
}