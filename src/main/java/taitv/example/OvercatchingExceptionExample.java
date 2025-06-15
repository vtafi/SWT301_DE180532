package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OvercatchingExceptionExample {
    // Tạo logger cho lớp này
    private static final Logger logger = LoggerFactory.getLogger(OvercatchingExceptionExample.class);

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            // Cố tình truy cập ngoài phạm vi
            logger.info("Attempting to access array element at index 10");

            // Gọi lỗi để test và sử dụng System.out.println
            logger.info("Array element at index 10: {} " , arr[10]); // Cố gây ra lỗi

        } catch (ArrayIndexOutOfBoundsException e) {
            // Thay thế System.out.println bằng logger với vấn đề
            logger.error("Error occurred: Array index out of bounds. Message: {}", e.getMessage());
        } catch (RuntimeException e) {
            // Catch các lỗi RuntimeException nào khác
            logger.error("Error occurred: {}", e.getMessage());
        }
    }
}
