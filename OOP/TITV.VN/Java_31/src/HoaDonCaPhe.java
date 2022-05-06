import java.util.Objects;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double khoiluong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = khoiluong;
	}

	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuongLonHon(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
	}

	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}

	public double giaSauKhiGiam(double x) {
		if (this.kiemTraTongTienLonHon500K()) {
			return this.tinhTongTien() * (1 - x * 0.01);
		} else {
			return this.tinhTongTien();
		}
	}

	public String getTenLoaiCaPhe() {
		return this.tenLoaiCaPhe;
	}

	public void setTenLoaiCaPhe(String tenLoaiCaPhe) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
	}

	public double getGiaTien1Kg() {
		return this.giaTien1Kg;
	}

	public void setGiaTien1Kg(double giaTien1Kg) {
		this.giaTien1Kg = giaTien1Kg;
	}

	public double getKhoiLuong() {
		return this.khoiLuong;
	}

	public void setKhoiLuong(double khoiLuong) {
		this.khoiLuong = khoiLuong;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.tenLoaiCaPhe+" : "+this.khoiLuong+" : "+this.giaTien1Kg;
//	}

	@Override
	public String toString() {
		return "HoaDonCaPhe [tenLoaiCaPhe=" + tenLoaiCaPhe + ", giaTien1Kg=" + giaTien1Kg + ", khoiLuong=" + khoiLuong
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(giaTien1Kg, khoiLuong, tenLoaiCaPhe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonCaPhe other = (HoaDonCaPhe) obj;
		return Double.doubleToLongBits(giaTien1Kg) == Double.doubleToLongBits(other.giaTien1Kg)
				&& Double.doubleToLongBits(khoiLuong) == Double.doubleToLongBits(other.khoiLuong)
				&& Objects.equals(tenLoaiCaPhe, other.tenLoaiCaPhe);
	}
	
	
}
