package question5;

import java.util.List;
import java.util.Scanner;

	public class TestFive {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Pizza obj=new Pizza ();
	        try (Scanner sc = new Scanner (System.in)) {
				System.out.println("Enter the City from the following");
				System.out.println();
				System.out.println("chandigarh , dehradun , rohtak , delhi , banglore ");
				String place=sc.nextLine();
				List<String>shops= obj. getPizzaShop(place);
				System.out.println(shops);
				System.out.println();
				System.out.println("Enter the Restraunt from above for address details:");
				String Restrau=sc.nextLine();
				System.out.println();
				String location=obj.location(Restrau);
				System.out.println(location);
			}

		}

	}
	 
