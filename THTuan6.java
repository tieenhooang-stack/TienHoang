import java.util.ArrayList;
import java.util.Scanner;

public class THTuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BÀI 1:

        System.out.println("========== BÀI 1: MẢNG CỐ ĐỊNH int[] soLuong ==========");
        int[] soLuong = new int[5];
        int tongSoLuongBai1 = 0;

        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhập số lượng cuốn sách thứ " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
            tongSoLuongBai1 += soLuong[i];
        }

        int maxSoLuong = soLuong[0];
        System.out.print("Danh sách số lượng vừa nhập: ");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print(soLuong[i] + " ");
            if (soLuong[i] > maxSoLuong) {
                maxSoLuong = soLuong[i];
            }
        }
        System.out.println("\n-> Tổng số lượng (Bài 1): " + tongSoLuongBai1);
        System.out.println("-> Số lượng lớn nhất: " + maxSoLuong);

        ArrayList<String> danhSachSach = new ArrayList<>();
        int luaChon;
        sc.nextLine();

        do {
            System.out.println("\n========== MENU BÀI 4 - QUẢN LÝ SÁCH (ARRAYLIST) ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa sách theo mã");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Mời bạn chọn chức năng (1-8): ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:

                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine().trim();
                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine().trim();
                    System.out.print("Nhập đơn giá: ");
                    double gia = sc.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int sl = sc.nextInt();
                    sc.nextLine();


                    String thongTin = ma + "," + ten + "," + gia + "," + sl;
                    danhSachSach.add(thongTin);
                    System.out.println("-> Thêm sách thành công!");
                    break;

                case 2:
                    // 2.
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Kho sách đang trống!");
                    } else {
                        System.out.println("\n--- DANH SÁCH TẤT CẢ CÁC SÁCH ---");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] mang = danhSachSach.get(i).split(",");
                            System.out.println((i + 1) + ". Mã: " + mang[0]
                                    + " | Tên: " + mang[1]
                                    + " | Đơn giá: " + mang[2]
                                    + " | Số lượng: " + mang[3]);
                        }
                    }
                    break;

                case 3:

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Kho sách đang trống, không thể tìm!");
                    } else {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String maTim = sc.nextLine().trim();
                        boolean timThay = false;

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] mang = danhSachSach.get(i).split(",");
                            if (mang[0].equalsIgnoreCase(maTim)) {
                                System.out.println("-> Tìm thấy: Mã: " + mang[0]
                                        + " | Tên: " + mang[1]
                                        + " | Đơn giá: " + mang[2]
                                        + " | Số lượng: " + mang[3]);
                                timThay = true;
                                break;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Không tìm thấy cuốn sách nào có mã: " + maTim);
                        }
                    }
                    break;

                case 4:

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Kho sách đang trống, không thể xóa!");
                    } else {
                        System.out.print("Nhập mã sách cần xóa: ");
                        String maXoa = sc.nextLine().trim();
                        boolean daXoa = false;

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] mang = danhSachSach.get(i).split(",");
                            if (mang[0].equalsIgnoreCase(maXoa)) {
                                danhSachSach.remove(i);
                                daXoa = true;
                                System.out.println("-> Đã xóa thành công sách có mã: " + maXoa);
                                break;
                            }
                        }
                        if (!daXoa) {
                            System.out.println("Không tìm thấy mã sách để xóa!");
                        }
                    }
                    break;

                case 5:

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Kho sách đang trống, không có sách để sửa!");
                    } else {
                        System.out.print("Nhập mã sách cần sửa: ");
                        String maSua = sc.nextLine().trim();
                        boolean daSua = false;

                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] mang = danhSachSach.get(i).split(",");
                            if (mang[0].equalsIgnoreCase(maSua)) {
                                System.out.println("Đang sửa sách: " + mang[1]);
                                System.out.print("Nhập tên sách mới: ");
                                String tenMoi = sc.nextLine().trim();
                                System.out.print("Nhập đơn giá mới: ");
                                double giaMoi = sc.nextDouble();
                                System.out.print("Nhập số lượng mới: ");
                                int slMoi = sc.nextInt();
                                sc.nextLine();


                                danhSachSach.set(i, mang[0] + "," + tenMoi + "," + giaMoi + "," + slMoi);
                                daSua = true;
                                System.out.println("-> Sửa thông tin sách thành công!");
                                break;
                            }
                        }
                        if (!daSua) {
                            System.out.println("Không tìm thấy mã sách cần sửa!");
                        }
                    }
                    break;

                case 6:

                    int tongSL = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] mang = danhSachSach.get(i).split(",");
                        tongSL += Integer.parseInt(mang[3]);
                    }
                    System.out.println("-> Tổng số lượng sách trong kho: " + tongSL);
                    break;

                case 7:

                    double tongGiaTri = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] mang = danhSachSach.get(i).split(",");
                        double g = Double.parseDouble(mang[2]);
                        int s = Integer.parseInt(mang[3]);
                        tongGiaTri += (g * s);
                    }
                    System.out.printf("-> Tổng giá trị sách: %,.2f VNĐ\n", tongGiaTri);
                    break;

                case 8:
                    System.out.println("Đã thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại từ 1 đến 8!");
            }
        } while (luaChon != 8);

        sc.close();
    }
}