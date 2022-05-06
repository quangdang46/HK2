package code_b;

public class ViDu {
	public int Max2(int a,int b,int c) {
		int res=a;
		res=a>b?a:b;
		res=res>c?res:c;
		return res;
	}
	public int Cong(int a,int b,int c) {
		return a+b+c;
	}
}

