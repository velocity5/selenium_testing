package tutorial_java;
import java.util.Scanner;
public class prime_number {
	static boolean checkForPrime(int number) {
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	}
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check: ");
			int number = sc.nextInt();
			boolean isPrime = checkForPrime(number);
			if (isPrime) {
				System.out.println(number + " is a Prime");
			} else
				System.out.println(number + " is not a Prime");
			sc.close();
		}
	}