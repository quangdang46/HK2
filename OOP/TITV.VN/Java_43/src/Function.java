
public class Function {
	public int Max2So(int a,int b) {
		return a>b?a:b;
	}
	public int Sum2So(int a,int b) {
		return a+b;
	}
	public int TongArr(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public boolean CheckLonHon(int a,int b) {
		return a>b;
	}
}
