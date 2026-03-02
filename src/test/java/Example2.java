public class Example2 {
    public static void main(String[] args) {
        Example1.Human h = new Example1.Human();
        h.name = "Rahul";
        h.age = 25;
        h.speak();


        Example1.MobilePhone m = new Example1.MobilePhone();
        m.brand = "Samsung";
        m.price = 20000;
        m.call();


        Example1.Desktop d = new Example1.Desktop();
        d.processor = "i5";
        d.ram = 16;
        d.start();


        Example1.College c = new Example1.College();
        c.collegeName = "ABC College";
        c.location = "Pune";
        c.displayInfo();


        Example1.TestSuite ts = new Example1.TestSuite();
        ts.suiteName = "Regression Suite";
        ts.runSuite();


        Example1.TestCase tc = new Example1.TestCase();
        tc.testCaseName = "Login Test";
        tc.execute();


        Example1.TestSteps step = new Example1.TestSteps();
        step.stepNumber = 1;
        step.description = "Open Browser";
        step.performStep();
    }
}

