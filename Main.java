import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();
        Bubble newBubble = new Bubble();
        StringBubble strBubble = new StringBubble();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Write tests for the other operators (-, *, /)

        // Uncomment this test which has many operators
        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "15,7,1,1,+,-,/,3,*,2,1,1,+,+,-";
        expectedResult = 5.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        int[] toSort = {6,1,3,9,5,12,2};
        toSort = newBubble.bubbleSort(toSort);
        System.out.println("Sorted Array: " + Arrays.toString(toSort));

        String[] toBeSorted = {"Taco Burrito", "Taco Daddy", "Takis", "Bob","Stu", "Taco Mom", "Sally", "Taco Dad", "Al", "Taco Salad", "taco", "Taco Lunch"};
        toBeSorted = strBubble.bubbleSort(toBeSorted);
        System.out.println("Sorted String Array: " + Arrays.toString(toBeSorted));
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
