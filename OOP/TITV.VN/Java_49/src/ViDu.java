import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------");
		
		// Hàm length() => lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();
		
		// Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
		char arr[]=new char[10];
		s.getChars(0,3,arr,0);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		có 3 cách, lấy ra giá trị của các ký tự thành một mảng
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
//https://www.youtube.com/watch?v=QwlKlzMmR8Y