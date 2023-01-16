import java.util.Scanner;
public class prime_number_while {
    static boolean checkForPrime(int number) {
        int i = 2;
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
            return isPrime;
        } else {
            while (i <= number/2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int number = sc.nextInt();
        boolean flag = checkForPrime(number);
        if (flag)
            System.out.println(number + " is a Prime");
        else
            System.out.println(number + " not a Prime");
        sc.close();
    }
}
