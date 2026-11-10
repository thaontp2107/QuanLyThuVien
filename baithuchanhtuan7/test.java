package baithuchanhtuan7;

import java.util.ArrayList;

public class test{
    public static void main(String[] args){
        sach toan = new sach("t001", "sach toan","Nguyen van chung",2018, 10);
        sach van = new sach("t001", "sach toan","tran van cuong",2010, 123);
        sach su = new sach("t001", "sach toan","Nguyen van canh",2000, 4567);

        ArrayList<sach> dsSach = new ArrayList<>();
        dsSach.add(toan);
        dsSach.add(van);
        dsSach.add(su);

        for(sach s: dsSach){
            s.inSach();
        }

    }
}
