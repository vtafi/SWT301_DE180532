package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class CatchGenericExceptionExample {
    private static final Logger logger = LoggerFactory.getLogger(CatchGenericExceptionExample.class);
    // Khởi tạo random để tạo dữ liệu test
    private static final Random random = new Random();

    public static void main(String[] args) {
        try {
            // Gọi hàm test để sử dụng tới null trong code
            String s = getPossibleNull(); // Hàm này trả về null hoặc text

            if (s != null) {
                logger.info("String length: {}", s.length());
            } else {
                logger.warn("String is null, cannot get length");
            }
        } catch (NullPointerException e) {
            logger.error("NullPointerException occurred: {}", e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error occurred: {}", e.getMessage(), e);
        }
    }

    private static String getPossibleNull() {
        String[] possibleValues = {"Hello World", "Java String", "Possible Null/null", null};
        return possibleValues[random.nextInt(possibleValues.length)];
    }
}