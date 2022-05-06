import java.util.Scanner;

public class VongLapDoWhile {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Moi ban nhap n>0");
			n=sc.nextInt();
		}while(n<=0);
		if(n%2==0) {
			System.out.println("SO CHAN");
		}else {
			System.out.println("SO LE");
		}
	}
}
