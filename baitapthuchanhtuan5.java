import java.util.Scanner;

public class baitapthuchanhtuan5 {

    static Scanner sc = new Scanner(System.in);

    static String maSach, tenSach, tacGia;
    static double donGia;
    static int soLg;

    public static void nhapSach() {

        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        soLg = sc.nextInt();
        sc.nextLine();
    }

    public static void tgSoLuong() {
        System.out.println("Tổng số lượng sách: " + soLg);
    }

    public static void tgGiaTri() {
        double tgGT = donGia * soLg;
        System.out.println("Tổng giá trị sách: " + tgGT);
    }

    public static void menu() {

        int chon;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập sách");
            System.out.println("2. Tổng số lượng sách");
            System.out.println("3. Tổng giá trị sách");
            System.out.println("4. Tìm sách");
            System.out.println("5. Thoát");

            System.out.print("Chọn số: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    nhapSach();
                    break;

                case 2:
                    tgSoLuong();
                    break;

                case 3:
                    tgGiaTri();
                    break;

                case 4:
                    timSach();
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Không hợp lệ.");
            }

        } while (chon != 5);
    }

    public static void timSach() {

        System.out.print("Nhập mã sách cần tìm: ");
        String maSachCanTim = sc.nextLine();

        if (maSach.equals(maSachCanTim)) {
            System.out.println("Đã tìm thấy sách!");
            System.out.println("Mã sách: " + maSach);
            System.out.println("Tên sách: " + tenSach);
            System.out.println("Tác giả: " + tacGia);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("Số lượng: " + soLg);
        } else {
            System.out.println("Không tìm thấy sách");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}