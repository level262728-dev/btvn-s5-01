import java.util.Scanner;

public class TimTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chuỗi văn bản từ người dùng
        System.out.print("Nhập chuỗi văn bản: ");
        String text = scanner.nextLine();

        // 2. Nhập từ cần tìm
        System.out.print("Nhập từ cần tìm: ");
        String targetWord = scanner.nextLine();

        // 3. Sử dụng indexOf() để tìm vị trí xuất hiện đầu tiên của từ trong chuỗi
        int index = text.indexOf(targetWord);

        // 4. Kiểm tra và hiển thị kết quả
        if (index != -1) {
            System.out.println("Từ \"" + targetWord + "\" xuất hiện tại vị trí " + index + " trong chuỗi.");
        } else {
            System.out.println("Không tìm thấy từ \"" + targetWord + "\" trong chuỗi.");
        }

        scanner.close();
    }
}