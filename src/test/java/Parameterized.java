public class Parameterized {

    static void greet(String name){
        System.out.println("Name:"+name);
    }
    void add(int a,int b){
        int sum= a+b;
        System.out.println("sum is :"+sum);
    }

    public static void main(String[] args) {
        greet("Vaibhavi");

        Parameterized P1 = new Parameterized();
        P1.add(10,30);
    }
}
