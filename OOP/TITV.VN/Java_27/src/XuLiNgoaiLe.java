import java.util.Scanner;

public class XuLiNgoaiLe {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap n=");
		n=sc.nextInt();
		try {
			System.out.println("Gia tri 1/n="+1/(float)n);
		}catch(Exception asException){
			System.out.println("Bi loi");
		}finally {
			System.out.println("Haahahhaah");
		}
	}
}
