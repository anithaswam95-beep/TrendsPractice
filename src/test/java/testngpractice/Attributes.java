package testngpractice;

import org.testng.annotations.Test;

public class Attributes {

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(priority = 1, enabled = false)
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test 3");
    }
}
