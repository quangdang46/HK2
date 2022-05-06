package ViDu;

import java.util.Arrays;

//tạo lớp test2
public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Tran Van Thanh", "Java", 6.5);
		SinhVien sv2 = new SinhVien(100, "Nguyen Thi Thanh Hoa", "Java", 7.0);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van An", "Java", 7.0);
		SinhVien sv4 = new SinhVien(189, "Nguyen Van Binh", "Java", 7.0);

		SinhVien[] a_sv = new SinhVien[] { sv1, sv2, sv3 };

		System.out.println("Ban đầu: " + Arrays.toString(a_sv));

//hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi săp xếp: " + Arrays.toString(a_sv));

//hàm tìm kiếm
		System.out.println("Tìm kiếm An: " + Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm Bình: " + Arrays.binarySearch(a_sv, sv4));

	}
}