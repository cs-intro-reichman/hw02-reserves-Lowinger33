/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		String s = (args[0]);
		String reverse = "";
		int i = s.length() - 1;
		int middle;
		if (s.length() % 2 == 1) {
			middle = (s.length() / 2);
		} else {
			middle = (s.length() / 2) - 1;
		}
		while (i >= 0) {
			reverse = reverse + s.charAt(i);
			i = i - 1;
		}
		System.out.println(reverse);
		System.out.println("The middle character is " + s.charAt(middle));
	}
}