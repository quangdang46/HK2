/*
Bài 8. Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn 
nhận được một số giống nhau. Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 
558855). 
 */
public class Bai8 {
	public static void main(String[] args) {
		main mn=new main();
		for(int i=100000;i<1000000;i++) {
			if(mn.checktn(i)) System.out.print(i+" ");
		}
	}
}
