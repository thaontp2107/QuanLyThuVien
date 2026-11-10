package baithuchanhtuan7;
import java.util.ArrayList;

public class sach {
    
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int nxb;
    public int soLg;

    

    public sach(){ }

    public sach(String maSach, String tieuDe, String tacGia, int nxb, int soLg){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia =tacGia;
        this.nxb = nxb;
        this.soLg= soLg;
    }

    public void inSach (){
        System.out.println("ma sach: "+ maSach);
        System.out.println("ten sach: "+tieuDe);
        System.out.println("tac gia: "+tacGia);
        System.out.println("nam xuat ban: "+nxb);
        System.out.println("so luong: "+soLg);
    }
}

