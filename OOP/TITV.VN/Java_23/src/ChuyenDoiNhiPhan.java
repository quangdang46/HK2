import java.util.Scanner;

public class ChuyenDoiNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so can chuyen doi:");
		n=sc.nextInt();
		String nhiphan="";
		while(n!=0) {
			nhiphan=n%2+nhiphan;
			n/=2;
		}
		System.out.println("Sau khi chuyen doi:"+nhiphan);
	}
}
