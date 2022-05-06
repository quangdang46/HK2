import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
//		Bài 1. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a va b:");
		a=sc.nextInt();
		b=sc.nextInt();
		int min=a>b?b:a;
		int UCLN=0,BCNN=0;
		for(int i=min;i>=2;i--) {
			if (a%i==0 && b%i==0) {
				UCLN=i;
				break;
			}
		}
		System.out.println("BCNN la:"+(a*b)/UCLN+"  va UCLN la:"+UCLN);
	}
}
/*
package bai01;

import java.util.Scanner;

public class Main {

    public static int nhap()
    {
        Scanner input = new Scanner(System.in);
        boolean check= false;
		int n=0;
		while(!check){
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
    public static int UCLN(int a, int b){
		while(a!= b){
			if(a>b) a= a-b;
			else b= b-a;
		}
		return (a);
	}
    public static void main(String[] args) {
        System.out.println("Nhap a");
		int a = nhap();
		System.out.println("Nhap b");
		int b= nhap();
		System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
		System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    }

}

 */