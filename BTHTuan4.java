import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- NHẬP THÔNG TIN BAN ĐẦU ---
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // --- BÀI 1: Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ ---
        System.out.println("\n--- BÀI 1: KIỂM TRA TÍNH HỢP LỆ ---");
        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("- Lỗi: Đơn giá phải lớn hơn 0!");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("- Lỗi: Số lượng không được âm!");
            hopLe = false;
        }
        // Giả sử năm xuất bản hợp lệ là từ năm 1900 đến năm hiện tại 2026
        if (namXuatBan < 1900 || namXuatBan > 2026) {
            System.out.println("- Lỗi: Năm xuất bản không hợp lệ!");
            hopLe = false;
        }

        if (hopLe) {
            System.out.println("-> Thông tin sách hợp lệ!");
        }

        // --- BÀI 2: Phân loại giá ---
        System.out.println("\n--- BÀI 2: PHÂN LOẠI GIÁ ---");
        if (donGia < 50000) {
            System.out.println("Phân loại: Sách giá thấp");
        } else if (donGia <= 100000) {
            System.out.println("Phân loại: Sách giá trung bình");
        } else if (donGia <= 200000) {
            System.out.println("Phân loại: Sách giá cao");
        } else {
            System.out.println("Phân loại: Sách giá đặc biệt");
        }

        // --- BÀI 3: Phân loại tồn kho dựa vào số lượng ---
        System.out.println("\n--- BÀI 3: PHÂN LOẠI TỒN KHO ---");
        if (soLuong == 0) {
            System.out.println("Tình trạng kho: Hết sách[cite: 5]");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Tình trạng kho: Sắp hết[cite: 5]");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Tình trạng kho: Còn ít[cite: 5]");
        } else {
            System.out.println("Tình trạng kho: Còn nhiều[cite: 5]");
        }

        // --- BÀI 4: Dùng switch chọn loại sách ---
        System.out.println("\n--- BÀI 4: CHỌN LOẠI SÁCH ---");
        System.out.println("1. Sách giáo khoa[cite: 5]");
        System.out.println("2. Sách tham khảo[cite: 5]");
        System.out.println("3. Sách chuyên ngành[cite: 5]");
        System.out.println("4. Sách khác[cite: 5]");
        System.out.print("Mời bạn chọn loại sách (1-4): ");
        int chonLoai = sc.nextInt();

        switch (chonLoai) {
            case 1:
                System.out.println("-> Loại sách: Sách giáo khoa[cite: 5]");
                break;
            case 2:
                System.out.println("-> Loại sách: Sách tham khảo[cite: 5]");
                break;
            case 3:
                System.out.println("-> Loại sách: Sách chuyên ngành[cite: 5]");
                break;
            case 4:
                System.out.println("-> Loại sách: Sách khác[cite: 5]");
                break;
            default:
                System.out.println("-> Lựa chọn loại sách không hợp lệ!");
        }

        sc.close();
    }
}