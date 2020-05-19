package guessthenumber;
import java.util.Random;
import java.util.Scanner;

public class numberclass {

	public static void main(String[] args) {
		Random ran_num = new Random();
		Scanner input_scan = new Scanner(System.in);
		int guess;
		
		int number = ran_num.nextInt(20) + 1; //choosing a random number between 1-100
		
		//System.out.println("The number is "+number); //double checking if the output is correct
		System.out.println("Guess an integer between 0 and 20");
		guess = input_scan.nextInt();
		
		//note that if you use a do-while loop your first output will always say u are wrong even if you guess the correct number
		// the same happens for while loops
		while(guess != number) 
		{
			System.out.println("Your guess is wrong, input your next guess");
			guess = input_scan.nextInt();
		}
		//if (guess==number)
		System.out.println("Congratulations you got the correct number!");
		

	}

}
