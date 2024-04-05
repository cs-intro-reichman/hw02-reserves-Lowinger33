/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int i = 1;
		int j = 1;
		while (i <= a) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			while (j <= a) {
				if (j > 1) {
					System.out.print(" ");
				}
				System.out.print("*");
				if (j == a && i % 2 == 1) {
					System.out.print(" ");
				}
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
	}
}
