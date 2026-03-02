class Example {


    static void showMessage() {
        System.out.println("This is a static method.");
    }


    void displayInfo() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {


        showMessage();


        Example obj = new Example();


        obj.displayInfo();
    }
}