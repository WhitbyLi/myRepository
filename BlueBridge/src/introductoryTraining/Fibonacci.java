package introductoryTraining;

import java.util.Scanner;

public class Fibonacci {
	public static int getRemainder(int n) {
		int remainder = 1;
		int x = 1;
		int y = 1;
		while(n > 2) {
			remainder = x + y;
			x = y;
			if(remainder > 10007) {
				remainder = remainder - 10007;
			}
			y = remainder;
			n--;
		}
		return remainder;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n > 0 && n < 1000001) {
			System.out.println(getRemainder(n));
		}
		else
			System.out.println("error");
	}
}
