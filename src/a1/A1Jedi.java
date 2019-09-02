package a1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int choiceamount = scan.nextInt();
		String[] itemname = new String[choiceamount];
		int[] itemcustomer = new int[choiceamount];
		int[] itemtotal = new int[choiceamount];
		for (int i=0; i<choiceamount; i++) {
			itemname[i] = scan.next();
			scan.nextDouble();
		}
		int peopleamount = scan.nextInt();
		for (int i=0; i<peopleamount; i++) {
			scan.next();
			scan.next();
			int list_length = scan.nextInt();
			Set<Integer> purchasedItems = new HashSet<>();
			for (int x=0; x<list_length; x++) {
				int temp_amount=scan.nextInt();
				int temp_spot = matchitem(scan.next(), itemname);
				purchasedItems.add(temp_spot);
				itemtotal[temp_spot] += temp_amount;
			}
			purchasedItems.forEach( spots -> {
				itemcustomer[spots] += 1;
			});
		}
		for (int i=0; i<itemname.length; i++) {
			if (itemcustomer[i]==0) {
				System.out.println("No customers bought " + itemname[i]);
			} else {
				System.out.println(itemcustomer[i] + " customers bought " + itemtotal[i] + " " + itemname[i]);
			}
			
		}
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
