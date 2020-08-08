import java.util.Scanner;
public class MAIN {

    public static void main(String[] args) {
        int luongTrungBinh = 0, tongLuong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        NHANVIEN[] NHANVIEN = new NHANVIEN[soNhanVien];

        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên (1 - lập trình viên, 2 - kiểm chứng viên): ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                NHANVIEN[i] = new LAPTRINHVIEN();
            } else if (choose == 2) {
                NHANVIEN[i] = new KIEMCHUNGVIEN();
            }

            NHANVIEN[i].nhap();
            NHANVIEN[i].tinhLuong();
        }

        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(NHANVIEN[i].toString());
        }

        System.out.println("Danh sách nhân viên có lương thấp hơn mức lương trung bình của "
                + "các nhân viên trong công ty.");
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += NHANVIEN[i].tinhLuong();
        }
        luongTrungBinh = tongLuong / soNhanVien;

        for (int i = 0; i < soNhanVien; i++) {
            if (NHANVIEN[i].tinhLuong() <= luongTrungBinh) {
                System.out.println(NHANVIEN[i].toString());
            }
        }
    }

}
