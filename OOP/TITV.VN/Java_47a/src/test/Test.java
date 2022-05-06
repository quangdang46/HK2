package test;

import code_a.ViDu;

public class Test {
	public static void main(String[] args) {
		ViDu vd1=new ViDu();
		System.out.println("Max cua 2 so 3 va 4:"+vd1.Max2(3, 4));
		System.out.println("Tong 2 so 3 va 4:"+vd1.Cong(3, 4));
		code_b.ViDu vd2=new code_b.ViDu();
		System.out.println("Max cua 2 so 3 va 4 va 5:"+vd2.Max2(3, 4,5));
		System.out.println("Tong 2 so 3 va 4 va 5:"+vd2.Cong(3, 4,5));
	}
}
