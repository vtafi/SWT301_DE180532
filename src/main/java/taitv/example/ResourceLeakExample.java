package taitv.example;

import java.io.*;
import java.util.logging.Logger;

public class ResourceLeakExample {
    // Tạo logger cho lớp này
    private static final Logger logger = Logger.getLogger(ResourceLeakExample.class.getName());

    public static void main(String[] args) {
        // Sử dụng try-with-resources để tráng rò rỉ tài nguyên
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logger.info(line); // Thay thế System.out.println bằng logger
            }
        } catch (IOException e) {
            logger.severe("Error reading file: " + e.getMessage()); // Ghi lỗi vào file
        }
    }
}