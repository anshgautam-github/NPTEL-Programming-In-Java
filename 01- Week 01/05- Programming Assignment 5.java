// Write a program which will print a pattern of "*" 's of height "n".
// For example:
// Input:
//                n = 3
// Output:
//                ***
//                **
//                *
//                **
//                ***

// NOTE:
// Print the pattern EXACTLY, without extra spaces.


import java.util.*;
public class W01_P5{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
      // Add the necessary code in the below space
     // Print the top-down pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the bottom-up pattern
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
inr.close();
    }
}
