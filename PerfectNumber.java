package day6problems;

import java.util.Scanner;

public class PerfectNumber {
	 public static void main(String[] args) {
	        Scanner scanobj = new Scanner(System.in);
	    int sum = 0 , i;
	        System.out.println("Enter the number to check  Perfect number or not : ");

	        int number = scanobj.nextInt();

	            for (i=1;i<number;i++) {
	                if (number % i == 0) {
	                    System.out.print(i + " ");
	                    System.out.println();
	                    sum = sum + i;
	                }
	                
	           scanobj.close();

	            }
	            if (sum == number)
	                System.out.println(number + " is Perfect number");
	            else
	                System.out.println(number + " is not a Perfect number");

	    }

}
