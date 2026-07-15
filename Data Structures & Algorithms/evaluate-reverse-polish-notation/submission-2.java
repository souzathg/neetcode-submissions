class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        Set<String> operations = Set.of("+", "-", "*", "/");

        for (int i = 0; i < tokens.length; i++) {

            String current = tokens[i];

            if (!operations.contains(current)) {
                stack.push(Integer.parseInt(current));
            } else {
                int second = stack.pop();
                int first = stack.pop();

                switch (current) {
                    case "+" -> stack.push(first + second);
                    case "-" -> stack.push(first - second);
                    case "*" -> stack.push(first * second);
                    case "/" -> stack.push(first / second);
                }
            }
        }

        return stack.peek();
    }
}
