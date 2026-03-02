public class Nonstatic {

    static int add(int a , int b){
        return a+b;
    }
     int sub(int a , int b) {
         return a - b;
     }

    public static void main(String[] args) {

        int sum= add(20,30);
        System.out.println("sum:"+sum);

        Nonstatic N1 = new Nonstatic();
       int sub1= N1.sub(100 ,20);
        System.out.println("sub:"+sub1);
    }
}
