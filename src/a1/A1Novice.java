package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int pop = scan.nextInt();
	
		int items = 0;
		for (int n=0; n<pop; n++) {
			double cost = 0;
			char a = scan.next().charAt(0);
			String b = scan.next();
			items = scan.nextInt();
			for (int x=0; x<items; x++) {
				int number = scan.nextInt();
				cost += number*scan.nextDouble();
			}
			System.out.println(a + ". " + b + ": " + cost);
		}
	}
}
