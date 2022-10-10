package day6problems;

import java.util.Scanner;

public class FibonacciSeries {
	 public static void main(String[] args) {
	        fibonacciSeriesFunction();


	    }
	    public static void fibonacciSeriesFunction(){
	        int num1,num2 ,nextterm, i  ,n;
	        Scanner scanobj = new Scanner(System.in);
	        System.out.println("Enter the total number of the series : ");
	        n = scanobj.nextInt();
	        System.out.println("Enter the first term of the series =");
	        num1 = scanobj.nextInt();
	        System.out.println("Enter the Second term of the series =");
	        num2 = scanobj.nextInt();
	        System.out.println(num1);
	        System.out.println(num2);
	        for(i =2 ; i <= n ; i++){
	            nextterm = num1 + num2 ;
	            System.out.println(" "+ nextterm);
	            num1 = num2 ;
	            num2 = nextterm;
	            
	        scanobj.close();
	        }

	    }
}
