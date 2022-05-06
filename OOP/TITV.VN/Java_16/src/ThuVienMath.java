import java.util.Scanner;
public class ThuVienMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		// Ham tri tuyet doi
		System.out.println("|a|= " + ThuVienMath.abs(a));
		
		// Ham tim min
		System.out.println("min(a, b) = " + ThuVienMath.min(a,b));
		
		// Ham tim max
		System.out.println("max(a, b) = " + ThuVienMath.max(a, b));
	
		// Ham  ceil
		System.out.println("ceil(a) = " + ThuVienMath.ceil(a));
		
		// Ham  floor
		System.out.println("floor(a) = " + ThuVienMath.floor(a));
		
		// Ham  can bac hai sqrt
		System.out.println("sqrt(a) = " + ThuVienMath.sqrt(a));
		
		// Ham tinh a^b
		System.out.println("a^b = " + ThuVienMath.pow(a, b));
	}
}