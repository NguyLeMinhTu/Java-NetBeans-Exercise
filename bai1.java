package trivinh.edu;



public class bai1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		try {
			int n = sc.nextInt();
			if (n >= 0) {
				System.out.println("Đây là số nguyên dương");
			} else {
				System.out.println("Đây là số nguyên âm");
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Bạn phải nhập một số nguyên hợp lệ.");
		} finally {
			sc.close();
		}
	}
}
