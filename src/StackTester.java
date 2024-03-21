import java.util.ArrayList;
import java.util.Scanner;

public class StackTester {

    public static void main(String[] args) {
        WebStack stack = new WebStack();
        int passed = 0;

        System.out.println("\n---- testing methods on empty stack ----");

        System.out.println("\nTest 1: testing isEmpty()");
        if (stack.isEmpty()) {
            System.out.println("Test 1 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 1 FAILED! ***");
            System.out.println("Expected: true");
            System.out.println("Actual: " + stack.isEmpty());
        }

        System.out.println("\nTest 2: testing size()");
        if (stack.size() == 0) {
            System.out.println("Test 2 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 2 FAILED! ***");
            System.out.println("Expected: 0");
            System.out.println("Actual: " + stack.size());
        }

        System.out.println("\nTest 3: testing peek()");
        if (stack.peek() == null) {
            System.out.println("Test 3 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 3 FAILED! ***");
            System.out.println("Expected: null");
            System.out.println("Actual: " + stack.peek());
        }

        System.out.println("\nTest 4: testing pop()");
        if (stack.pop() == null) {
            System.out.println("Test 4 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 4 FAILED! ***");
            System.out.println("Expected: null");
            System.out.println("Actual: " + stack.pop());
        }

        System.out.println("\n---- adding items to stack ----");
        System.out.println("\n---- testing methods on non-empty stack ----");
        Webpage page1 = new Webpage("Page 1", "This is page 1");
        Webpage page2 = new Webpage("Page 2", "This is page 2");
        Webpage page3 = new Webpage("Page 3", "This is page 3");
        System.out.println("Pushing Page 1 to stack");
        stack.push(page1);
        System.out.println("Pushing Page 2 to stack");
        stack.push(page2);
        System.out.println("Pushing Page 3 to stack");
        stack.push(page3);

        System.out.println("\nTest 5: testing isEmpty()");
        if (!(stack.isEmpty())) {
            System.out.println("Test 5 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 5 FAILED! ***");
            System.out.println("Expected: false");
            System.out.println("Actual: " + stack.isEmpty());
        }

        System.out.println("\nTest 6: testing size()");
        if (stack.size() == 3) {
            System.out.println("Test 6 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 6 FAILED! ***");
            System.out.println("Expected: 3");
            System.out.println("Actual: " + stack.size());
        }

        System.out.println("\nTest 7: testing peek()");
        if (stack.peek().getName() == "Page 3") {
            System.out.println("Test 7 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 7 FAILED! ***");
            System.out.println("Expected: Page 3");
            System.out.println("Actual: " + stack.peek().getName());
        }

        System.out.println("\nTest 8: testing pop()");
        Webpage temp = stack.pop();
        if (temp.getName() == "Page 3") {
            System.out.println("Test 8 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 8 FAILED! ***");
            System.out.println("Expected: Page 3");
            System.out.println("Actual: " + temp.getName());
        }

        System.out.println("\n---- testing stack after popping ----");

        System.out.println("\nTest 9: testing isEmpty()");
        if (!(stack.isEmpty())) {
            System.out.println("Test 9 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 9 FAILED! ***");
            System.out.println("Expected: false");
            System.out.println("Actual: " + stack.isEmpty());
        }

        System.out.println("\nTest 10: testing size()");
        if (stack.size() == 2) {
            System.out.println("Test 10 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 10 FAILED! ***");
            System.out.println("Expected: 2");
            System.out.println("Actual: " + stack.size());
        }

        System.out.println("\nTest 11: testing peek()");
        if (stack.peek().getName() == "Page 2") {
            System.out.println("Test 11 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 11 FAILED! ***");
            System.out.println("Expected: Page 2");
            System.out.println("Actual: " + stack.peek().getName());
        }

        System.out.println("\nTest 12: testing pop()");
        temp = stack.pop();
        if (temp.getName() == "Page 2") {
            System.out.println("Test 12 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 12 FAILED! ***");
            System.out.println("Expected: Page 2");
            System.out.println("Actual: " + temp.getName());
        }

        System.out.println("\nTest 13: testing clear()");
        Webpage page4 = new Webpage("Page 4", "This is page 4");
        System.out.println("Pushing Page 4 to stack");
        stack.push(page1);
        System.out.println("Current stack size should be 2");
        System.out.println("Now Clearing stack");
        stack.clear();
        if (stack.size() == 0 & stack.isEmpty() & stack.peek() == null) {
            System.out.println("Test 13 PASSED!");
            passed++;
        } else {
            System.out.println("*** Test 13 FAILED! ***");
            System.out.println("Expected isEmpty() result: true");
            System.out.println("Actual isEmpty() result: " + stack.isEmpty());
            System.out.println("Expected isEmpty() result: true");
            System.out.println("Actual isEmpty() result: " + stack.isEmpty());
            System.out.println("Expected size() result: 0");
            System.out.println("Actual size() result: " + stack.size());
            System.out.println("Expected peek() result: null");
            System.out.println("Actual peek() result: " + stack.peek());
        }

        if (passed == 13) {
            System.out.println("\nALL 13 TESTS PASSED!");
        } else {
            System.out.println("\n" + passed + " test passed, " + (13 - passed) + " tests FAILED!!!!");
        }
    }

}
