package conditionalOperators;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("enter your correct age");
        int age = S.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        System.out.println("Enter the marks u took");
        int marks = S.nextInt();
        if (marks >= 40) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }
        System.out.println("Enter the number");
        int num = S.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
