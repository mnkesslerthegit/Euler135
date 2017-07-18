package moreEulr;

/**
 * generate all possible arithmetic sequences * -all step sizes, starting from
 * smallest -all starting numbers, starting from smallest
 * 
 * @author MNK2060
 *
 */
public class euler135 {

	public static void main(String[] args) {

	}

	private static void test(int startPoint, int stepSize, int N) {

	}

	private int formula(int a, int b, int c) {
		int result = (a * a) - (b * b) - (c * c);
		if (result < 0) {
			System.out.println("negative result");
			System.exit(0);
		}
		return result;
	}

	private int formula(int start, int step) {
		return formula(start + (step * 2), start + (step), start);
	}

}
