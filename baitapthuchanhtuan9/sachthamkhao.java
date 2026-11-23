package baitapthuchanhtuan9;
import java.util.ArrayList;
import java.util.Date;

public class sachthamkhao extends sach {
    public double thue;

    public double getThue(){
        return thue;
    }

    public void setThue(double thue){
        this.thue = thue;
    }

    public sachthamkhao(){
        super();
    }

    public sachthamkhao(double thue){
        super();
        this.thue = thue; 
    }

    public sachthamkhao(double thue, Date ngayNhap, String maSach, int solg, double dongia, String nxb) {
        super(maSach, ngayNhap, solg, dongia, nxb);
        this.thue = thue;
    }

    public double ThanhTien(){
        return solg * dongia + thue;
    }

    public static double TrungBinhDonGia(ArrayList<sachthamkhao> ds) {
        double tong = 0;
        for (sachthamkhao s : ds) {
            tong += s.getDonGia();
        }
        if (ds.size() == 0)
            return 0;
        return tong / ds.size();
    }

    @Override 
    public void InThongTinSach(){
        super.InThongTinSach();
        System.err.println("thue: "+thue);
        System.out.println("thanh tien: "+ThanhTien());
    }
    
}
