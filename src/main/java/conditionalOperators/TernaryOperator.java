package conditionalOperators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String result = (a > b) ? "A is greater" : "B is greater";
        System.out.println(result);

        int num = 7;
        String result1 = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result1);
    }
}
