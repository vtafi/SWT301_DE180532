package taitv.example;

import java.util.regex.Pattern;

public class AccountService {

    public boolean registerAccount(String username, String password, String email) {
        return isValidUsername(username) && isValidPassword(password) && isValidEmail(email);
    }

    public boolean isValidEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w+$";
        return email != null && Pattern.matches(regex, email);
    }

    public boolean isValidPassword(String password) {
        return password != null && password.length() > 6;
    }

    public boolean isValidUsername(String username) {
        return username != null && !username.trim().isEmpty();
    }
}
