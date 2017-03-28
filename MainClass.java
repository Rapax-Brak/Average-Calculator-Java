import java.util.Scanner;

public class MainClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int number;
		int average;
		int counter = 0;
		int numbers = 0;
		System.out.println("How many numbers are there");
		numbers = input.nextInt();
		
		while (counter < numbers){
			System.out.println("Input number "+ counter + ": ");
			number = input.nextInt();
			total = total + number;
			counter++;
		}
		average = total/10;
		System.out.println("Average = "+ average);
	}

}
