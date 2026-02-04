package trivinh.edu;

import java.util.Scanner;

public class bai19 {
	public static void main(String[] args)
	   {
	      String chuoi;
	      int soLan = 0;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Nhập vào một chuỗi: ");
	      chuoi = sc.nextLine();

	      char mangKiTu[] = chuoi.toCharArray();
	      for (int i = 0; i < mangKiTu.length; i++)
	      {
	         if ('a' == mangKiTu[i])
	         {
	            soLan++;
	         }
	      }
	      System.out.println(soLan);
	   }


}
