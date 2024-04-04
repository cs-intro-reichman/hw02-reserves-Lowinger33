/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		int max = 0;
		int next = (int) (Math.random() * 10);
		while (next >= max) {
			max = next;
			System.out.print(next + " ");
			next = (int) (Math.random() * 10);
		}
	}
}
