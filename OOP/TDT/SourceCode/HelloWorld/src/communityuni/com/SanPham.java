package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;

public class SanPham implements Comparable<SanPham>{
	private int ma;
	private String ten;
	private double gia;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int compareTo(SanPham arg0) {
		if(this.ma>arg0.ma)
			return 1;
		if(this.ma<arg0.ma)
			return -1;
		return 0;
	}
	
	public SanPham(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}
	public static void main(String[] args) {
		ArrayList<SanPham>dsSp=new ArrayList<SanPham>();
		SanPham coca=new SanPham(5,"Cocacola",25);
		SanPham pepsi=new SanPham(1,"Pepsi",28);
		SanPham redbull=new SanPham(2,"Pepsi",30);
		dsSp.add(coca);dsSp.add(pepsi);dsSp.add(redbull);
		Collections.sort(dsSp);
	}
}
