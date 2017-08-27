
public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    int topOfStack = 0;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");
        System.out.println("num of tokens" + tokens.length);

        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length];

        Double temp = 0.0;
        Double operand1 = 0.0;
        Double operand2 = 0.0;
        // 3. write the algorithm
        for (int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here
            try {
                if (tokens[i].equals("+")) {
                    operand1 = pop();
                    operand2 = pop();
                    push(operand1 + operand2);
                }
                else if (tokens[i].equals("-")) {
                    operand1 = pop();
                    operand2 = pop();
                    push(operand2 - operand1);
                }
                else if (tokens[i].equals("*")) {
                    operand1 = pop();
                    operand2 = pop();
                    push(operand1 * operand2);
                }
                else if (tokens[i].equals("/")) {
                    operand1 = pop();
                    operand2 = pop();
                    push(operand2 / operand1);
                }
                else{
                    //System.out.println(tokens[i]);
                        temp = Double.parseDouble(tokens[i]);
                        push(temp);
                    }
                }
            catch(Exception e){
                    System.out.println("NOT A NUMBER OR AN OPERATOR" + tokens[i]);
                    throw (e);

                }
            }

            // 4. return the result
            return pop();
        }

    private void push(String number) {
        // push on the stack
        stack[topOfStack] = number;
        topOfStack++;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
        push(Double.toString(d));
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
        topOfStack--;
        return Double.parseDouble(stack[topOfStack]);
    }
}
