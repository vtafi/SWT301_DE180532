package taitv.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);
    // Đặt name và age là private để đảm bảo tính đóng gói
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức truy cập name (getter)
    public String getName() {
        return name;
    }

    // Phương thức truy cập age (getter)
    public int getAge() {
        return age;
    }

    // Phương thức display để gọi logger thay vì System.out.println
    public void display() {
        // Gọi logger để in thông tin thay vì System.out.println
        logger.info("Name: {}, Age: {}", name, age);
    }
}
