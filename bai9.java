package trivinh.edu;

import java.util.Scanner;

public class bai9 {
	public int CalculateFi(int n)
	   {
	      if (n == 0 || n == 1){
	         return 1;
	      } 
	      return CalculateFi(n-1) + CalculateFi(n-2);
	   }

}


