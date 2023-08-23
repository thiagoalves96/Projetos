package FizzBuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("FizzBuzz");
			} else if (String.valueOf(i).startsWith("5") && String.valueOf(i).endsWith("3")) {
				System.out.println("BuzzFizz");
			} else if (String.valueOf(i).startsWith("3") && String.valueOf(i).endsWith("5")) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0 || String.valueOf(i).endsWith("5")) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 || String.valueOf(i).endsWith("3")) {
				System.out.println("Fizz");
			} else if (i % 3 == 0 || String.valueOf(i).startsWith("5")) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 || String.valueOf(i).startsWith("3")) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
