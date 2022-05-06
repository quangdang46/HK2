
public class NhanVien {
	private String ten;
	private int tuoi;
	private String diachi;
	private float luong;
	private int giolam;
	public NhanVien(String ten, int tuoi, String diachi, float luong, int giolam) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diachi = diachi;
		this.luong = luong;
		this.giolam = giolam;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	public int getGiolam() {
		return giolam;
	}
	public void setGiolam(int giolam) {
		this.giolam = giolam;
	}
	//
	public void inputInfo() {
		setTen(this.ten);
		setTuoi(this.tuoi);
		setDiachi(this.diachi);
		setGiolam(this.giolam);
		setLuong(this.luong);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
