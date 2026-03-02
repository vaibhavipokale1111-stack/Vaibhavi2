 class A {
    public int add(int i,int j){
        return i+j;
    }

}
class B {
    public static void main(String[] args) {
        A a1 = new A();
        int result = a1.add(
                a1.add(10, 10),   // 20
                a1.add(20, 30)    // 50
        );

        System.out.println("Final Result: " + result);
    }
}