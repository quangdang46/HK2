
public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhap n");
        main mn=new main();
		int n;
		n=mn.input();
		int[] f= new int[n+1];
		f[0]= 1; f[1]= 1;
		for(int i=2;i<=n;i++){
			f[i]= f[i-1]+f[i-2];
		}
		System.out.println("So Fibonanci thu "+n+" la: f["+n+"]= "+f[n]);
    }

}
