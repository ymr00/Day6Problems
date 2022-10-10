package day6problems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        int checkcount = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the number to check  Prime Number or not : ");

        int number = scanobj.nextInt();
        if (number == 0 || number == 1)
            System.out.println(number + " is not a Prime number");
        else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    checkcount = 1;
                    break;
                }
                
            scanobj.close();
            }
            if (checkcount == 0)
                System.out.println(number + " is  a Prime number");
            else
                System.out.println(number + " is  not a Prime number");
        }

    }

}
