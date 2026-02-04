package trivinh.edu;

import java.util.Scanner;

public class bai92 {

	   public static void main(String[] args)
	   {
	      int n;
	      int Fi;
	      System.out.println("Nhập vào số nguyên:");
	      Scanner sc = new Scanner(System.in);

	      n = sc.nextInt();

	      bai9 fibonacci = new bai9();
	      Fi = fibonacci.CalculateFi(n);

	      System.out.println("Fi(" + n + ") = " + Fi);
	   }
	
}
