public class main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Ca phe trung nguyen", 500000, 2);
		HoaDonCaPhe hd1 = new HoaDonCaPhe("ca phe", 500000, 2);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Ca phe trung nguyen", 500000, 2);
//		System.out.println("Gia can thanh toan:"+hd.tinhTongTien());
//		System.out.println("Khoi luong co lon hon 2kg khong:"+hd.kiemTraKhoiLuongLonHon(4));
//		System.out.println("Kiem tra tien lon hon 500k:"+hd.kiemTraTongTienLonHon500K());
//		System.out.println("Gia tien can thanh toan sau khi giam 10%:"+hd.giaSauKhiGiam(10));
//		System.out.println("So sanh hd va hd1 " + hd.equals(hd1));
//		System.out.println("So sanh hd va hd2 " + hd.equals(hd2));
		System.out.println("Hascode hd"+hd.hashCode());
		System.out.println("So sanh hd1" + hd1.hashCode());
	}

}
