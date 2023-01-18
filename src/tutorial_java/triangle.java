import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print: ");
        int h = sc.nextInt();
        int i, j; // define 2 sides of triangle
        for (i = 1; i <= h; i++) {
            // loop and print space between rows
            for (j = h; j >= i; j--) {
                System.out.print(" ");
                 //System.out.print(""); // this line will turn normal triangle into square triangle
            }
            // loop and print star for each rows
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
        //sc.close();
        }
    }