import java.util.Scanner;

/*
 * Bài 3. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
 */
public class Bai1 {
	public static int Tong(int n) {
		int cnt=0;
		while(n!=0) {
			cnt+=n%10;
			n/=10;
		}
		return cnt;
	}
	
    public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(check==false){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}

	
	public static void main(String[] args) {
		int n;
		n=nhap();
		System.out.println("Tong cac chu so cua n:"+Tong(n));
		
	}
}
