public class Sw7A {
	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 0;
		
		try {
			int result = number1/ number2;
			System.out.println("Result:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Built-in Exceptions: Cannot divide by the zero");
		}
		
		System.out.println("Program continues running...");
		
	}
}
