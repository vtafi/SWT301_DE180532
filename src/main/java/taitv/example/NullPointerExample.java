package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullPointerExample {
    // Tạo logger cho lớp này
    private static final Logger logger = LoggerFactory.getLogger(NullPointerExample.class);

    public static void main(String[] args) {
        // Gọi hàm test để get null từ hàm null public khác
        String text = getRandomString(); // Hàm này trả về null hoặc text

        // Kiểm tra null trước khi gọi isEmpty() để tránh NullPointerException
        if (text != null && !text.isEmpty()) {
            // Thay thế System.out.println bằng logger
            logger.info("Text is not empty");
        } else {
            // Thay thế System.out.println bằng logger
            logger.warn("Text is null or empty");
        }
    }

    // Hàm lấy text null hoặc khác null
    private static String getRandomString() {
        // Trả về null hoặc một chuỗi khác tùy chọn
        return Math.random() > 0.5 ? "Hello World" : null;
    }
}