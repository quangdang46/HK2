
public class BacSy extends ConNguoi {
	private String khoa;
	private int benhnhan;
	public BacSy(String ten, int namsinh, String khoa, int benhnhan) {
		super(ten, namsinh);
		this.khoa = khoa;
		this.benhnhan = benhnhan;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public int getBenhnhan() {
		return benhnhan;
	}
	public void setBenhnhan(int benhnhan) {
		this.benhnhan = benhnhan;
	}
	public void ChuaBenh() {
		System.out.println("Chua benh ho");
	}
	public void LichLam() {
		System.out.println("Ca 2");
	}
	
}
