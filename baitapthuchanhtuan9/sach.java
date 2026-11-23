package baitapthuchanhtuan9;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class sach {
    protected String maSach;
    protected Date ngayNhap;
    protected int solg;
    protected double dongia;
    protected String nxb;


    public sach(){}

    public sach(String maSach, Date ngayNhap, int solg, double dongia, String nxb){
        this.maSach = maSach;
        this.ngayNhap =ngayNhap;
        this.solg = solg;
        this.dongia= dongia;
        this.nxb = nxb;
    }

    public String getMaSach(){
        return maSach;
    }

    public void setMaSach(String maSach){
        this.maSach = maSach;
    }

    public Date getNgayNhap(){
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap){
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong(){
        return solg;
    }

    public void setSoLuong(int solg){
        this.solg = solg;
    }

    public double getDonGia(){
        return dongia;
    }

    public void setDonGia(double dongia){
        this.dongia = dongia;
    }

    public String getNXB(){
        return nxb;
    }

    public void setNXB(String nxb){
        this.nxb = nxb;
    }

    public void NhapThongTinSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("nhap ngay nhap: ");
        try{         
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");        
            this.ngayNhap = d.parse(sc.nextLine());        
        }
        catch(Exception ex){}
        System.out.print("nhap so luong: ");
        this.solg = sc.nextInt();
        System.out.print("nhap don gia: ");
        this.dongia = sc.nextDouble();
        System.out.print("nhap nha xuat ban: ");
        this.nxb = sc.nextLine();

    }

    public void InThongTinSach(){
        System.out.println("ma sach: "+maSach);
        System.out.println("so luong: "+ solg);
        System.out.println("don gia: " +dongia);
    }
}
