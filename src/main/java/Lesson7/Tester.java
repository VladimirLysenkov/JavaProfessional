package Lesson7;

public class Tester {

    @BeforeSuite
    public void beforeTest(){
        System.out.println("До теста");
    }

    @AfterSuite
    public void afterTest(){
        System.out.println("После теста");
    }

    @Test (10)
    public void test4(){
        System.out.println("Тест 4");
    }

    @Test(1)
    public void test1(){
        System.out.println("Тест 1");
    }

    @Test(4)
    public void test2(){
        System.out.println("Тест 2");
    }

    @Test (7)
    @AfterSuite
    public void test3(){
        System.out.println("Тест 3");
    }
}
