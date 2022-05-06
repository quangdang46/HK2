import java.util.Scanner;

public class KtSoNgayMotThang {
	public static void main(String[] args) {
		int thang;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap thang");
		thang=sc.nextInt();
		switch(thang) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:{
				System.out.println("Thang co 31 ngay!");
				break;
			}
			case 4:case 6:case 9:case 11:{
				System.out.println("Thang co 30 ngay!");
				break;
			}
			case 2:{
				int nam;
				System.out.println("Moi ban nhap them nam:");
				nam=sc.nextInt();
				if((nam%4==0 && nam%100!=0 )|| nam%400==0) {
					System.out.println("Thang co 29 ngay!");
				}else {
					System.out.println("Thang co 28 ngay!");
				}
				break;
			}
			default:{
				System.out.println("Moi ban nhap thang hop le!!");
			}
		}
	}
}
