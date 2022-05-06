import java.util.Objects;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	public Sach(String tenSach,double giaBan,int namXuatBan,TacGia tacGia ) {
		this.tenSach=tenSach;
		this.giaBan=giaBan;
		this.namXuatBan=namXuatBan;
		this.tacGia=tacGia;
	}
	
	//
	
	public void inTenSach() {
		System.out.println("Ten Sach:"+this.tenSach);
	}
	//
	
	
	public double giaSauKhiGiam(double x) {
		return this.giaBan*(1-x*0.01);
	}
	//


	public String getTenSach() {
		return tenSach;
	}



	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}



	public double getGiaBan() {
		return giaBan;
	}



	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}



	public int getNamXuatBan() {
		return namXuatBan;
	}



	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}



	public TacGia getTacGia() {
		return tacGia;
	}



	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	//
	
	
	public boolean kiemTraCungNamXuatBan(Sach sachKhac) {
//		if (this.namXuatBan == sachKhac.namXuatBan) {
//			return true;
//		}else {
//			return false;
//		}
		return this.namXuatBan == sachKhac.namXuatBan;
	}	
	
	
}
