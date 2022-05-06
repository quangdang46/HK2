
public class HocSinh extends ConNguoi {
	private String lophoc;
	private String truong;
	public HocSinh(String ten, int namsinh, String lophoc, String truong) {
		super(ten, namsinh);
		this.lophoc = lophoc;
		this.truong = truong;
	}
	public String getLophoc() {
		return lophoc;
	}
	public void setLophoc(String lophoc) {
		this.lophoc = lophoc;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public void BaiTap() {
		System.out.println("Lam Bai Tap 1");
	}
	public void KiemTra() {
		System.out.println("Kiem tra 15ph");
	}
}
