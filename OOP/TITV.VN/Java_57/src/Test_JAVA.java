import java.util.Scanner;

public class Test_JAVA {

	public static int Random() {
		return (int) (Math.random() * 6) + 1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap tai khoan nguoi dung:");
		double user = input.nextDouble();
		/*
		 * Một người chơi sẽ có tài khoàn. Người chơi có quyền đặt cược số tiền ít hơn
		 * hoặc bằng số tiền họ đang có. Luật chơi như sau: Có 3 viên xúc xắc. Mõi viên
		 * xúc có 6 mặt có giá tị từ 1 đến 6. Mỗi lần lắc sẽ ra một kết quả. Kết quả =
		 * giá trị xx1 + giá trị xx2 + giá xx3 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết,
		 * người chơi thua. 2. Nếu tổng = (4->10) <-> xiu => nếu người chơi đặt xiu thì
		 * người chơi thắng, ngược lại thua 3. Nếu tổng =(11-17) <-> tài => nếu người
		 * chơi đặt xiu thì người chơi thắng, ngược lại thua
		 */
		while (user > 0) {
			String Tai_Xiu;
			boolean Check = false;
			int x1 = Test_JAVA.Random();
			int x2 = Test_JAVA.Random();
			int x3 = Test_JAVA.Random();
			int sum = x1 + x2 + x3;
			System.out.println("Nhap ca cuoc:");
			double user_input = input.nextDouble();
			if (user_input > user) {
				System.out.println("Ban an gian");
				break;
			}
			System.out.println("Nhap lua chon:");
			Tai_Xiu = input.nextLine();

			System.out.println("Xuc xac: " + x1 + " " + x2 + " " + x3);
			System.out.println("Tong: " + sum);

			if (sum == 3 || sum == 18) {
				System.out.println("Ban da thua");
				break;
			} else if ((sum >= 4 && sum <= 10 && Tai_Xiu.equalsIgnoreCase("xiu"))
					|| (sum >= 11 && sum <= 17 && Tai_Xiu.equalsIgnoreCase("tai"))) {
				Check = true;
			}
			if (Check == true) {
				System.out.println("Ban da thang");
				user += user_input;
				System.out.println("Tai khoan cua ban la:" + user);
			} else {
				System.out.println("Ban da thua");
				user -= user_input;
				System.out.println("Tai khoan cua ban la:" + user);
			}
			System.out.println("______________________");
		}

		input.close();
	}
}