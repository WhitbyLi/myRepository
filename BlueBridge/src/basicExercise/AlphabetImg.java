package basicExercise;

import java.util.Scanner;

public class AlphabetImg {
	public static void getAlphabetImg(int n, int m) {
		char [] img =  new char[m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				img[j] = (char) ('A' + Math.abs(j-i));
			}
			System.out.println(img);
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int m, n;
		n = input.nextInt();
		m = input.nextInt();
		if(n>0 && m<27) {
			getAlphabetImg(n,m);
		}
	}
}
