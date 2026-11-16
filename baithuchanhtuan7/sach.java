package baithuchanhtuan7;
import java.util.ArrayList;

public class sach {
    
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int nxb;
    private int soLg;

    public sach(){ }

    public sach(String maSach, String tieuDe, String tacGia, int nxb, int soLg){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia =tacGia;
        setNXB(nxb);
        setSoLuong(soLg);
    }

    public String getMaSach(){
        return maSach;
    }

    public void setMaSach(String maSach){
        this.maSach = maSach;
    }

    public String getTieuDeSach(){
        return tieuDe;
    }

    public void setTieuDeSach(String tieuDe){
        this.tieuDe = tieuDe;
    }

    public String getTacGia(){
        return tacGia;
    }

    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }

    public int getNXB(){
        return nxb;
    }

    public void setNXB(int nxb){
        
        int namhientai = java.time.Year.now().getValue();
        if (nxb > 0 && nxb <= namhientai){
            this.nxb = nxb;
        } else{
            System.out.println("Năm xuất bản không hợp lệ");
        }   
    }

    public int getSoLuong(){
        return soLg;
    }

    public void setSoLuong(int soLg){
        if (soLg >= 0){
            this.soLg = soLg;
        } else {
            System.out.println("so luong am");
        }
        
    }


    public void inSach (){
        System.out.println("ma sach: "+ maSach);
        System.out.println("ten sach: "+tieuDe);
        System.out.println("tac gia: "+tacGia);
        System.out.println("nam xuat ban: "+nxb);
        System.out.println("so luong: "+soLg);
    }
}

