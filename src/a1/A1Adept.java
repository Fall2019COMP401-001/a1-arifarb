package a1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int choiceamount = scan.nextInt();
		String[] itemname = new String[choiceamount];
		double[] itemcost = new double[choiceamount];
		for (int i=0; i<choiceamount; i++) {
			itemname[i] = scan.next();
			itemcost[i] = scan.nextDouble();
		}
		int population = scan.nextInt();
		String[] peoplename = new String[population];
		double[] peoplespent = new double[population];


		for (int i=0; i<population; i++) {
			peoplename[i] = scan.next() + " " + scan.next();
			int howmanytotal = scan.nextInt();
			int howmanyspecific = 0;
			for (int x=0; x<howmanytotal; x++) {
				howmanyspecific = scan.nextInt();
				peoplespent[i] = peoplespent[i] + (howmanyspecific * itemcost[matchitem(scan.next(), itemname)]);
			}
		}
		System.out.printf("Biggest: %s (%.2f)\n", peoplename[largest(peoplespent)], peoplespent[largest(peoplespent)]);
		System.out.printf("Smallest: %s (%.2f)\n", peoplename[smallest(peoplespent)], peoplespent[smallest(peoplespent)]);
		System.out.printf("Average: %.2f", average(peoplespent));
	}
	static int largest(double[] input) {
		double temp_largest = 0;
		int biggest = 0;
		for (int i=0; i<input.length; i++) {
			if (input[i]>temp_largest) {
				temp_largest = input[i];
				biggest = i;
			}
		}
		return biggest;
			
	}
	static int smallest(double[] input) {
		double temp_smallest = 1000;
		int tinyest = 0;
		for (int i=0; i<input.length; i++) {
			if (input[i]<temp_smallest) {
				temp_smallest = input[i];
				tinyest = i;
			}
		}
		return tinyest;
	}
	static double average(double[] input) {
		double temp_total = 0.0;
		for (int i=0; i<input.length; i++) {
			temp_total += input[i];
		}
		double rounding = (temp_total/input.length);
		rounding = Math.round(rounding * 100.0) / 100.0;
		
		return rounding;
	}
	static int matchitem(String iteminput, String[] itemname) {
		for (int i=0; i<itemname.length; i++) {
			if (iteminput.equals(itemname[i])) {
				return i;
			}
		}
		System.out.println("can't match item");
		return 0;
	}

}
