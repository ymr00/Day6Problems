package day6problems;

import java.util.Scanner;

public class ReverseNumber {
	 public static void main(String[] args) {

	        Scanner scanobj = new Scanner(System.in) ;

	            System.out.println("Enter the  number = ");

	            int number = scanobj.nextInt();
	            int reverseNum =0;
	            while (number!=0) {
	                int r = number%10;
	                reverseNum = reverseNum*10 + r;
	                // number = number/10;
	                number /=10;

	            }
	            scanobj.close();
	            System.out.println(" the reverse number = " + reverseNum);
	        }

}
