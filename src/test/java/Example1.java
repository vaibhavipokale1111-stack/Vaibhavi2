public class Example1 {


    static class Human {
        String name;
        int age;

        void speak() {
            System.out.println("name :" + name);
            System.out.println("age :" + age);
        }
    }


    static class MobilePhone {
        String brand;
        double price;

        void call() {
            System.out.println("brand:" + brand);
            System.out.println("price:" + price);
        }
    }


    static class Desktop {
        String processor;
        int ram;

        void start() {
            System.out.println("Desktop:" + processor);
            System.out.println("Ram:" + ram);
        }
    }


    static class College {
        String collegeName;
        String location;

        void displayInfo() {
            System.out.println(collegeName);
            System.out.println(location);
        }
    }


    static class TestSuite {
        String suiteName;

        void runSuite() {
            System.out.println(suiteName);
        }
    }


    static class TestCase {
        String testCaseName;

        void execute() {
            System.out.println(testCaseName);
        }
    }


    static class TestSteps {
        int stepNumber;
        String description;

        void performStep() {
            System.out.println(stepNumber);
            System.out.println(description);
        }
    }

}
