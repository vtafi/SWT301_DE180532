
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import taitv.example.AccountService;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    AccountService service;

    @BeforeEach
    public void setUp() {
        service = new AccountService();
    }

    @Test
    public void testRegisterAccountFromCSV() throws IOException {
        Path inputPath = Paths.get("src/test/java/test-data.csv");
        Path outputPath = Paths.get("src/test/java/UnitTest");

        List<String> lines = Files.readAllLines(inputPath);
        List<String> outputLines = new ArrayList<>();
        outputLines.add("username,password,email,expected,actual,result");

        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            String username = parts[0];
            String password = parts[1];
            String email = parts[2];
            boolean expected = Boolean.parseBoolean(parts[3]);

            boolean actual = service.registerAccount(username, password, email);
            boolean passed = actual == expected;

            outputLines.add(String.format("%s,%s,%s,%s,%s,%s",
                    username, password, email, expected, actual, passed ? "PASS" : "FAIL"));

            assertEquals(expected, actual, "Failed test case at line " + (i + 1));
        }

        Files.write(outputPath, outputLines);
    }
}
