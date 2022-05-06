import java.util.Scanner;

public class Pt_BacHai {
	public static void main(String[] args) {
		double a,b,c,denta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a b c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		denta=Math.pow(b,2)-4*a*c;
		if (denta<0) {
			System.out.println("Pt vo nghiem");
		}else if(denta==0) {
			System.out.println("Pt co nghiem duy nhat x="+-b/2*a);
		}else {
			double x1=(-b+Math.sqrt(denta))/(2*a);
			double x2=(-b-Math.sqrt(denta))/(2*a);	
			System.out.println("Pt co 2 nghiem phan biet:x1="+x1+" x2="+x2);
		}
	}
}
