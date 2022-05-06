import java.util.Scanner;

public class main {
	public static int input() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		while (check == false) {
			System.out.println(" ");
			try {
				n = sc.nextInt();
				check = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ban vua nhap khong phai so!!");
				sc.nextLine();
			}
		}
		return n;
	}

	public static boolean Check(int n) {
		return n > 2;
	}

	public static boolean snt(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void Insnt(int n) {
		if(Check(n)) {
			for(int i=2;i<n;i++) {
				if(snt(i)) System.out.print(i+" ");
			}
		}
	}
	public static boolean checktn(int n) {
		int k=0;
		int arr[]=new int[6] ;
		while(n!=0) {
			arr[k]=n%10;
			n/=10;
			k++;
		}
		int l=0,r=5;
		while(l<r) {
			if(arr[l]!=arr[r]) {
				return false;
			}
			l++;
			r--;
		}
		return true;
		
	}
	
	

}
