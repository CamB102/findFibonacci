package algorithmday1;

public class CandyFeast {

	public static void main(String[] args) {
		int n = 15;
		int c = 3;
		int m = 2;

		int numCandies = candyFeast(n, c, m);
		System.out.println("Bobby can eat " + numCandies + " candies.");
	}

	public static int candyFeast(int n, int c, int m) {
		int numCandies = n / c; // number of candies Bobby can buy with initial money
		int wrappers = numCandies;
		while (wrappers >= m) {
			int freeCandies = wrappers / m; // number of free candies Bobby gets from wrappers
			numCandies += freeCandies; // add free candies to total count
			wrappers = wrappers % m + freeCandies; // update number of wrappers
		}
		return numCandies;
	}

}
