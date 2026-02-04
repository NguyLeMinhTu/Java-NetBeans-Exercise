package trivinh.edu;

import java.util.Scanner;

public class bai8 {
	   public static void main(String[] args)
	   {
	      int n;
	      boolean soNguyenTo = false;
	      System.out.println("Nhập vào số nguyên:");
	      Scanner sc = new Scanner(System.in);

	      n = sc.nextInt();

	      // 1, 2 là 2 số nguyên tố mặc nhiên, không cần xét.
	      System.out.print("1 2 ");
	      for (int i = 3; i <= n; i++) // duyệt tất cả phần tử từ 1-20
	      {  
	         /**
	          * Gán cho soNguyenTo đúng
	          * Nếu sau khi ra khỏi vòng lặp j
	          * mà nó vẫn còn là true thì số này là số nguyên tố
	          */
	         soNguyenTo = true; 
	         for (int j = 2; j < i; j++)
	         {
	            if (i % j == 0)
	               /**
	                * Gán cho soNguyenTo là false
	                * khi nó chia hết nó bất cứ số nào nhỏ hơn
	                * nó trong khoảng từ 3 - n
	                */
	               soNguyenTo = false;
	         }
	         if (soNguyenTo == true)
	            System.out.print(i + " ");
	      }
	   }

}
