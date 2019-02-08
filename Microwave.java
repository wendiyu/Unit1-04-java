/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 07 2019
 * Created for: ICS4U
 * This program tells the user the time that Microwave need to heat a sub, 
 * pizza or soup according to the portions they choose
 *
 ****************************************************************************/

import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		
        double time = 0;
        
        // property
        double subTime = 1;
        double pizzaTime = 0.75;
        double soupTime = 1.75;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you heating a sub, pizza, or soup?");
		String food = scanner.nextLine();
		
		if (food.equals("sub") || food.equals("pizza") || food.equals("soup")) {
			System.out.println("How many " + food + " are you heating?");
			int porition = scanner.nextInt();
			scanner.close();
			
			if(porition == 1 && food.equals("sub")) {
				time = subTime * 1;
			}
			else if (porition == 1 && food.equals("pizza")) {
				time = pizzaTime * 1;
			}
			else if (porition == 1 && food.equals("soup")) {
				time = soupTime * 1;
			}
			else if(porition == 2 && food.equals("sub")) {
				time = subTime * 1.5;
			}
			else if (porition == 2 && food.equals("pizza")) {
				time = pizzaTime * 1.5;
			}
			else if (porition == 2 && food.equals("soup")) {
				time = soupTime * 1.5;
			}
			else if(porition == 3 && food.equals("sub")) {
				time = subTime * 2;
			}
			else if (porition == 3 && food.equals("pizza")) {
				time = pizzaTime * 2;
			}
			else if (porition == 3 && food.equals("soup")) {
				time = soupTime * 2;
			}
			
			//Test the number is greater then 3 or not 		
			if(porition > 3) {
			    System.out.println("You can only put 3 items in the microwave! ");
			}
			else {
				System.out.println("The total time is " + time + " minutes");
			}
		}
		else {
			System.out.println("Invaild input! Please, enter one of options above. ");
		}
		
	}

}
