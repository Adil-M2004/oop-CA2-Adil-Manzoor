package org.example;

import java.io.*;
import java.util.*;

/**
 * Name:
 * Class Group:
 */

public class Question3 {

    public static boolean validate(String filename) throws FileNotFoundException {
        // Stack to store opening tags
        Stack<String> stack = new Stack<>();
        // Read the file
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String tag = scanner.next();  // Read the next tag
            // Check if the tag is an opening tag
            if (tag.startsWith("<") && !tag.startsWith("</") && !tag.equals("<br>")) {
                stack.push(tag);  // Push opening tag to the stack
            }
            // Check if the tag is a closing tag
            else if (tag.startsWith("</")) {
                // If stack is empty or tags don't match, it's invalid
                if (stack.isEmpty() || !stack.peek().equals(tag.replace("</", "<"))) {
                    return false;
                }
                stack.pop();  // Pop the matching opening tag from the stack
            }
            // Handle <br> tag (self-closing)
            else if (tag.equals("<br>")) {
                continue;  // No action required for <br> tags
            }
        }
//        scanner.close();
        // If the stack is empty, all tags were matched properly
        return stack.isEmpty();
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Files to test
        String[] files = {"tags_valid.txt", "tags_in" +
                "valid.txt"};//Names of the two files
        for (String fName : files) {//CHECKS EACH OF THE FILES
            System.out.print(fName + ": ");
            if (validate(fName)) {
                System.out.println("This file is valid");
            } else {
                System.out.println("This file is invalid");
            }
        }
    }
}