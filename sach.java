import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class sach {
    protected String masach;
    protected String tensach;
    protected String tacgia;
    protected int nxb;
    protected double dongia;
    protected int solg;
    private String thanhtien;
    private String phivanchuyen;
    private String tongtien;
    
    public sach() {}

    public sach(String masach,  String tensach, String tacgia, 
                int nxb, double dongia, int solg)
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.dongia = dongia;
        this.solg= solg;

    public String getmasach() {
        return masach;
    }
    public String gettensach() {
        return tensach;
    }
    public String gettacgia() {
        return tacgia;
    }
    public int getnxb() {
        return nxb ;
    }
    public double getdongia() {
        return dongia;
    }
    public int getsolg() {
        return solg;
    }

    public void setmasach(String masach) {
        this.masach = masach;
    }
    public void gettensach(String tensach) {
        this.tensach = tensach;
    }
    public void gettacgia(String tacgia) {
        this.tacgia = tacgia;
    }
    public void getnxb(int nxb) {
        this.nxb = nxb;
    }
    public void getdongia(double dongia) {
        this.dongia = dongia;
    }
    public void getsolg(int solg) {
        this.solg = solg;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        this.masach = sc.nextLine();
        System.out.print("nhap ten sach: ");
        this.tensach = sc.nextLine();
        System.out.print("nhap tac gia: ");
        this.tacgia = sc.nextLine();
        int namHienTai = Year.now().getValue(); 
        do {
            System.out.print("Nhập năm xuất bản (0 < năm < " + namHienTai + "): ");
            if (sc.hasNextInt()) {
                this.nxb = sc.nextInt();
                if (this.nxb <= 0 || this.nxb >= namHienTai) {
                    System.out.println(" Lỗi: Năm xuất bản phải lớn hơn 0 và nhỏ hơn " + namHienTai + "! Vui lòng nhập lại.");
                }
            } else {
                System.out.println(" Lỗi: Vui lòng chỉ nhập số nguyên!");
                sc.next(); 
            }
        } while (this.nxb <= 0 || this.nxb >= namHienTai);
        System.out.print("nhap don gia: ");
        double dongia = sc.nextDouble();
        System.out.print("nhap so luong: ");
        int solg = sc.nextInt();
    }

    public void xuat() {
        System.out.println("ma sach: "+this.masach);
        System.out.println("ten sach: "+this.tensach);
        System.out.println("tac gia: "+this.tacgia);
        System.out.println("nam xuat ban: "+this.nxb);
        System.out.println("don gia: "+this.dongia);
        System.out.println("so luong: "+this.solg);

        double thanhtien = dongia * solg;
        double phivanchuyen = 0.05 * thanhtien;
        double tongtien = thanhtien + phivanchuyen ;

        System.out.println("thanh tien: "+this.thanhtien);
        System.out.println("phi van chuyen: "+this.phivanchuyen);
        System.out.println("tong tien: "+this.tongtien);

    }
}


class lthdt {
    public static void main(String[] args) {
        System.out.println("nhap thong tin sach");
        sach s = new sach();
        s.nhap();

        System.out.println("xuat thong tin sach");
        s.xuat();
}