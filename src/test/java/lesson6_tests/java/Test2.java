package lesson6_tests.java;

import Lesson6.Main;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    private Main t;

    private final int[] arr;
    private final boolean check;

    @Parameters
    public static Collection params() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 1, 1, 4}, true},
                        {new int[]{4, 4, 4, 1}, true},
                        {new int[]{4, 4, 4, 4}, false},
                        {new int[]{1, 1, 1, 1}, false},
                        {new int[]{1, 0, 1, 4}, false}
                }
        );
    }

    public Test2(int[] arr, boolean check) {
        this.arr = arr;
        this.check = check;
    }

    @Before
    public void init() {
        t = new Main();
    }

    @After
    public void tearDown() throws Exception {
        t = null;
    }

    @Test
    public void testCheckArrayFor1And4() {
        Assert.assertEquals(t.checkArray1And4(arr), check);
    }

}
