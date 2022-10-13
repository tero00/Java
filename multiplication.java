package multiplication;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {

		
		Scanner ans = new Scanner(System.in);
		boolean cont = true;
		String input;
		int streak = 0;
		long startTime = System.currentTimeMillis();
		long currentTime;
		long averageTime;
		long elapsedTime;
		int i = 0;
		boolean isint = true;
		
		while (cont == true) {
			int int1 = (int) (Math.random() * 10 + 1);
			int int2 = (int) (Math.random() * 10 + 1);
					
			System.out.println(int1 + " * " + int2 + "?");
			input = ans.nextLine();

			currentTime = System.currentTimeMillis();
			
			while (!input.matches("[0-9]+")) {
				System.out.println("only numbers pls, try again");
				input = ans.nextLine();
			}
			
			if (isint) {
				if	(Integer.valueOf(input) == int1 * int2) {
					System.out.println("Correct");
					streak++;
					elapsedTime = currentTime - startTime;
					averageTime = elapsedTime / streak;
					if (streak >= 3) {
						System.out.println("Your average time for the past " + streak + " calculations is " + averageTime + " milliseconds");
					}
				} else {
					System.out.println("Wrong");
					startTime = System.currentTimeMillis();
					streak = 0;
				}	
			}

		}	
		ans.close();
	}
	
}
