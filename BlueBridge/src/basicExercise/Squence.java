package basicExercise;

import java.util.Scanner;

public class Squence {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int min, max, sum, m;
		max = -2147483648;
		min = 2147483647;
		sum = 0;
		for(int i=0; i<n; i++) {
			m = input.nextInt();
			sum += m;
			if(m < min) {
				min = m;
			}
			if(m > max) {
				max = m;
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
