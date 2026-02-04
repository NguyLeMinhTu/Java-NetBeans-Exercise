package trivinh.edu;

import java.util.Scanner;

public class bai17 {
	   public static void main(String[] args)
	   {
	      String chuoi;
	      char kiTu;
	      boolean tonTai = false;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Nhập vào một chuỗi: ");
	      chuoi = sc.nextLine();
	      System.out.println("Nhập vào ký tự muốn kiểm tra:");
	      kiTu = sc.nextLine().charAt(0);

	      char mangKiTu[] = chuoi.toCharArray();
	      for (int i = 0; i < mangKiTu.length; i++)
	      {
	         if (kiTu == mangKiTu[i])
	         {
	            System.out.println((i+1));
	            tonTai = true;
	         }
	      }
	      if(tonTai == false)
	         System.out.println("Không tồn tại trong chuỗi");
	   }

}
