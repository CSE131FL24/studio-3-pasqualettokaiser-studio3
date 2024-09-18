package studio3;


import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("How many numbers do we check?");
		
		int n = in.nextInt();
		boolean[] numbers = new boolean[n + 1];
		Arrays.fill(numbers, true);
		
		
		
		for (int i = 2; i < n/2+1; i++) {
			numbers[2*(i)] = false;
		}
		for (int i = 2; i < n/3+1; i++) {
			numbers[3*(i)] = false;
		}
		for (int i = 2; i < n/5+1; i++) {
			numbers[5*(i)] = false;
		}
		for (int i = 2; i < n/7+1; i++) {
			numbers[7*(i)] = false;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(numbers[i] + " " + i);
		}
		
		for (int i = 0; i < n; i++) {
			if (numbers[i]) {
				System.out.print(" " + i);
			}
		}
		

	}

}
