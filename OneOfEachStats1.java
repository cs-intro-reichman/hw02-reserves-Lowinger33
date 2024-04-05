
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		int two = 0;
		int three = 0;
		int more = 0;
		int sum = 0;
		String common = "";
		int T = Integer.parseInt(args[0]);
		int j = 1;
		int i = 0;
		while (j <= T) {
			boolean girl = false;
			boolean boy = false;
			i = 0;
			while (boy == false || girl == false) {
				double x = Math.random();
				if (x >= 0.5) {
					boy = true;
				} else {
					girl = true;
				}
				i++;
			}
			if (i == 2) {
				two++;
			}
			if (i == 3) {
				three++;
			}
			if (i > 3) {
				more++;
			}
			sum = sum + i;
			j++;
		}
		if (two >= three && two >= more) {
			common = common + "The most common number of children is 2.";
		}
		if (three > two && three >= more) {
			common = common + "The most common number of children is 3.";
		}
		if (more > two && more > three) {
			common = common + "The most common number of children is 4 or more.";
		}
		double avg = sum / T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + more);
		System.out.println(common);
	}
}
