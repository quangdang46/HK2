import java.util.Scanner;

public class Pt_BacNhat {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a:");
		a=sc.nextInt();
		System.out.println("Nhap b:");
		b=sc.nextInt();
		if (a==0) {
			if (b==0) {
				System.out.println("Pt vo so nghiem");
			}else {
				System.out.println("Pt vo nghiem");
			}
		}else {
			System.out.println("Pt co nghiem duy nhat:x="+-(float)b/a);
		}
	}
}
