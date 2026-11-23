package baitapthuchanhtuan9;
import java.util.Date;

public class sachgiaokhoa extends sach {
    public String tinhTrang;

    public String getTinhTrang(){
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang){
        this.tinhTrang = tinhTrang;
    }

    public sachgiaokhoa(){
        super();
    }

    public sachgiaokhoa(String tinhTrang) {
        super();
        this.tinhTrang = tinhTrang;
    }

    public sachgiaokhoa(String tinhTrang, Date ngayNhap, String maSach, int solg, double dongia, String nxb) {
        super(maSach, ngayNhap, solg, dongia, nxb);
        this.tinhTrang = tinhTrang;
    }

    public double ThanhTien(){
        if (tinhTrang.equalsIgnoreCase("moi"))
            return solg*dongia;
        else
            return solg*dongia*0.5;
    }

    @Override 
    public void InThongTinSach(){
        super.InThongTinSach();
        System.out.println("tinh trang: "+tinhTrang);
        System.out.println("thanh tien: "+ThanhTien());
    }
    
}
