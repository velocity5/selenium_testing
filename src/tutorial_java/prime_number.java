package tutorial_java;

public class prime_number {

	public static void main(String[] args) {
		int number = 32;
		boolean temp = false;
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				temp = true;
				break;
			}
		}
		if (!temp)
			System.out.println(number + " is Prime");
		else
			System.out.println(number + " is not a Prime");
	}
}