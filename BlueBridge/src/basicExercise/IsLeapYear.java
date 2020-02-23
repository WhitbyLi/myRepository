package basicExercise;

import java.util.Scanner;

public class IsLeapYear {
	public static boolean isLeapYear(int y) {
		if(y%4==0 && y%100!=0)
			return true;
		else if(y%400==0)
			return true;
		else return false;
	}
	/*public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		if(y>1989 && y< 2051) {
			if(isLeapYear(y))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}*/
	
	public static void main(String args[]) {
		for(int i=0; i<32; i++) {
			String binary = Integer.toBinaryString(i);
			String s = String.format("%05d", Integer.parseInt(binary));
			System.out.println(s);
		}
	}
}
