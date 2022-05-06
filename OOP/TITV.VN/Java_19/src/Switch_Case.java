import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a");
		a=sc.nextInt();
		switch (a) {
			case 1:{
				System.out.println("Mot");
				break;
			}
			case 2:{
				System.out.println("Hai");
				break;
			}
			default:
				System.out.println("Moi ban nhap lai");
			}
	}
}
