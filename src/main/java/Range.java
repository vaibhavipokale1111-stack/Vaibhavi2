public class Range {
    public static void main(String[] args) {
        int age = 32;
        if(age <= 18){
            System.out.println("child");
        } else if (age >18 && age <=35) {
            System.out.println("Adult");

        } else if (age > 30 && age <= 45) {
            System.out.println("Mature ");

        }else {
            System.out.println("OLd");
        }

    }
}
