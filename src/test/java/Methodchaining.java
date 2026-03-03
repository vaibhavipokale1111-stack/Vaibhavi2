 class A11 {
    A11 method (){
        System.out.println("hello vaibhavi");
        return this;
    }
    A11 method1 (){
        System.out.println("Hello Vaibhavi Pokale");
        return this;
    }

}
class Methodchaining {
    public static void main(String[] args) {

        A11 M1 = new A11();
        M1.method().method1();
    }
}
