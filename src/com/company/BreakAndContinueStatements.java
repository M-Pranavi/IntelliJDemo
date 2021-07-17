package com.company;

import java.util.Scanner;

public class BreakAndContinueStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) { //while using boolean make sure to have a break statement otherwise u will end up with an infinite loop that executes forever and never termnates.
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
