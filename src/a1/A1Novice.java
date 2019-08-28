package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int pop = scan.nextInt();
	

		for (int n=1; n<(pop+1); n++) {
			double cost = 0;
			char a = scan.next().charAt(0);
			String b = scan.next();
			int items = scan.nextInt();
			for (int x=0; x<items; x++) {
				int amount = scan.nextInt();
				scan.next();
				double c = scan.nextDouble();
				cost += amount*c;
			}
			System.out.printf("%c. %s: %.2f\n", a, b, cost);
		}
	}
}
