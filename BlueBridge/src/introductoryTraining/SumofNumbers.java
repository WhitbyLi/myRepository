package introductoryTraining;

import java.util.Scanner;

public class SumofNumbers {
	public static long getSum(long n) {
		return (n + 1) * n / 2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		if(n > 0 && n < 1000000001) {
			System.out.println(getSum(n));
		}
	}

}
