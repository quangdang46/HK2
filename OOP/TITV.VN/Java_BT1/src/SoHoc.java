
public class SoHoc {
	private int number1;
	private int number2;
	public SoHoc(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public void inputInfo(int a,int b) {
		setNumber1(a);
		setNumber2(b);
	}
	public void printInfo() {
		System.out.println("a= "+this.number1+"\nb= "+this.number2);
	}
	public int addition() {
		return this.number1+this.number2;
	}
	public int subtract() {
		return this.number1-this.number2;
	}
	public int multi() {
		return this.number1*this.number2;
	}
	public float division() {
		try {
			return this.number1/(float)this.number2;
		}catch (Exception asException) {
			// TODO: handle exception
			System.out.println("Khong the thuc hien!!");
		}
		return 0;
		
	}
}
