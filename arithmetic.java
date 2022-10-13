package arithmetic;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		String[] typeArray = {"sum", "sub", "mult", "div", "exp", "root"};
		System.out.println("Welcome to the practise program for basic arithmetic");
		
		System.out.println("How hard do you want the calculations to be? (easy, medium, hard)");
		Scanner sc = new Scanner(System.in);
		Scanner answ = new Scanner(System.in);
		
		int maxNum = 1;
		while (maxNum == 1) {
			String diff = sc.nextLine();
			if (diff.matches("easy")) {
				maxNum = 10;
			} else if (diff.matches("medium")) {
				maxNum = 30;
			} else if (diff.matches("hard")) {
				maxNum = 100;
			} else {
				System.out.println("Easy, medium or hard please");
			}
		}
		
		System.out.println("Your time starts now");
		int startTime = (int) System.currentTimeMillis();
		int flex;
		int correctAns = 0;
		boolean wrong = true;
		int loop = 0;
		while (loop < 30) {
			loop++;
			String calctype = typeArray[(int) (Math.random() * 6)];
			int int1 = (int) (Math.random() * maxNum + 1);
			int int2 = (int) (Math.random() * maxNum + 1);
			
			if (calctype == "sum") {
				flex = (int) (Math.random() * (maxNum / 2) + 1);
				int1 = int1 * flex;
				flex = (int) (Math.random() * (maxNum / 2) + 1);
				int2 = int2 * flex;
				System.out.println(int1 + " + " + int2 + "?");
				correctAns = int1 + int2;
			} else if (calctype == "sub") {
				flex = (int) (Math.random() * (maxNum / 2) + 1);
				int1 = int1 * flex;
				flex = (int) (Math.random() * (maxNum / 2) + 1);
				int2 = int2 * flex;
				if (int1 <= int2) {				
					System.out.println(int2 + " - " + int1 + "?");
					correctAns = int2 - int1;
				} else {		
					System.out.println(int1 + " - " + int2 + "?");
					correctAns = int1 - int2;
				}
			} else if (calctype == "mult") {
				System.out.println(int1 + " * " + int2 + "?");
				correctAns = int1 * int2;	
			} else if (calctype == "div") {
				flex = int1 * int2;
				System.out.println(flex + " / " + int2 + "?");
				correctAns = flex / int2;
			} else if (calctype == "exp") {
				flex = int2 / 4;
				System.out.println(int1 + " ^ " + flex + "?");
				correctAns = (int) Math.pow(int1, flex);
			} else {
				flex = (int1) * (int1);
				System.out.println("sqrt of " + flex + "?");
				correctAns = int1;
			}
			while (wrong) {
				String ans = answ.nextLine();
				if (ans.matches("[0-9]+")) {
					if (Integer.valueOf(ans) == correctAns) {
						System.out.println("Correct");
						break;
					} else {
						System.out.println("Try again");
					}
				} else {
					System.out.println("Expected a number, try again");
				}
				
			}
		
		}
		int endTime = (int) System.currentTimeMillis();
		int spentTime = endTime - startTime;
		System.out.println("You correctly answered 30 calculations in " + spentTime/1000 + " seconds");
		System.out.println("Restart the program to try again");
		sc.close();
		answ.close();
	}
}


