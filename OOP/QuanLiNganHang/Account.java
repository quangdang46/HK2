import java.text.NumberFormat;
import java.util.*;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
    Scanner sc = new Scanner(System.in);

    public Account() {

    }

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return this.soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return this.tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return this.soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(this.soTienTrongTK);
        return soTK + "-" + tenTK + "-" + str1;
    }

    // khởi tạo phương thức nạp tiền
    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            this.soTienTrongTK = nap + this.soTienTrongTK;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }

    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        if (rut <= (this.soTienTrongTK - phi)) {
            this.soTienTrongTK = this.soTienTrongTK - rut - phi;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }

    public double daoHan() {
        double lauSuat = 0.035;
        this.soTienTrongTK += this.soTienTrongTK * lauSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(this.soTienTrongTK);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return soTienTrongTK;
    }

    // khởi tạo phương thức in kết quả ra màn hình
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }


}