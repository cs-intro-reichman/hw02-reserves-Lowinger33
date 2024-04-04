
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		boolean girl = false;
		boolean boy = false;
		String s = "";
		int i = 0;
		while (boy == false || girl == false) {
			double x = Math.random();
			if (x > 0.5) {
				s = (s + "b ");
				boy = true;
			} else {
				s = (s + "g ");
				girl = true;
			}
			i++;
		}
		System.out.println(s);
		System.out.println("You made it... and you now have " + i + " children.");
	}
}
