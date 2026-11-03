import java.util.Scanner;

public class baitapthuchanhtuan5 {

    public static void nhapSach(String[] maSach, String[] tenSach, String[] tacGia, double[] donGia, int[] soLg) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập số sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i< n; i++) {
            System.out.println("Nhập sách thứ " + (i+1) + ":");
            System.out.print("Nhập mã sách: ");
            maSach[i] = sc.nextLine();
            System.out.print("Nhập tên sách: ");
            tenSach[i]= sc.nextLine();
            System.out.print("Nhap tác giả: ");
            tacGia[i] = sc.nextLine();
            System.out.print("Nhập đơn giá: ");
            donGia[i] = sc.nextDouble();
            System.out.print("Nhập số lượng: ");
            soLg[i]= sc.nextInt();
            sc.nextLine();
        }  
    }

    public static void tgSoLuong(int[] soLg) {
        int tgSL = 0;
        for(int i=0; i< soLg.length; i++){
            tgSL += soLg[i];
        }
        System.out.println("Tổng số lượng sách: " + tgSL);

    }

    public static void tgGiaTri(double[] donGia, int[] soLg) {

        double tgGT = 0;
        for (int i=0; i < soLg.length; i++) {
            tgGT += donGia[i] * soLg[i];
        }
        System.out.println("Tổng giá trị sách: " + tgGT);
    }

    public static void menu(String[] maSach, String[] tenSach, String[] tacGia, double[] donGia, int[] soLg) {

        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập sách");
            System.out.println("2. Tổng số lượng sách");
            System.out.println("3. Tổng giá trị sách");
            System.out.println("4. Thoát");

            System.out.print("Chọn số: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhapSach(maSach, tenSach, tacGia, donGia, soLg);
                    break;
                case 2:
                    tgSoLuong(soLg);
                    break;
                case 3:
                    tgGiaTri(donGia, soLg);
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("không hợp lệ.");
            }
        } while (chon != 4);
    }

    public static void timSach(String[] maSach, String[] tenSach, String[] tacGia, double[] donGia, int[] soLg) {

        Scanner sc= new Scanner(System.in);
        String maSachCanTim;
        System.out.print("Nhap ma sach can tim: ");
        maSachCanTim = sc.nextLine();

        for(int i=0; i< maSach.length; i++) {
            if (maSach[i].equals(maSachCanTim)) {
                System.out.println("da tim thay sach");
                System.out.println("ma sach: " +maSach[i]);
                System.out.println("ten sach: " +tenSach[i]);
                System.out.println("tac gia: " +tacGia[i]);
                System.out.println("don gia: " +donGia[i]);
                System.out.println("so luong: " +soLg[i]);
                break;
            }
        }
    }
        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        
        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        String[] tacGia = new String[100];
        double[] donGia = new double[100];
        int[] soLg = new int[100];

        menu(maSach, tenSach, tacGia, donGia, soLg);

        timSach(maSach, tenSach, tacGia, donGia, soLg);
    }
}

    