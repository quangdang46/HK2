import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		SoHoc sh=new SoHoc(0,0);
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap 2 so a va b:");
		a=sc.nextInt();
		b=sc.nextInt();
		sh.inputInfo(a,b);
		sh.printInfo();
		System.out.println("Cong:"+sh.addition());
		System.out.println("Tru:"+sh.subtract());
		System.out.println("Nhan:"+sh.multi());
		System.out.println("Chia:"+sh.division());
	}
}
