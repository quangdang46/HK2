import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a:");
		a=sc.nextInt();
		if (a>0){
			System.out.println("La so duong");
		}else if(a<0) {
			System.out.println("La so am");
		}else {
			System.out.println("La so 0");
		}
	}
}
