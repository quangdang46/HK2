import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Function fd=new Function();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap 2 so a va b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Tong 2 so a va b:"+fd.Sum2So(a, b));
		System.out.println("Max 2 so a va b:"+fd.Max2So(a, b));
		int arr[]=new int[] {1,2,3,4,5,6};
		System.out.println("Sum cua mang:"+fd.TongArr(arr));
		System.out.println("So sanh 2 so:"+fd.CheckLonHon(a, b));
	}
}
