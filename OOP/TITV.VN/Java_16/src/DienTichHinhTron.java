import java.util.Scanner;

public class DienTichHinhTron {
	public static void main(String[] args) {
		double r,s,cv;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron:");
		r=sc.nextDouble();
		s=Math.PI*Math.pow(r,2);
		cv=2*Math.PI*r;
		System.out.println("Dien tich hinh tron:"+s);
		System.out.println("Chu vi hinh tron:"+cv);

	}
}
