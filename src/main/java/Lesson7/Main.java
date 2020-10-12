package Lesson7;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        start();
        start(Tester.class);
    }

    private static void start() {
        try {
            Class classForTest = Class.forName("Lesson7.Tester");
            start(classForTest);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void start(Class classObject) {
        Method[] methods = classObject.getDeclaredMethods();
        try {
            int count1 = 0;
            for (Method o : methods) {

                if (o.getAnnotation(BeforeSuite.class) != null) {
                    if (count1 == 1) throw new TestException();
                    System.out.println(o);
                    count1++;
                }
            }
            for (int i = 1; i <= 10; i++) {
                for (Method o : methods) {
                    if (o.getAnnotation(Test.class) != null) {
                        Test test =
                                o.getAnnotation(Test.class);
                        if (test.value() == i) {
                            System.out.println(o);
                            System.out.println("Значение: " + test.value());
                        }
                    }
                }
            }
            int count2 = 0;
            for (Method o : methods) {
                if (o.getAnnotation(AfterSuite.class) != null) {
                    if (count2 == 1) throw new TestException();
                    System.out.println(o);
                    count2++;
                }
            }
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
