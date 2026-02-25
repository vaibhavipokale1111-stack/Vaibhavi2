public class Student {
    public static void main(String[] args) {
        Demo d1 =new Demo();
        d1.name= "Vaibhavi";
        d1.Speak("hello");

    }
}
class Demo {
    String name;
    void Speak(String content ){
        System.out.println(name + " : "+content);
    }
}