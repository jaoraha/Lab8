//Title: 		Lab 7
//Author: 		John Aoraha
//Date: 		05/1/2018

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			String[] names = { "Michael", "Julie", "Jonah", "Brent", "Ben", "Alli", "John", "Tim", "Vicky",
					"Julhasur", "Anthony" };
			String[] hometown = { "New York", "Los Angeles", "Chicago", "Houston", "Philadelphia", "Phoenix",
					"San Antonio", "San Diego", "Dallas", "San Jose", "Austin" };
			String[] food = { "cheeseburger", "hot dogs", "philly cheese steak", "nachos", "pizza", "steak", "cookies",
					"pie", "salad", "wings", "popcorn" };

			Scanner scan = new Scanner(System.in);
			
			int userNum = getInt(scan, "Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-11): ");
			int index = userNum - 1;

			if (userNum < 1 || userNum > 11) {
				System.out.println();
				System.out.println("The number " + userNum + " is not in the range of 1 to 11!");
				continue;
			} else {

				System.out.println("Student " + userNum + " is " + names[index] + ". What would you like to know about "
						+ names[index] + "? (enter \"hometown\" or \"favorite food\"): ");

				String homeFood = scan.nextLine();

				if (homeFood.equalsIgnoreCase("hometown")) {
					System.out.println(
							names[index] + " is from " + hometown[index] + ". Would you like to know more? (y/n)");
				} else if (homeFood.equalsIgnoreCase("favorite food")) {
					System.out.println(names[index] + "'s favorite food is " + food[index]
							+ ".  Would you like to know more? (y/n)");
				} else {
					System.out.println("That data does not exist.  Please try again.");
					continue;

				}
			}
			cont = scan.next();
		}
		System.out.println("Good bye!");
	}
	
    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
	}
}
