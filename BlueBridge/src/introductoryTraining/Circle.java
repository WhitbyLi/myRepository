package introductoryTraining;

import java.util.Scanner;

public class Circle {
	
	public static double getArea(int radius) {
		return Math.PI * radius * radius;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		if(r > 0 && r < 10001) {
			System.out.printf("%.7f", getArea(r));
		}
	}
}
