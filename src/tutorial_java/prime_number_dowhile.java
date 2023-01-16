import java.util.Scanner;
public class prime_number_dowhile {
    static boolean checkForPrime(int number) {
        int i = 2;
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
            return isPrime;
        } else {
            do {
                if (number % i == 0) {
                    isPrime = false;
                    return isPrime;
                }
                break;
            } while (i <= number / 2);
            return isPrime;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int number = sc.nextInt();
        boolean isPrime = checkForPrime(number);
        if (isPrime)
            System.out.println(number + " is a Prime");
        else
            System.out.println(number + " is not a Prime");
        sc.close();
    }
}
