package ViDu;
//tạo lớp test1

import java.util.Arrays;

public class Test1 {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[15];

		System.out.println("Mảng a ban đầu: " + Arrays.toString(a));

//sắp xếp mảng
		Arrays.sort(a);
		System.out.println("Mảng a sau khi sắp xếp: " + Arrays.toString(a));

//hàm tìm kiếm
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1)); // ra kết quả sai, chỉ dùng binarySearch cho các mảng đã sắp
														// xếp tăng dần sẵn

//hàm điền giá trị
		Arrays.fill(b, 5); // mặc định sắp xếp từ nhỏ đến lớn
		System.out.println("Mảng b: " + Arrays.toString(b));

//hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = Test1.reverse(a);
		System.out.println("Mảng a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
	}
}
