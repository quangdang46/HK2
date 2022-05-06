package viDu;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getTen() {
		String s = this.hoVaTen.trim();
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		} else {
			return s;
		}
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	@Override	public int compareTo(SinhVien o) {
		// <0		// =0		// >0		// Dua tren so sanh ten		// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen		String tenThis = this.getTen();		String tenO=o.getTen();				return tenThis.compareTo(tenO);	}			}package viDu;import java.util.Arrays;import java.util.Collections;public class Test {	public static int[] reverse(int[] x) {		int[] rs = new int[x.length];		int index=0;		for(int i=x.length-1; i>=0; i--) {			rs[index]=x[i];			index++;		}		return rs;	}	public static void main(String[] args) {		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };		int[] b = new int[15];		//		System.out.println("a ban đầu: " + Arrays.toString(a));		// Hàm sắp xếp tăng dần		Arrays.sort(a);		System.out.println("a sau khi sắp xếp: " + Arrays.toString(a));		// Hàm tìm kiếm		System.out.println(Arrays.binarySearch(a, 4));		System.out.println(Arrays.binarySearch(a, -1));		// Hàm điền giá trị		Arrays.fill(b, 5);		System.out.println("b sau khi điền giá trị: " + Arrays.toString(b));		// Hàm sắp xếp giảm dần		Arrays.sort(a);		a = Test.reverse(a);		System.out.println("a sau khi sắp xếp giảm dần: " + Arrays.toString(a));	}}package viDu;import java.util.Arrays;public class Test2 {	public static void main(String[] args) {		SinhVien sv1 =new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);		SinhVien sv2 =new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);		SinhVien sv3 =new SinhVien(199, "Nguyen Van An", "Lop 2", 8);		SinhVien sv4 =new SinhVien(199, "Nguyen Van Binh", "Lop 2", 8);		SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};				System.out.println("Ban đầu: "+Arrays.toString(a_sv));				// Hàm sắp xếp		Arrays.sort(a_sv);		System.out.println("Sau khi sắp xếp: "+Arrays.toString(a_sv));						// Tìm kiếm		System.out.println("Tìm kiếm An: "+ Arrays.binarySearch(a_sv, sv1));		System.out.println("Tìm kiếm Binh: "+ Arrays.binarySearch(a_sv, sv4));	}}
	}

// tạo lớp sinh viên
	package bai55;

	public class SinhVien implements Comparable {
		private int maSinhVien;
		private String hoVaTen;
		private String tenLop;
		private double diemTrungBinh;

		public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
			this.maSinhVien = maSinhVien;
			this.hoVaTen = hoVaTen;
			this.tenLop = tenLop;
			this.diemTrungBinh = diemTrungBinh;
		}

		public int getMaSinhVien() {
			return maSinhVien;
		}

		public void setMaSinhVien(int maSinhVien) {
			this.maSinhVien = maSinhVien;
		}

		public String getHoVaTen() {
			return hoVaTen;
		}

		public void setHoVaTen(String hoVaTen) {
			this.hoVaTen = hoVaTen;
		}

		public String getTenLop() {
			return tenLop;
		}

		public void setTenLop(String tenLop) {
			this.tenLop = tenLop;
		}

		public double getDiemTrungBinh() {
			return diemTrungBinh;
		}

		public void setDiemTrungBinh(double diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}

		public String getTen() {
			String s = this.hoVaTen.trim();
			if (s.indexOf(" ") >= 0) {
				int vt = s.lastIndexOf(" ");
				return s.substring(vt + 1);
			} else {
				return s;
			}
		}

		@Override
		public String toString() {
			return "SinhVien{" + "maSinhVien=" + maSinhVien + ", hoVaTen='" + hoVaTen + '\'' + ", tenLop='" + tenLop
					+ '\'' + ", diemTrungBinh=" + diemTrungBinh + '}';
		}

		@Override
		public int compareTo(SinhVien o) {
			String tenThis = this.getTen();
			String tenO = o.getTen();
			return tenThis.compareTo(tenO);
		}
	}



