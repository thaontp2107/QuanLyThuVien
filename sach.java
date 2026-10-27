import java.util.Scanner;
import java.time.Year;

public class sach {
    protected String masach;
    protected String tensach;
    protected String tacgia;
    protected int nxb;
    protected double dongia;
    protected int solg;
    private double thanhtien;
    private double phivanchuyen;
    private double tongtien;
    protected String loaisach;

    public sach() {}

    public sach(String masach, String tensach, String tacgia,
                int nxb, double dongia, int solg) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.dongia = dongia;
        this.solg = solg;
    }

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
        return nxb;
    }

    public double getdongia() {
        return dongia;
    }

    public int getsolg() {
        return solg;
    }

    public String getloaisach() {
        return loaisach;
    }

    public void setmasach(String masach) {
        this.masach = masach;
    }

    public void settensach(String tensach) {
        this.tensach = tensach;
    }

    public void settacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setnxb(int nxb) {
        this.nxb = nxb;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public void setsolg(int solg) {
        this.solg = solg;
    }

    public void setloaisach(String loaisach) {
        this.loaisach = loaisach;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        this.masach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        this.tensach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        this.tacgia = sc.nextLine();

        int namHienTai = Year.now().getValue();

        do {
            System.out.print("Nhap nam xuat ban (0 < nam < "
                    + namHienTai + "): ");

            if (sc.hasNextInt()) {
                this.nxb = sc.nextInt();

                if (this.nxb <= 0 || this.nxb >= namHienTai) {
                    System.out.println("Nam xuat ban khong hop le!");
                }
            } else {
                System.out.println("Vui long nhap so nguyen!");
                sc.next();
                this.nxb = 0;
            }
        } while (this.nxb <= 0 || this.nxb >= namHienTai);

        do {
            System.out.print("Nhap don gia: ");
            if (sc.hasNextDouble()) {
                this.dongia = sc.nextDouble();
                if (this.dongia <= 0) {
                    System.out.println("Don gia phai lon hon 0!");
                }
            } else {
                System.out.println("Vui long nhap don gia hop le!");
                sc.next();
                this.dongia = 0;
            }
        } while (this.dongia <= 0);

        do {
            System.out.print("Nhap so luong: ");
            if (sc.hasNextInt()) {
                this.solg = sc.nextInt();
                if (this.solg < 0) {
                    System.out.println("So luong khong duoc am!");
                }
            } else {
                System.out.println("Vui long nhap so nguyen!");
                sc.next();
                this.solg = -1;
            }
        } while (this.solg < 0);

        sc.nextLine();

        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach: ");

        int loai;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap so tu 1 den 4!");
                sc.next();
            }
            loai = sc.nextInt();
            if (loai < 1 || loai > 4) {
                System.out.println("Loai sach khong hop le!");
            }
        } while (loai < 1 || loai > 4);

        this.loaisach = String.valueOf(loai);
    }

    public void xuat() {
        System.out.println("Ma sach: " + this.masach);
        System.out.println("Ten sach: " + this.tensach);
        System.out.println("Tac gia: " + this.tacgia);
        System.out.println("Nam xuat ban: " + this.nxb);
        System.out.println("Don gia: " + this.dongia);
        System.out.println("So luong: " + this.solg);
        System.out.println("Loai sach: " + getTenLoaiSach());

        this.thanhtien = this.dongia * this.solg;
        this.phivanchuyen = 0.05 * this.thanhtien;
        this.tongtien = this.thanhtien + this.phivanchuyen;

        System.out.println("Thanh tien: " + this.thanhtien);
        System.out.println("Phi van chuyen: " + this.phivanchuyen);
        System.out.println("Tong tien: " + this.tongtien);

        System.out.println("Phan loai gia: " + phanLoaiGia());
        System.out.println("Phan loai ton kho: " + phanLoaiTonKho());
        System.out.println("Kiem tra hop le: "
                + (kiemtraHopLe() ? "Hop le" : "Khong hop le"));
    }

    public boolean kiemtraHopLe() {
        int namHienTai = Year.now().getValue();

        return this.dongia > 0
                && this.solg >= 0
                && this.nxb > 0
                && this.nxb < namHienTai;
    }

    public String phanLoaiGia() {
        if (this.dongia < 50000) {
            return "Sach gia thap";
        } else if (this.dongia <= 100000) {
            return "Sach gia trung binh";
        } else if (this.dongia <= 200000) {
            return "Sach gia cao";
        } else {
            return "Sach gia dac biet";
        }
    }

    public String phanLoaiTonKho() {
        if (this.solg == 0) {
            return "Het sach";
        } else if (this.solg <= 5) {
            return "Sap het";
        } else if (this.solg <= 20) {
            return "Con it";
        } else {
            return "Con nhieu";
        }
    }

    public String getTenLoaiSach() {
        if (this.loaisach == null) {
            return "Khong xac dinh";
        }

        switch (this.loaisach) {
            case "1":
                return "Sach giao khoa";
            case "2":
                return "Sach tham khao";
            case "3":
                return "Sach chuyen nganh";
            case "4":
                return "Sach khac";
            default:
                return "Khong xac dinh";
        }
    }
}

class lthdt {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin sach");

        sach s = new sach();
        s.nhap();

        System.out.println("Xuat thong tin sach");
        s.xuat();
    }
}