import java.util.Scanner;

//Bài 5. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
public class Bai4 {
	public static int input() {
		int n=0;
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		while(check==false) {
			System.out.println(" ");
			try {
				n=sc.nextInt();
				check=true;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ban vua nhap khong phai so!!");
				sc.nextLine();
			}
		}
		return n;
	}
	
	public static boolean Check(int n) {
		return n>2;
	}
	
	public static boolean snt(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n;
		n=input();
		if(Check(n)) {
			for(int i=2;i<n;i++) {
				if(snt(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}
}
