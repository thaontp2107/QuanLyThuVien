import java.util.ArrayList;
import java.util.Scanner;

public class baitapthuchanhtuan5 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> danhSachSach = new ArrayList<>();

    static ArrayList<String> danhSachMa = new ArrayList<>();

    static ArrayList<Integer> danhSachSoLuong = new ArrayList<>();
    static ArrayList<Double> danhSachDonGia = new ArrayList<>();

    public static void bai1() {

        int[] soLuong = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }

        int tong = 0;
        int max = soLuong[0];

        System.out.println("\nDanh sach so luong:");

        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);

            tong += soLuong[i];

            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    public static void bai2() {

        int chon;

        do {
            System.out.println("\n--- QUAN LY MA SACH ---");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("5. Quay lai");

            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    danhSachMa.add(ma);
                    System.out.println("Them thanh cong!");
                    break;

                case 2:
                    if (danhSachMa.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < danhSachMa.size(); i++) {
                            System.out.println(danhSachMa.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    if (danhSachMa.contains(maTim)) {
                        System.out.println("Tim thay ma sach!");
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    if (danhSachMa.remove(maXoa)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 5);
    }

    public static void themSach() {

        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        if (danhSachMaSachTonTai(ma)) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        sc.nextLine();

        String sach = ma + " | " + ten + " | " + tacGia
                    + " | " + donGia + " | " + soLuong;

        danhSachSach.add(sach);
        danhSachMa.add(ma);
        danhSachDonGia.add(donGia);
        danhSachSoLuong.add(soLuong);

        System.out.println("Them sach thanh cong!");
    }

    public static boolean danhSachMaSachTonTai(String ma) {
        return danhSachMa.contains(ma);
    }

    public static void hienThiSach() {

        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach rong!");
            return;
        }

        System.out.println("\nDANH SACH SACH");

        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSach.get(i));
        }
    }

    public static void timSach() {

        System.out.print("Nhap ma sach can tim: ");
        String maTim = sc.nextLine();

        int viTri = danhSachMa.indexOf(maTim);

        if (viTri != -1) {
            System.out.println("Tim thay sach:");
            System.out.println(danhSachSach.get(viTri));
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void xoaSach() {

        System.out.print("Nhap ma sach can xoa: ");
        String maXoa = sc.nextLine();

        int viTri = danhSachMa.indexOf(maXoa);

        if (viTri != -1) {
            danhSachSach.remove(viTri);
            danhSachMa.remove(viTri);
            danhSachDonGia.remove(viTri);
            danhSachSoLuong.remove(viTri);

            System.out.println("Xoa sach thanh cong!");
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void suaSach() {

        System.out.print("Nhap ma sach can sua: ");
        String maSua = sc.nextLine();

        int viTri = danhSachMa.indexOf(maSua);

        if (viTri != -1) {

            System.out.print("Nhap ten sach moi: ");
            String ten = sc.nextLine();

            System.out.print("Nhap tac gia moi: ");
            String tacGia = sc.nextLine();

            System.out.print("Nhap don gia moi: ");
            double donGia = sc.nextDouble();

            System.out.print("Nhap so luong moi: ");
            int soLuong = sc.nextInt();
            sc.nextLine();

            String sach = maSua + " | " + ten + " | " + tacGia
                        + " | " + donGia + " | " + soLuong;

            danhSachSach.set(viTri, sach);
            danhSachDonGia.set(viTri, donGia);
            danhSachSoLuong.set(viTri, soLuong);

            System.out.println("Sua sach thanh cong!");

        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    public static void tongSoLuong() {

        int tong = 0;

        for (int i = 0; i < danhSachSoLuong.size(); i++) {
            tong += danhSachSoLuong.get(i);
        }

        System.out.println("Tong so luong sach: " + tong);
    }

    public static void tongGiaTri() {

        double tong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            tong += danhSachDonGia.get(i) * danhSachSoLuong.get(i);
        }

        System.out.println("Tong gia tri sach: " + tong);
    }

    public static void menu() {

        int chon;

        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    themSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    timSach();
                    break;

                case 4:
                    xoaSach();
                    break;

                case 5:
                    suaSach();
                    break;

                case 6:
                    tongSoLuong();
                    break;

                case 7:
                    tongGiaTri();
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);
    }

    public static void main(String[] args) {

        menu();

    }
}
