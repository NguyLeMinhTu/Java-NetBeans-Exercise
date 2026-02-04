package trivinh.edu;

import java.util.Scanner;

public class bai13 {
	   public static void main(String[] args)
	   {
	      int n;
	      int[] soNguyen;
	      int min = 0;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Nhập vào n:");
	      n = sc.nextInt();
	      soNguyen = new int[n];
	      for (int i = 0; i < n; i++)
	      {
	         System.out.println("Nhập vào số nguyên:");
	         soNguyen[i] = sc.nextInt();
	      }

	      min = soNguyen[0];

	      for (int i = 0; i < n; i++)
	      {
	         if(soNguyen[i] < min)
	         min = soNguyen[i];
	      }

	      System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
	   }

}
