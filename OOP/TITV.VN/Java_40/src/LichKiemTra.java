
public class LichKiemTra extends HocSinh {
	private int KiemTra15;
	private String MonHoc;
	public LichKiemTra(String ten, int namsinh, String lophoc, String truong, int kiemTra15, String monHoc) {
		super(ten, namsinh, lophoc, truong);
		KiemTra15 = kiemTra15;
		MonHoc = monHoc;
	}
	public int getKiemTra15() {
		return KiemTra15;
	}
	public void setKiemTra15(int kiemTra15) {
		KiemTra15 = kiemTra15;
	}
	public String getMonHoc() {
		return MonHoc;
	}
	public void setMonHoc(String monHoc) {
		MonHoc = monHoc;
	}
	
}
