package org.example.tasks;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = "";
        char[] Acharmas = A.toCharArray();

        for (int i = Acharmas.length - 1; i >= 0; i--) {
            reversed = reversed + Acharmas[i];
        }

        System.out.println(A.equals(reversed) ? "Yes" : "No");

    }
}


