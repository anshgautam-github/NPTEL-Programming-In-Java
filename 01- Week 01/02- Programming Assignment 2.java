// Write a Java program to calculate the volume of a cylinder given its radius and height.
// Formula:V=π×r2×h
// You can use Math.PI for the computation.
import java.util.Scanner;

public class W01_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

// Calculate the volume
      
// Display the result
    System.out.printf("Volume is: %.2f", volume);
    in.close();
  }
}

//                  SOLUTION->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// Calculate the volume
		double volume=Math.PI*radius*radius*height;    //if we use , 3.14 then we won't get the accurate answer
