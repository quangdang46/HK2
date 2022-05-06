import java.util.Scanner;

public class Nhap_Xuat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Moi ban nhap ho va ten:");
		String ten=sc.nextLine();
		System.out.println("Moi ban nhap tuoi:");
		int tuoi=sc.nextInt();
		System.out.println("Ten cua ban la:"+ten);
		System.out.println("Tuoi cua ban la:"+tuoi);
		
	}
}
