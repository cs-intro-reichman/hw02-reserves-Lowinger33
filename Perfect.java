/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int i = 1;
		int check = 0;
		String perfect = (a + " is a perfect number since " + a + " = 1");
		while (i < a) {
			if (a % i == 0) {
				check = check + i;
				if (i > 1) {
					perfect = perfect + (" + " + i);
				}
			}
			i++;
		}
		if (check != a) {
			System.out.println(a + " is not a perfect number");
		}
		if (check == a) {
			System.out.println(perfect);
		}
	}
}
