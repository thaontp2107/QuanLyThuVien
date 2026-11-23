package baitapthuchanhtuan9;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class BTTH9 {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        ArrayList<sachgiaokhoa> dsSGK = new ArrayList<>();
        
        ArrayList<sachthamkhao> dsSTK = new ArrayList<>();


        sachgiaokhoa sgk1 = new sachgiaokhoa(
            "moi", sdf.parse("10/01/2026"),
            "SGK01", 10, 20000, "X"
        );

        sachgiaokhoa sgk2 = new sachgiaokhoa(
            "cu", sdf.parse("15/02/2026"),
            "SGK02", 5, 30000, "Y"
        );

        sachthamkhao stk1 = new sachthamkhao(
            5000, sdf.parse("20/03/2026"),
            "STK01", 10, 40000, "NXB A"
        );

        sachthamkhao stk2 = new sachthamkhao(
            10000, sdf.parse("25/04/2026"),
            "STK02", 5, 50000, "NXB B"
        );

        dsSGK.add(sgk1);
        dsSGK.add(sgk2);

        dsSTK.add(stk1);
        dsSTK.add(stk2);

        System.out.println("===== SACH GIAO KHOA =====");
        for (sachgiaokhoa s : dsSGK) {
            s.InThongTinSach();
        }

        System.out.println("===== SACH THAM KHAO =====");
        for (sachthamkhao s : dsSTK) {
            s.InThongTinSach();
        }

        double tongSGK = 0;
        for (sachgiaokhoa s : dsSGK) {
            tongSGK += s.ThanhTien();
        }
        System.out.println("Tong tien sach giao khoa: " + tongSGK);


        double tongSTK = 0;
        for (sachthamkhao s : dsSTK) {
            tongSTK += s.ThanhTien();
        }
        System.out.println("Tong tien sach tham khao: " + tongSTK);

        System.out.println("Trung binh don gia sach tham khao: " + sachthamkhao.TrungBinhDonGia(dsSTK));

        System.out.println("===== SACH GIAO KHOA CUA NXB X =====");

        for (sachgiaokhoa s : dsSGK) {
            if (s.getNXB().equalsIgnoreCase("X")) {
                s.InThongTinSach();
            }
        }
    }
}