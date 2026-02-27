public class XYZ {
    public static void main(String[] args) {
        ABC a1= new ABC();
        a1.name1= "Vaibhavi";
        a1.age= 22;
         a1.Gender= "Female ";



        ABC a2= new ABC();
        a2.name1= "Vaishnavi";
        a2.age= 23;
        a2.Gender= "Female ";

        a1.display("hlo");
        a2.display("Hii");
        a1.display("how r u ?");
        a2.display("I am Good ");









    }
}
class ABC{
    String name1;
    int age;
    String Gender;
    void display(String Content){
        System.out.println(name1+ " :"+Content );
       // System.out.println( "Age :" +age);
        //System.out.println( "Gender :" +Gender);



    }

}
