package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnreachableCodeExample {
    // Tạo logger cho lớp này
    private static final Logger logger = LoggerFactory.getLogger(UnreachableCodeExample.class);

    public static int getNumber() {
        // Gọi log trước return để mã không chết khi return
        logger.info("Executing the number: 42");
        return 42;
    }

    public static void main(String[] args) {
        // Thay thế System.out.println bằng logger
        logger.info("The number is: {}", getNumber());
    }
}
