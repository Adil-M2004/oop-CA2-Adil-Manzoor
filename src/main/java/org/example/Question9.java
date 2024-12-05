package org.example;

import java.util.Scanner;
import java.util.Stack;
/**
 *  Name:
 *  Class Group:
 */
public class Question9 {

    /*
        Reads in an equation from the user
     */
    public static void main(String[] args) {
        String equation;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter equation");
        equation = in.nextLine().trim();

        Stack<Integer> stack = new Stack<>();

        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char division = '/';

        int i = 0;

        while (equation.length() != 2) {

            if (equation.charAt(i) != plus || equation.charAt(i) != minus || equation.charAt(i) != multiply || equation.charAt(i) != division ) {
                int num = equation.charAt(i);
                stack.push(num);
                i++;
            } else if (equation.charAt(i) == plus) {
                stack.push(stack.pop() + stack.pop());//ADD
                i++;
            } else if (equation.charAt(i) == minus) {
                stack.push(stack.pop() - stack.pop()); //SUBTRACT
                i++;
            } else if (equation.charAt(i) == multiply) {
                stack.push(stack.pop() * stack.pop()); // MULTIPLY
                i++;
            } else if (equation.charAt(i) == division) {
                stack.push(stack.pop() / stack.pop()); // DIVISION
                i++;
            }
        }
        System.out.println("_________________________________");
        System.out.println("FINAL ANSWER "+stack.pop());


    }
}
